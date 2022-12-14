public abstract class Employee {
    String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "name: " + this.name;
    }

    public abstract double salary();
}
