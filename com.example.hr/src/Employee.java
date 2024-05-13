public class Employee
{
    private string name;
    private int id;
    private double salary;
    public Employee(string name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
public string getname(){
        return name;
}
public int get id(){
        return id;
}
public double getsalary(){
        return salary;
}
public void printName(){
        system.out.println("Employee Name:" + name);
}
public void printSalary(){
        system.out.println("Employee Salary: $" + salary);
}

}
