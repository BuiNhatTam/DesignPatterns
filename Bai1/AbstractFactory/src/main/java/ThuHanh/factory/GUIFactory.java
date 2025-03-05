package ThuHanh.factory;

import ThuHanh.components.Button;
import ThuHanh.components.TextField;

public interface GUIFactory {
    Button createButton();
    TextField createTextField();
}