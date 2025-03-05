package ThuHanh;

import java.util.Properties;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private Properties config;
    // Constructor private để không cho tạo instance bên ngoài
    private ConfigurationManager() {
        config = new Properties();
        // Giả sử load cấu hình từ file hoặc set giá trị mặc định
        config.setProperty("appName", "MyApplication");
        config.setProperty("version", "1.0");
    }

    // Phương thức getInstance() đảm bảo trả về duy nhất một instance
    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Lấy giá trị cấu hình theo key
    public String getConfig(String key) {
        return config.getProperty(key);
    }
}
