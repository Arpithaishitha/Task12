import com.example.hr.Employee;
public class EmployeeTest
{
    public static void main(string[] args){
        //Create an Employee object
        Employee emp1 = new Employee("ishi", 1001, 50000.0);
        //Access fields using getters
        system.out.println("Employee ID: " + emp1.getId());
        emp1.printName();
        emp1.printSalary();
    }
}
