package ThuHanh;

public class DefaultPosition implements PositionState {
    @Override
    public String getPositionName() {
        return "Nhân viên thường";
    }

    @Override
    public double getAllowance() {
        return 0;
    }
}
