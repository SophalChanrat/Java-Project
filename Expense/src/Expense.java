public class Expense {
    // Class scope variables
    private String category;
    private double amount;
    private String date;

    // Class Constructor
    public Expense(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    // Get methods
    public String getDetails() {
        return "Category: " + category + ", Amount: $" + amount + ", Date: " + date;
    }
}
