import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nWELCOME TO EMPLOYEE MANAGEMENT");
            System.out.println("1. Create");
            System.out.println("2. View all employee information");
            System.out.println("3. View the employee's information has the highest total salary");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            System.out.print("Enter your choice:");
            choice = Validation.checkInputLimit(1, 5);
            switch (choice) {
                case 1:
                    System.out.println("Choose the type Employee");
                    System.out.println("1.Create doctor");
                    System.out.println("2.Create nurse");
                    System.out.println("Enter type:");
                    int typeCre = Validation.checkInputLimit(1, 2);
                    employeeList.createEmployee(typeCre);
                    break;
                case 2:
                    if (employeeList.getEmployees().isEmpty()) {
                        System.out.println("The list is empty! Please add a employee");
                    } else {
                        employeeList.getEmployee();
                    }
                    break;
                case 3:

                    if (employeeList.getEmployees().isEmpty()) {
                        System.out.println("The list is empty! Please add a employee");
                    } else {
                        employeeList.getHighestSalary();
                    }
                    break;
                case 4:
                    if (employeeList.getEmployees().isEmpty()) {
                        System.out.println("The list is empty! Please add a employee");
                    } else {
                        System.out.println("Enter empployeeType to search:");
                        int type = Validation.checkInputLimit(1, 2);
                        System.out.println("Enter Name to search:");
                        String name = Validation.checkInputString();
                        employeeList.searchEmployees(type, name);
                    }

                    break;
                case 5:
                    System.out.println("Exit program success!");
                    System.exit(0);
                    break;
            }
        } while (choice != 5);

    }
}
