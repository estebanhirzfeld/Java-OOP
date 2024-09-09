import Worker.Worker;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Worker employee_1 = new Worker("Tony Montana", LocalDate.of(2020,1,1), 10000);

        System.out.println("Nombre" + employee_1.getFullName());
        System.out.println("Años de experiencia" + employee_1.getWorkingYears());
    }


}