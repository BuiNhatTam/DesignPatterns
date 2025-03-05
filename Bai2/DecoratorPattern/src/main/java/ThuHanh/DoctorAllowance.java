package ThuHanh;

public class DoctorAllowance extends AllowanceDecorator {
    public DoctorAllowance(Employee employee) {
        super(employee);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 2000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Phụ cấp Tiến sĩ";
    }
}
