package pl.comarch.szkolenia.car.rent;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CarRepository implements ICarRepository {
    private final List<Car> cars = new ArrayList<>();

    public CarRepository() {
        this.cars.add(new Car("BMW", "3", false, "KR11"));
        this.cars.add(new Car("Audi", "A5", false, "KR22"));
        this.cars.add(new Car("Toyota", "Corolla", false, "KR33"));
        this.cars.add(new Car("Kia", "Ceed", false, "KR44"));
    }

    public CarRepository(int x) {
        ///?????
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public boolean rentCar(final String plate) {
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
