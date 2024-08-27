import java.time.LocalDate;

public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.year = LocalDate.now().getYear();
    }

    public Car(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.year = LocalDate.now().getYear();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
