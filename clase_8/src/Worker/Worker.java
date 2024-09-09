package Worker;

import java.time.LocalDate;

public class Worker {
    String fullName;
    LocalDate initialDate;
    double salary;

    public Worker(String fullName, LocalDate initialDate, double salary) {
        this.fullName = fullName;
        this.initialDate = initialDate;
        this.salary = salary;
    }

    public int getWorkingYears(){
        return LocalDate.now().getYear() - this.initialDate.getYear();
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int calcHolidays(){
        return 7 * this.getWorkingYears();
    }

    public int calcSalaryIncrease(){
        return 1000 * this.getWorkingYears();
    }

    public double calcSeverancePay(){
        return this.getSalary() * this.getWorkingYears();
    }

}
