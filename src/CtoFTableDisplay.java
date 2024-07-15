public class CtoFTableDisplay
{

    public static void main(String[] args)
    {
        SafeInput.prettyHeader("Celsius to Fahrenheit Conversion Table");

        // Display table headers
        System.out.printf("%-10s %-10s\n", "Celsius", "Fahrenheit");
        System.out.println("----------------------------");

        // Display conversion table from -100 to 100 Celsius
        for (int celsius = -100; celsius <= 100; celsius++)
        {
            double fahrenheit = SafeInput.CtoF(celsius);
            System.out.printf("%-10d %-10.1f\n", celsius, fahrenheit);
        }
    }
}
