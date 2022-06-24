public class Employee {
    protected String id;
    protected String name;
    protected String phone;
    protected String email;
    protected Float coefficientsSalary;
    protected int employeeType;

    public Employee() {
    }

    public Employee(String id, String name, String phone, String email, Float coefficientsSalary, int employeeType) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.coefficientsSalary = coefficientsSalary;
        this.employeeType = employeeType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(Float coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public int getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
    }

    public void input() {
        System.out.println("Enter ID:");
        String id = Validation.checkInputString();
        setId(id);
        System.out.println("Enter Name:");
        String name = Validation.checkInputString();
        setName(name);
        System.out.println("Enter Phone number:");
        String phone = Validation.checkInputPhone();
        setPhone(phone);
        System.out.println("Enter email:");
        String email = Validation.checkInputEmail();
        setEmail(email);
        System.out.println("Enter Salary:");
        float coefficientsSalary = Validation.checkInputFloat();
        setCoefficientsSalary(coefficientsSalary);
    }

    public void display() {
        System.out.printf("\n%-10s%-10s%-15s%-15s%-10.2f", getId(), getPhone(), getName(), getEmail(),
                getCoefficientsSalary());
    }

    public float calSalary() {
        return 0;
    }

}