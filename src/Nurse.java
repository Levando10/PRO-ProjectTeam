public class Nurse extends Employee {
    private String department;
    private int overtimeHours;

    public Nurse() {

    };

    public Nurse(String id, String name, String phone, String email, Float coefficientsSalary, int employeeType,
            String department, int overtimeHours) {
        super(id, name, phone, email, coefficientsSalary, employeeType);
        this.department = department;
        this.overtimeHours = overtimeHours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public void input() {
        super.input();
        super.setEmployeeType(2);
        System.out.println("Enter Deparment:");
        String department = Validation.checkInputString();
        setDepartment(department);
        System.out.println("Enter overtime hours:");
        int overtimeHours = Validation.checkInputInteger();
        setOvertimeHours(overtimeHours);
    }

    @Override
    public float calSalary() {
        float salaryNurse = (getCoefficientsSalary() * 1650000) + getOvertimeHours() * 200000;
        return salaryNurse;
    }

    public void display() {
        super.display();
        System.out.printf("\t%-10s%-10d", getDepartment(), getOvertimeHours());
    }

}