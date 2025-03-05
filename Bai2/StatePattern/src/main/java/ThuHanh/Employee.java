package ThuHanh;

public class Employee {
    private String name;
    private double baseSalary;
    private PositionState positionState;

    public Employee(String name, double baseSalary, PositionState positionState) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.positionState = positionState;
    }

    public double calculateSalary() {
        return baseSalary + positionState.getAllowance();
    }

    public void displaySalary() {
        System.out.println("Nhân viên: " + name);
        System.out.println("Chức vụ: " + positionState.getPositionName());
        System.out.println("Tổng lương: " + calculateSalary());
    }
}
