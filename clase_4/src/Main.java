public class Main {
    public static void main(String[] args) {
        Car camaro = new Car("Chevrolet", "Camaro", 2019);
        Car corvette = new Car("Chevrolet", "Corvette");
        Car astra = new Car("Chevrolet");

        System.out.println("Car: "+ camaro.toString());
        System.out.println("Car: "+ corvette.toString());
        System.out.println("Car: "+ astra.toString());
    }
}