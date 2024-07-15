import java.util.Scanner;

public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = SafeInput.getNonZeroLenString(in, "Please enter your first name");
        String lastName = SafeInput.getNonZeroLenString(in, "Please enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
