class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayCarInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturing Year: " + year);
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("TOYOTA", "Corolla", 2022);
        myCar.displayCarInfo();
    }
}
