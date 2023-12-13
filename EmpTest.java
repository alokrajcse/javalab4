import java.util.Scanner;
public class Employee {


    private String empName;
    private String empNo;
    private int dependentCnt;

    Employee(String name,String eno, int depcnt)
    {


        this.empName=name;
        this.empNo=eno;
        this.dependentCnt=depcnt;


    }
    void showEmpDetails()
    {
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee NO: "+empNo);


    }
    

    int depCount()
    {

        return dependentCnt;
    }
}

//LAB QUES1

 

class EmpTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Enter employee name: ");
            String name = scanner.next();

            System.out.print("Enter employee number: ");
            String eno = scanner.next();

            System.out.print("Enter number of dependents: ");
            int depCnt = scanner.nextInt();

            employees[i] = new Employee(name, eno, depCnt);
        }


        for(int i=0;i<n;i++)
        {
            if(employees[i].depCount()>2)
            {
                employees[i].showEmpDetails();
            }
        }
    }

}



