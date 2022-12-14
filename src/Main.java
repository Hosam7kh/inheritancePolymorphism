
public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker("worker1", 200);
        w1.setHours(6);
        Worker w2 = new Worker("worker2", 100);
        w2.setHours(2);
        Worker w3 = new Worker("worker3", 300);
        w3.setHours(4);
        Manager m1 = new Manager("manager1", 5000, 20);
        Manager m2 = new Manager("manager2", 5000, 40);
        Manager m3 = new Manager("manager3", 3000, 10);
        Manager m4 = new Manager("manager4", 10000, 30);
        System.out.println();

        Factory f = new Factory();
        f.addEmployee(w1);
        f.addEmployee(w2);
        f.addEmployee(w3);
        f.addEmployee(m1);
        f.addEmployee(m2);
        f.addEmployee(m3);
        f.addEmployee(m4);

        System.out.println("number of workers: " + f.numOfWorkers() + "\n");
        System.out.println("the best manager: " + f.mostManager() + "\n");
        System.out.println("the min hours worker: " + f.minHours() + "\n");
        System.out.println("max salary: " + f.maxSalary() + "\n");
        System.out.println("object by name: " + f.getByName("worker1") + "\n");
        System.out.println("toString: " + f + "\n");
        System.out.println("salary by name: " + f.salaryByName("manager4") + "\n");
    }
}