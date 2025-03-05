package ThuHanh;

public class DepartmentManagerAllowance extends AllowanceDecorator {
    public DepartmentManagerAllowance(Employee employee) {
        super(employee);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 3000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Phụ cấp Trưởng phòng";
    }
}
