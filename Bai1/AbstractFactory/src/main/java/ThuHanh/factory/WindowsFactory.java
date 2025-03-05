package ThuHanh.factory;

import ThuHanh.components.Button;
import ThuHanh.components.TextField;
import ThuHanh.components.WindowsButton;
import ThuHanh.components.WindowsTextField;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}