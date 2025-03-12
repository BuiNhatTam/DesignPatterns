package ThuHanh;

public class Main {
    public static void main(String[] args) {
        // Tạo cổ phiếu
        Stock stock = new Stock("AAPL", 150.0);

        // Tạo nhà đầu tư
        Investor investor1 = new Investor("Tâm");
        Investor investor2 = new Investor("Linh");

        // Đăng ký nhà đầu tư vào danh sách theo dõi cổ phiếu
        stock.attach(investor1);
        stock.attach(investor2);

        // Thay đổi giá cổ phiếu
        stock.setPrice(155.5);
        stock.setPrice(160.2);

        // Hủy theo dõi của một nhà đầu tư
        stock.detach(investor1);
        stock.setPrice(165.0);

    }
}
//    public static void main(String[] args) {
//        // Tạo cổ phiếu
//        Stock stock = new Stock("AAPL", 150.0);
//
//        // Tạo nhà đầu tư
//        Investor investor1 = new Investor("Tâm");
//        Investor investor2 = new Investor("Linh");
//
//        // Thêm nhà đầu tư vào danh sách theo dõi cổ phiếu
//        stock.addInvestor(investor1);
//        stock.addInvestor(investor2);
//
//        // Thay đổi giá cổ phiếu
//        stock.setPrice(155.5);
//        stock.setPrice(160.2);
//
//        // Hủy theo dõi của một nhà đầu tư
//        stock.removeInvestor(investor1);
//        stock.setPrice(165.0);
//    }
//}
