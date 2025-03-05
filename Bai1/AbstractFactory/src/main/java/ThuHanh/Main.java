package ThuHanh;
import ThuHanh.components.*;
import ThuHanh.factory.*;

public class Main {
    public static void main(String[] args) {
        // Giả sử lấy thông tin từ hệ điều hành
        String os = "windows";  // Thay đổi thành "windows" để test Windows UI

        GUIFactory factory;

        if (os.equalsIgnoreCase("windows")) {
            factory = new WindowsFactory();
        } else if (os.equalsIgnoreCase("mac")) {
            factory = new MacFactory();
        } else {
            throw new IllegalArgumentException("Hệ điều hành không được hỗ trợ: " + os);
        }

        Button button = factory.createButton();
        TextField textField = factory.createTextField();

        button.paint();
        textField.render();
    }}