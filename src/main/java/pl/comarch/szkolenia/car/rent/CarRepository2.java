package pl.comarch.szkolenia.car.rent;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CarRepository2 implements ICarRepository {
    private final List<Car> cars = new ArrayList<>();

    public CarRepository2() {
        System.out.println("Konstruktor - nowa implementacja");
        this.cars.add(new Car("BMW", "3", false, "KR11"));
        this.cars.add(new Car("Audi", "A5", false, "KR22"));
        this.cars.add(new Car("Toyota", "Corolla", false, "KR33"));
        this.cars.add(new Car("Kia", "Ceed", false, "KR44"));
    }

    @Override
    public List<Car> getCars() {
        System.out.println("getCars - nowa implementacja");
        return cars;
    }

    @Override
    public boolean rentCar(final String plate) {
        System.out.println("rentCar - nowa implementacja");
        Optional<Car> carBox = this.cars.stream()
                .filter(c -> c.getPlate().equals(plate))
                .filter(c -> !c.isRent())
                .findFirst();
        if(carBox.isPresent()) {
            carBox.get().setRent(true);
            return true;
        }
        return false;
    }
}
