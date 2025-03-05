package ThuHanh;

public class BaseEmployee implements Employee {
    private double baseSalary;

    public BaseEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }

    @Override
    public String getDescription() {
        return "Nhân viên thường";
    }
}
