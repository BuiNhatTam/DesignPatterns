package ThuHanh;

import java.util.ArrayList;
import java.util.List;

public class Stock implements IObservable {
    private String symbol;
    private double price;
    private List<IObserver> observers = new ArrayList<>();

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        System.out.println("Giá cổ phiếu " + symbol + " thay đổi: " + price);
        notifyObservers();
    }

    @Override
    public void attach(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(price);
        }
    }
}


//import java.util.List;
//import java.util.ArrayList;
//
//public class Stock {
//    private String symbol;
//    private double price;
//    private List<Investor> investors = new ArrayList<>();
//
//    public Stock(String symbol, double price) {
//        this.symbol = symbol;
//        this.price = price;
//    }
//
//    public void setPrice(double newPrice) {
//        this.price = newPrice;
//        System.out.println(" Giá cổ phiếu " + symbol + " thay đổi: " + price);
//        notifyInvestors();
//    }
//
//    public void addInvestor(Investor investor) {
//        investors.add(investor);
//    }
//
//    public void removeInvestor(Investor investor) {
//        investors.remove(investor);
//    }
//
//    private void notifyInvestors() {
//        for (Investor investor : investors) {
//            investor.receiveNotification(symbol, price);
//        }
//    }
//}
//
