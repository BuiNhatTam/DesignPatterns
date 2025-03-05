package ThuHanh;

public class BeverageFactory {
    public static Beverage createBeverage(String type) {
        if (type.equalsIgnoreCase("coffee")) {
            return new Coffee();
        } else if (type.equalsIgnoreCase("tea")) {
            return new Tea();
        } else {
            throw new IllegalArgumentException("Loại thức uống không hợp lệ: " + type);
        }
    }
}
