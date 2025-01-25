import java.util.Scanner;
public class Demo005{
    // Sample user credentials stored in a simple way (username and password)
    private static final String STORED_USERNAME = "user001";
    private static final String STORED_PASSWORD = "user_001";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Validate the credentials
        if (username.equals(STORED_USERNAME) && password.equals(STORED_PASSWORD)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}
