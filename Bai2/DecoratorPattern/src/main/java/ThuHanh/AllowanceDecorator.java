package ThuHanh;

public abstract class AllowanceDecorator implements Employee {
    protected Employee employee;

    public AllowanceDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public double getSalary() {
        return employee.getSalary();
    }

    @Override
    public String getDescription() {
        return employee.getDescription();
    }
}
