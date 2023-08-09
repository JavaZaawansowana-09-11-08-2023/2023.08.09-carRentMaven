package pl.comarch.szkolenia.car.rent;

import java.util.List;

public interface ICarRepository {
    List<Car> getCars();
    boolean rentCar(final String plate);
}
