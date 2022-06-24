import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
    Scanner sc = new Scanner(System.in);
    ArrayList<Employee> employees = new ArrayList<Employee>();

    public EmployeeList() {
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void createEmployee(int type) {
        switch (type) {
            case 1:
                Doctor doctor = new Doctor();
                doctor.input();
                char c1;
                do {
                    System.out.println("Do you want to continue (Y/N)?");
                    c1 = sc.next().charAt(0);
                    if (c1 == 'Y' || c1 == 'y') {
                        employees.add(doctor);
                        createEmployee(1);
                        break;
                    } else if (c1 == 'N' || c1 == 'n') {
                        employees.add(doctor);
                        break;
                    } else {
                        System.out.println("Please type Y or N");
                    }
                } while (c1 != 'Y' || c1 != 'y' || c1 != 'N' || c1 != 'n');
                break;
            case 2:
                Nurse nurse = new Nurse();
                nurse.input();
                char c2;
                do {
                    System.out.println("Do you want to continue (Y/N)?");
                    c2 = sc.next().charAt(0);
                    if (c2 == 'Y' || c2 == 'y') {
                        employees.add(nurse);
                        createEmployee(2);
                        break;
                    } else if (c2 == 'N' || c2 == 'n') {
                        employees.add(nurse);
                        break;
                    } else {
                        System.out.println("Please type Y or N");
                    }
                } while (c2 != 'Y' || c2 != 'y' || c2 != 'N' || c2 != 'n');
                break;
        }
    }

    public void getEmployee() {
        System.out.println("\n======== Doctor ======");
        System.out.printf("%-10s%-10s%-15s%-15s%-10s%-10s%-10s%-10s\n", "Id", "Phone", "Name", "Email",
                "Coefficients Salary", "Level", "Major", "Position Allowance");
        for (Employee employee : employees) {
            if (employee.getEmployeeType() == 1) {
                employee.display();
            }
        }
        System.out.println("\n======== Nurse ======");
        System.out.printf("%-10s%-10s%-15s%-15s%-10s%-10s%-10s\n", "Id", "Phone", "Name", "Email",
                "Coefficients Salary", "Department", "Overtime Hours");
        for (Employee employee : employees) {
            if (employee.getEmployeeType() == 2) {
                employee.display();
            }
        }
    }

    public void getHighestSalary() {
        float maxSalaryDoctor = 0;
        float maxSalaryNurse = 0;
        float salaryDoctor;
        float salaryNurse;
        Employee doctor = new Employee();
        Employee nurse = new Employee();
        for (Employee employee : employees) {
            if (employee.getEmployeeType() == 1) {
                salaryDoctor = employee.calSalary();
                if (maxSalaryDoctor < salaryDoctor) {
                    maxSalaryDoctor = salaryDoctor;
                    doctor = employee;
                }
            } else if (employee.getEmployeeType() == 2) {
                salaryNurse = employee.calSalary();
                if (maxSalaryNurse < salaryNurse) {
                    maxSalaryNurse = salaryNurse;
                    nurse = employee;
                }
            }
        }
        System.out.println(
                "\n===================================================================================");
        System.out.println("\nDoctor have highest salary: ");
        doctor.display();
        System.out.print("\t" + maxSalaryDoctor);
        System.out.println("\n===================================================================================");
        System.out.println("\nNurse have highest salary: ");
        nurse.display();
        System.out.print("\t" + maxSalaryNurse);

    }

    public void searchEmployees(int employeeType, String name) {
        boolean flag = false;
        for (Employee employee : employees) {
            if (employee.getEmployeeType() == employeeType) {
                if (employee.getName().equals(name)) {
                    System.out.println(
                            "\n===================================================================================");
                    employee.display();
                    System.out.println(
                            "\n===================================================================================");
                    flag = true;
                    break;
                }
            }
        }
        if (!flag) {
            System.out.println("Not found!");
        }
    }
}