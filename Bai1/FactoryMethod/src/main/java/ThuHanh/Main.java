package ThuHanh;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = BeverageFactory.createBeverage("coffee");
        coffee.serve();

        Beverage tea = BeverageFactory.createBeverage("tea");
        tea.serve();
    }}