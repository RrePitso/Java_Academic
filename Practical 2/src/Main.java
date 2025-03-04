import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Initializing Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the distance travelled(meters): ");
        double distance = input.nextDouble();

        System.out.println("Enter the speed at which you are travelling(m/s): ");
        double speed = input.nextDouble();

        // Initializing Practical2 object for computing time travelled
        Practical2 timeTravelled = new Practical2();
        double time = distance/speed;
        System.out.println("With a speed of "+ speed + " travelling for "+distance+" you will get there in "+ time+" seconds");

        }
    }

