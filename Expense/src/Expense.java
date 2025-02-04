public class Expense {
    private String category;
    private double amount;
    private String date;

    public Expense(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    public String getDetails() {
        return "Category: " + category + ", Amount: $" + amount + ", Date: " + date;
    }
}
