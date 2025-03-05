package ThuHanh;

public class Employee {
    private String name;
    private String position;
    private double baseSalary;

    public Employee(String name, String position, double baseSalary) {
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        double allowance = 0;
        switch (position.toLowerCase()) {
            case "tiến sĩ":
                allowance = 500;
                break;
            case "tổ trưởng":
                allowance = 300;
                break;
            case "trưởng phòng":
                allowance = 700;
                break;
            default:
                allowance = 0;
        }
        return baseSalary + allowance;
    }

    public void displaySalary() {
        System.out.println("Nhân viên: " + name);
        System.out.println("Chức vụ: " + position);
        System.out.println("Tổng lương: " + calculateSalary());
    }
}