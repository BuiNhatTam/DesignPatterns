package ThuHanh;

public class NoAllowanceStrategy implements AllowanceStrategy {
    @Override
    public double getAllowance() {
        return 0;
    }

    @Override
    public String getPositionName() {
        return "Nhân viên thường";
    }
}

