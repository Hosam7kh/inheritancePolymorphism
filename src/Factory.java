public class Factory {
    private final Employee[] emps;
    private int numOfEmps;
    private final int MAX_EMPS = 100;
    private int workersNum;

    public Factory() {
        this.emps = new Employee[MAX_EMPS];
        this.numOfEmps = 0;
    }

    public boolean addEmployee(Employee e){
        if(numOfEmps <= 100){
            emps[MAX_EMPS - (MAX_EMPS - numOfEmps)] = e;
            numOfEmps++;
            return true;
        }
        return false;
    }

    public int numOfWorkers(){
        for(int i = 0 ; i < numOfEmps ; i++)
            if (emps[i] instanceof Worker)
                workersNum++;
        return workersNum;
    }

    public Manager mostManager(){
        for(int i = 0 ; i < numOfEmps ; i++){
            if(emps[i] instanceof Manager){
                int max = ((Manager) emps[i]).getNumOfWorkers();
                for(int j = i ; j < numOfEmps ; j++){
                    if(emps[j] instanceof Manager){
                        if(((Manager) emps[j]).getNumOfWorkers() > max){
                            max = ((Manager) emps[j]).getNumOfWorkers();
                        }
                    }
                }
                if(max == ((Manager) emps[i]).getNumOfWorkers()){
                    return (Manager) emps[i];
                }
            }
        }
        return null;
    }

    public Worker minHours(){
        for(int i = 0 ; i < numOfEmps ; i++){
            if(emps[i] instanceof Worker){
                double min = ((Worker) emps[i]).getHours();
                for(int j = i ; j < numOfEmps ; j++){
                    if(emps[j] instanceof Worker){
                        if(((Worker) emps[j]).getHours() < min){
                            min = ((Worker) emps[j]).getHours();
                        }
                    }
                }
                if(min == ((Worker) emps[i]).getHours()){
                    return (Worker) emps[i];
                }
            }
        }
        return null;
    }

    public Employee maxSalary(){
        double maxSalary = emps[0].salary();
        for(int i = 0 ; i < numOfEmps ; i ++){
            for(int j = 0 ; j < numOfEmps ; j++){
                if(emps[j].salary() > maxSalary){
                    maxSalary = emps[j].salary();
                }
            }
            if(maxSalary == emps[i].salary()){
                return emps[i];
            }
        }
        return null;
    }

    public Employee getByName(String eName){
        for(int i = 0 ; i < numOfEmps ; i++){
            if(eName == emps[i].getName()){
                return emps[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String allData = "";
        for(int i = 0 ; i < numOfEmps ; i++){
            allData += emps[i] + "\n";
        }
        return "Workers in factory:\n" + allData;
    }

    public double salaryByName(String eName){
        for(int i = 0 ; i < numOfEmps ; i++)
            if(eName == emps[i].getName())
                return emps[i].salary();


        return 0;
    }
}
