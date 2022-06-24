public class Doctor extends Employee {
    private int level;
    private String major;
    private int positionAllowance;

    public Doctor() {
    };

    public Doctor(String id, String name, String phone, String email, Float coefficientsSalary, int employeeType,
            int level, String major, int positionAllowance) {
        super(id, name, phone, email, coefficientsSalary, employeeType);
        this.level = level;
        this.major = major;
        this.positionAllowance = positionAllowance;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getPositionAllowance() {
        return positionAllowance;
    }

    public void setPositionAllowance(int positionAllowance) {
        this.positionAllowance = positionAllowance;
    }

    public void input() {
        super.input();
        super.setEmployeeType(1);
        System.out.println("Enter level:");
        int level = Validation.checkInputInteger();
        setLevel(level);
        System.out.println("Enter major:");
        String major = Validation.checkInputString();
        setMajor(major);
        System.out.println("Enter position allowance:");
        int positionAllowance = Validation.checkInputInteger();
        setPositionAllowance(positionAllowance);
    }

    public void display() {
        super.display();
        System.out.printf("\t%-10d%-10s%-10d", getLevel(), getMajor(), getPositionAllowance());
    }

    @Override
    public float calSalary() {
        float salaryDoctor = (getCoefficientsSalary() * 1650000) + getPositionAllowance();
        return salaryDoctor;
    }

}
