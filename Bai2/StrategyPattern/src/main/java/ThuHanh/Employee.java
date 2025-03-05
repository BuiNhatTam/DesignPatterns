package ThuHanh;

public class Employee {
    private double baseSalary;
    private AllowanceStrategy allowanceStrategy;

    public Employee(double baseSalary, AllowanceStrategy allowanceStrategy) {
        this.baseSalary = baseSalary;
        this.allowanceStrategy = allowanceStrategy;
    }

    public double getTotalSalary() {
        return baseSalary + allowanceStrategy.getAllowance();
    }

    public void displayInfo() {
        System.out.println("Nhân viên: " + allowanceStrategy.getPositionName());
        System.out.println("Lương cơ bản: " + baseSalary);
        System.out.println("Phụ cấp: " + allowanceStrategy.getAllowance());
        System.out.println("Tổng thu nhập: " + getTotalSalary());
    }
}
