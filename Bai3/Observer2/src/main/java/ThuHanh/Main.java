package ThuHanh;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Observer dev1 = new Developer("Tâm");
        Observer dev2 = new Developer("Hùng");
        Observer pm = new ProjectManager("Trí");

        // Đăng ký observer
        taskManager.addObserver(dev1);
        taskManager.addObserver(dev2);
        taskManager.addObserver(pm);

        // Cập nhật trạng thái task
        taskManager.updateTaskStatus("TASK-101", "In Progress");
        taskManager.updateTaskStatus("TASK-102", "Completed");
    }}