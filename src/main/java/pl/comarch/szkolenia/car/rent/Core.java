package pl.comarch.szkolenia.car.rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class Core implements ICore {
    @Autowired
    private ICarRepository carRepository;
    @Autowired
    private IGUI gui;
    @Autowired
    private IAuthenticator authenticator;

    Scanner scanner = new Scanner(System.in);

    @Override
    public void start() {
        System.out.println("Podaj login:");
        String login = scanner.nextLine();
        System.out.println("Podaj haslo:");
        String password = scanner.nextLine();
        boolean authResult = this.authenticator.authenticate(login, password);
        if(!authResult) {
            return;
        }
        mainloop:while(true) {
            switch (gui.showMenu()) {
                case "1":
                    gui.listCars();
                    break;
                case "2":
                    gui.showRentResult(carRepository.rentCar(gui.readPlate()));
                    break;
                case "3":
                    break mainloop;
                default:
                    System.out.println("Wrong choose !!");
                    break;
            }
        }
    }

    public void setCarRepository(ICarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void setGui(GUI gui) {
        this.gui = gui;
    }
}
