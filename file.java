 import java.io.*;
import java.util.Scanner;

public class file {
   

class Employee {

    private int empNo;
    private String empName;
    private int empBasic;

    Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    int getEmpNo() {
        return empNo;
    }

    String getEmpName() {
        return empName;
    }

    int getEmpBasic() {
        return empBasic;
    }
}

class WriteEmployee {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        int no = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        int basic = sc.nextInt();

        Employee e = new Employee(no, name, basic);

        FileWriter fw = new FileWriter("emp.txt");

        fw.write("Employee Number: " + e.getEmpNo() + "\n");
        fw.write("Employee Name: " + e.getEmpName() + "\n");
        fw.write("Basic Salary: " + e.getEmpBasic() + "\n");

        fw.close();

        System.out.println("\nData stored in file.");

        BufferedReader br = new BufferedReader(new FileReader("emp.txt"));

        String line;

        System.out.println("\nEmployee Details:");

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
}
