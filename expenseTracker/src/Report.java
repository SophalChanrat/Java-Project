import java.util.ArrayList;
import java.util.List;

public class Report {
    private String name;
    private String dateRange;
    private List<Expense> expenses;
    private double totalExpenses;
    public Report(String name, String dateRange){
        this.name = name;
        this.dateRange = dateRange;
        this.expenses = new ArrayList<>();
        this.totalExpenses = 0;
    }


    private static class Expense{
        private String date;
        Category category;
        private List<String> items;
        private double amount;
        public Expense(String date, Category category, List<String> items, double amount){
            this.date = date;
            this.category = category;
            this.items = items;
            this.amount = amount;
        }
    }
}
