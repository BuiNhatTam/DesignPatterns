package ThuHanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập lương cơ bản
        System.out.print("Nhập lương cơ bản: ");
        double baseSalary = scanner.nextDouble();
        scanner.nextLine(); // Bỏ qua ký tự xuống dòng

        // Nhập chức vụ
        System.out.print("Nhập chức vụ (tiến sĩ, tổ trưởng, trưởng phòng): ");
        String position = scanner.nextLine().toLowerCase();

        // Chọn chiến lược phụ cấp
        AllowanceStrategy strategy;
        switch (position) {
            case "tiến sĩ":
                strategy = new DoctorAllowanceStrategy();
                break;
            case "tổ trưởng":
                strategy = new TeamLeaderAllowanceStrategy();
                break;
            case "trưởng phòng":
                strategy = new DepartmentManagerAllowanceStrategy();
                break;
            default:
                strategy = new NoAllowanceStrategy();
        }

        // Tạo nhân viên với chiến lược phù hợp
        Employee employee = new Employee(baseSalary, strategy);
        employee.displayInfo();

        scanner.close();
    }
}
