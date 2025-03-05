package ThuHanh;

public class TeamLeaderAllowance extends AllowanceDecorator {
    public TeamLeaderAllowance(Employee employee) {
        super(employee);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + 1000;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Phụ cấp Tổ trưởng";
    }
}
