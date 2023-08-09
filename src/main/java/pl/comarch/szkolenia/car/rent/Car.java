package pl.comarch.szkolenia.car.rent;

public class Car {
    private String brand;
    private String model;
    private boolean rent;
    private String plate;

    public Car(String brand, String model, boolean rent, String plate) {
        this.brand = brand;
        this.model = model;
        this.rent = rent;
        this.plate = plate;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", rent=" + rent +
                ", plate='" + plate + '\'' +
                '}';
    }
}
