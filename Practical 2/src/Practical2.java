public class Practical2 {

    // Question 1 instances:
    private Double distance;
    private Double speed;

    public double timeTravelled( Double distance, Double speed){
        this.distance = distance;
        this.speed = speed;
        double time = distance/speed;
        return time;
    }
}
