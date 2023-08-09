package pl.comarch.szkolenia.car.rent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class GUI implements IGUI {
    private ICarRepository carRepository;
    private final Scanner scanner = new Scanner(System.in);

    public GUI(@Autowired ICarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public String showMenu() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");
        return this.scanner.nextLine();
    }

    @Override
    public void listCars() {
        carRepository.getCars().forEach(System.out::println);
    }

    @Override
    public String readPlate() {
        System.out.println("Enter plate:");
        return this.scanner.nextLine();
    }

    @Override
    public void showRentResult(boolean result) {
        System.out.println(result ? "Success !!!" : "Error !!!");
    }
}
