package ThuHanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        double baseSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Nhập chức vụ (tiến sĩ, tổ trưởng, trưởng phòng): ");
        String position = scanner.nextLine();

        PositionState positionState;
        switch (position.toLowerCase()) {
            case "tiến sĩ":
                positionState = new Doctor();
                break;
            case "tổ trưởng":
                positionState = new TeamLeader();
                break;
            case "trưởng phòng":
                positionState = new DepartmentManager();
                break;
            default:
                positionState = new DefaultPosition(); // Lambda cho trạng thái mặc định
        }

        Employee emp = new Employee(name, baseSalary, positionState);
        emp.displaySalary();

        scanner.close();
    }
}