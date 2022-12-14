public class Manager extends Employee{
    private double wage;
    private int numOfWorkers;

    public Manager(String name, double wage, int workers){
        super(name);
        this.wage = wage;
        this.numOfWorkers = workers;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setNumOfWorkers(int numOfWorkers) {
        this.numOfWorkers = numOfWorkers;
    }

    public double getWage() {
        return wage;
    }

    public int getNumOfWorkers() {
        return numOfWorkers;
    }

    @Override
    public String toString(){
        return "Employee's name: " + name + ", wage = " + salary() + ", workers = " + numOfWorkers;
    }

    @Override
    public double salary(){
        if(numOfWorkers > 10){
            if(numOfWorkers > 10 && numOfWorkers <= 20)
                return wage + ((numOfWorkers - 10) * 50);
            else
                return wage + (((numOfWorkers - (numOfWorkers - 10)) * 50) + 500);
        }
        return wage;
    }
}
