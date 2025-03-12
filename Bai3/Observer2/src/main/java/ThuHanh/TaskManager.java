package ThuHanh;

import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
public class TaskManager {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String taskId, String status) {
        for (Observer observer : observers) {
            observer.update(taskId, status);
        }
    }

    // Khi trạng thái task thay đổi, gọi notifyObservers()
    public void updateTaskStatus(String taskId, String status) {
        System.out.println("Task " + taskId + " cập nhật trạng thái: " + status);
        notifyObservers(taskId, status);
    }
}
