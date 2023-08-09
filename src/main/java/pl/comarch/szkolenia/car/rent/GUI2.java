package pl.comarch.szkolenia.car.rent;

import org.springframework.stereotype.Component;

public class GUI2 implements IGUI {
    @Override
    public String showMenu() {
        return "1";
    }

    @Override
    public void listCars() {

    }

    @Override
    public String readPlate() {
        return null;
    }

    @Override
    public void showRentResult(boolean result) {

    }
}
