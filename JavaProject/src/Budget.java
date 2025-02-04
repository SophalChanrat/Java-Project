public class Budget {
    private final double setBudget;
    private double getBudget;
    private boolean checkExceeded;

    public Budget(double setBudget, double getBudget, boolean checkExceeded) {
        this.setBudget = setBudget;
        this.getBudget = 0;
        this.checkExceeded = false;
    }
    public double getSetBudget() {
        return setBudget;
    }
    public double getGetBudget() {
        return getBudget;
    }
    public void setGetBudget(double getBudget) {
        this.getBudget = getBudget;
        checkExceeded();
    }
    private void checkExceeded() {
        this.getBudget = setBudget;
        this.checkExceeded = getBudget > setBudget;
    }
    public boolean budgetExceeded() {
        return checkExceeded;
    }
}
