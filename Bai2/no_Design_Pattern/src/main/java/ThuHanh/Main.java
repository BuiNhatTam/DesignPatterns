package ThuHanh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên nhân viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập chức vụ: ");
        String position = scanner.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        double baseSalary = scanner.nextDouble();

        Employee emp = new Employee(name, position, baseSalary);
        emp.displaySalary();

        scanner.close();
    }}