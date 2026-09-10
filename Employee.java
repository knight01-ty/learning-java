class Employee {

    double calculateSalary() {
        return 0;
    }
}

class Manager extends Employee {

    double calculateSalary() {
        return 50000;
    }
}

class Programmer extends Employee {

    double calculateSalary() {
        return 40000;
    }
}

class EmployeeDemo {

    public static void main(String[] args) {

        Employee e;

        e = new Manager();
        System.out.println("Manager Salary = " + e.calculateSalary());

        e = new Programmer();
        System.out.println("Programmer Salary = " + e.calculateSalary());
    }
}
