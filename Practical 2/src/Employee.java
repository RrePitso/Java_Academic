public class Employee {
    // Instance variables:
    private String name, surname;
    private Double salary;

    public Employee(String name, String surname, double salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    // set methods for instance variables
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(double salary){
        if (salary>=0) {
            this.salary = salary;
        }
    }

    // get methods for instance variables
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Double getSalary() {
        return salary;
    }
}
