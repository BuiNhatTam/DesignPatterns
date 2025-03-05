package ThuHanh;

public class DepartmentManagerAllowanceStrategy implements AllowanceStrategy {
    @Override
    public double getAllowance() {
        return 3000;
    }

    @Override
    public String getPositionName() {
        return "Trưởng phòng";
    }
}
