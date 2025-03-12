package ThuHanh;

// Dev nhận thông báo khi task thay đổi
public class Developer implements Observer {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskId, String status) {
        System.out.println("Dev " + name + " nhận thông báo: Task " + taskId + " đã chuyển sang trạng thái " + status);
    }
}

// PM nhận thông báo khi task thay đổi

