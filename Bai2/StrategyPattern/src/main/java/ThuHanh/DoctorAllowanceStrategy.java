package ThuHanh;

public class DoctorAllowanceStrategy implements AllowanceStrategy {
    @Override
    public double getAllowance() {
        return 2000;
    }

    @Override
    public String getPositionName() {
        return "Tiến sĩ";
    }
}
