package pl.comarch.szkolenia.car.rent;

public interface IGUI {
    String showMenu();
    void listCars();
    String readPlate();
    void showRentResult(boolean result);
}
