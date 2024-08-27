package Ej1;

public class Employe {
        private String name;
        private String role;
        private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 0){
            System.out.println("Invalid name, try again");
        } else{
            this.name = name;
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        role = role.strip().toLowerCase();
        if (role == "gerente" || role == "desarrollador" || role == "analista"){
            role = role.substring(0, 1).toUpperCase() + role.substring(1);
            this.role = role;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
