import java.util.Scanner;

public class Um {
    private String username;
    private String password;

    // Constructor
    public Um(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method to register a user
    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        this.username = scanner.nextLine();
        System.out.print("Enter password: ");
        this.password = scanner.nextLine();
        System.out.println("User registered successfully!");
    }

    // Method to login a user
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (this.username.equals(username) && this.password.equals(password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    public static void main(String[] args) {
        Um user = new Um("", "");
        user.register();
        user.login();
    }
}
