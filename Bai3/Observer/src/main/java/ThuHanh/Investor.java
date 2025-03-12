package ThuHanh;

public class Investor implements IObserver {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(" Nhà đầu tư " + name + " nhận thông báo: Giá cổ phiếu mới là " + price);
    }
}

//public class Investor {
//    private String name;
//
//    public Investor(String name) {
//        this.name = name;
//    }
//
//    public void receiveNotification(String stockSymbol, double newPrice) {
//        System.out.println("Nhà đầu tư " + name + " nhận thông báo: Cổ phiếu " + stockSymbol + " có giá mới: " + newPrice);
//    }
//}
