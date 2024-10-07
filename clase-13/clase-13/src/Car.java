public class Car extends Vehicle {
    String name;

    public Car(String brand, int year, String model, String name) {
        super(brand, year, model);
        this.name = name;
    }
}
