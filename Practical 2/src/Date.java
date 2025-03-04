public class Date {
    // Instance variables
    private int month, day, year;
    public Date(int month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Set methods for my instance variables
    public void setMonth(int month){
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Get methods for my instance variables


    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    public String displayDate(){
        return getMonth()+ "/" + getDay() + "/" + getYear();
    }
}
