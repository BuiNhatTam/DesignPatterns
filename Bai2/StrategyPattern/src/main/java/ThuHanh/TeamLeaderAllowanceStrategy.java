package ThuHanh;

public class TeamLeaderAllowanceStrategy implements AllowanceStrategy {
    @Override
    public double getAllowance() {
        return 1000;
    }

    @Override
    public String getPositionName() {
        return "Tổ trưởng";
    }
}
