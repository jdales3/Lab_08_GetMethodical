import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Please enter the year of birth", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Please enter the month of birth", 1, 12);

        // Determine days in the month
        int maxDays;
        switch (month)
        {
            case 2:
                maxDays = 29; // Assuming leap year is handled separately
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
        }

        int day = SafeInput.getRangedInt(in, "Please enter the day of birth", 1, maxDays);
        int hours = SafeInput.getRangedInt(in, "Please enter the hour of birth", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Please enter the minute of birth", 1, 59);

        System.out.printf("\nDate and Time of Birth: %d-%02d-%02d %02d:%02d\n", year, month, day, hours, minutes);
    }
}
