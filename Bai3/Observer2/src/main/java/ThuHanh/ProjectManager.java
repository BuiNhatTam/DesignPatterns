package ThuHanh;

// PM nhận thông báo khi task thay đổi
public class ProjectManager implements Observer {
    private String name;

    public ProjectManager(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskId, String status) {
        System.out.println("PM " + name + " nhận thông báo: Task " + taskId + " đã chuyển sang trạng thái " + status);
    }
}
