/*
Create a login system:

Input username and password
Rules:
Username cannot be empty → throw InvalidUsernameException
Password must be at least 6 characters → throw WeakPasswordException
*/
import java.util.Scanner;

// Custom Exception for Invalid Username
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

// Custom Exception for Weak Password
class WeakPasswordException extends Exception {
    public WeakPasswordException(String message) {
        super(message);
    }
}

public class Login_Authentication_System {

    public static void validateLogin(String username, String password)
            throws InvalidUsernameException, WeakPasswordException {

        if (username == null || username.trim().isEmpty()) {
            throw new InvalidUsernameException("Username cannot be empty.");
        }

        if (password.length() < 6) {
            throw new WeakPasswordException("Password must be at least 6 characters long.");
        }

        System.out.println("Login Successful!");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            validateLogin(username, password);

        } catch (InvalidUsernameException | WeakPasswordException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}