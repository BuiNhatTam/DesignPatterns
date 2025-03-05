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

        // Khởi tạo nhân viên
        Employee employee = new BaseEmployee(baseSalary);

        // Thêm phụ cấp dựa trên chức vụ
        switch (position) {
            case "tiến sĩ":
                employee = new DoctorAllowance(employee);
                break;
            case "tổ trưởng":
                employee = new TeamLeaderAllowance(employee);
                break;
            case "trưởng phòng":
                employee = new DepartmentManagerAllowance(employee);
                break;
            default:
                System.out.println("Không có phụ cấp cho chức vụ này.");
        }

        // Hiển thị kết quả
        System.out.println("Nhân viên: " + employee.getDescription());
        System.out.println("Tổng thu nhập: " + employee.getSalary());

        scanner.close();
    }
}
