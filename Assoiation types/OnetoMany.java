// one to Many (one Department has many employees)
import java.util.*;
class Employee{
    int empId;
    String empName;
    int salary;

    Employee(int empId, String empName, int salary){
        this.empId=empId;
        this.empName=empName;
        this.salary=salary;
    }
}
class Department{
    int deptId;
    String deptName;
    List<Employee> employees;

    Department(int deptId, String deptName, List<Employee> employees){
        this.deptId=deptId;
        this.deptName=deptName;
        this.employees=employees;
    }
}
public class OnetoMany {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of departments:");
        int n=sc.nextInt();
        Department deptArr[]=new Department[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter department id:");
            int deptId=sc.nextInt();
            System.out.println("Enter department name:");
            String deptName=sc.next();
            System.out.println("Enter number of employees in this department:");
            int empCount=sc.nextInt();
            List<Employee> empList=new ArrayList<>();
            for(int j=0;j<empCount;j++){
                System.out.println("Enter employee id:");
                int empId=sc.nextInt();
                System.out.println("Enter employee name:");
                String empName=sc.next();
                System.out.println("Enter employee salary:");
                int salary=sc.nextInt();
                empList.add(new Employee(empId,empName,salary));
            }
            deptArr[i]=new Department(deptId,deptName,empList);
        }
    }
}
