import java.util.Scanner;

public class Reggie {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Test for SSN pattern: ^\d{3}-\d{2}-\d{4}$
        String ssn = SafeInput.getRegExString(in, "Please enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Valid SSN entered: " + ssn);

        // Test for UC Student M number pattern: ^(M|m)\d{5}$
        String mNumber = SafeInput.getRegExString(in, "Please enter your UC Student M number (M#####)", "^(M|m)\\d{5}$");
        System.out.println("Valid M number entered: " + mNumber);

        // Test for menu choice pattern: ^[OoSsVvQq]$
        String menuChoice = SafeInput.getRegExString(in, "Please enter your menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        switch (menuChoice.toUpperCase())
        {
            case "O":
                System.out.println("Menu choice: Open");
                break;
            case "S":
                System.out.println("Menu choice: Save");
                break;
            case "V":
                System.out.println("Menu choice: View");
                break;
            case "Q":
                System.out.println("Menu choice: Quit");
                break;
        }

        // Test invalid inputs for each pattern
        testInvalidInputs(in);
    }

    private static void testInvalidInputs(Scanner in)
    {
        // Test invalid SSNs
        System.out.println("\nTesting invalid SSNs:");
        String[] invalidSSNs = {"123-45-6789", "123456789", "ABC-12-3456"};
        for (String ssn : invalidSSNs) {
            String result = SafeInput.getRegExString(in, "Please enter an invalid SSN", "^\\d{3}-\\d{2}-\\d{4}$");
            System.out.println("You entered: " + result);
        }

        // Test invalid M numbers
        System.out.println("\nTesting invalid M numbers:");
        String[] invalidMNumbers = {"M123", "M123456", "A12345"};
        for (String mNumber : invalidMNumbers)
        {
            String result = SafeInput.getRegExString(in, "Please enter an invalid M number", "^(M|m)\\d{5}$");
            System.out.println("You entered: " + result);
        }

        // Test invalid menu choices
        System.out.println("\nTesting invalid menu choices:");
        String[] invalidChoices = {"X", "123", "ABC"};
        for (String choice : invalidChoices) {
            String result = SafeInput.getRegExString(in, "Please enter an invalid menu choice", "^[OoSsVvQq]$");
            System.out.println("Please entered: " + result);
        }
    }
}
