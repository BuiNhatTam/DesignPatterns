package ThuHanh;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("App Name: " + configManager.getConfig("appName"));
        System.out.println("Version: " + configManager.getConfig("version"));
    }}