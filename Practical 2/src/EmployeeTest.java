import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) {
        // Initializing Scanner object
        Scanner input = new Scanner(System.in);

        //My employee variables:
        String name1 = "Ofentse";
        String surname1 = "Pitso";
        double salary1 = 24000.78;

        //Second employee variables:
        String name2 = "Rhulani";
        String surname2 = "Motshoane";
        double salary2 = 10000.78;


        // My employee objects:
        Employee employee1 = new Employee(name1, surname1, salary1);
        Employee employee2 = new Employee(name2, surname2, salary2);

        // Each employee's yearly salary
        System.out.println(employee1.getName()+" "+employee1.getSurname() +" earns "+ (employee1.getSalary()*12) + " annualy. \n");
        System.out.println(employee2.getName()+" "+employee2.getSurname() +" earns "+ (employee2.getSalary()*12) + " annualy. \n");

        // Salary after increase
        double new_salary1 = employee1.getSalary() * 0.10;
        double new_salary2 = employee2.getSalary() * 0.10;
        System.out.println("After a 10% increase "+ employee1.getName()+" "+employee1.getSurname() +" earns "+ ((employee1.getSalary()+ new_salary1)*12) + " annualy. \n");
        System.out.println("After a 10% increase "+employee2.getName()+" "+employee2.getSurname() +" earns "+ ((employee2.getSalary()+ new_salary2)*12) + " annualy. \n");
    }
}
