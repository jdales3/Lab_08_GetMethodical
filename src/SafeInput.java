import java.util.Scanner;

public class SafeInput
{

    /**
     * Gets a non-zero length string input from the user.
     *
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString;
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine().trim(); // trim to ignore leading/trailing whitespace
        } while (retString.length() == 0);

        return retString;
    }
