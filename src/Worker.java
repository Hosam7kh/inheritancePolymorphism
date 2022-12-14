public class Worker extends Employee{
    private double wagePerHour;
    private double hours;

    public Worker(String name, double wage){
        super(name);
        this.wagePerHour = wage;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public String toString(){
        return "name: " + name + ", wage = " + salary() + ", hours = " + hours;
    }

    @Override
    public double salary(){
        return hours * wagePerHour;
    }
}
