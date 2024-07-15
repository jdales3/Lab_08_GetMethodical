import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems;

        do {
            double itemCost = SafeInput.getRangedDouble(in, "Please enter the price of the item", 0.50, 10.00);
            totalCost += itemCost;
            moreItems = SafeInput.getYNConfirm(in, "Would you like to add more items?");
        } while (moreItems);

        System.out.printf("\nTotal Cost: $%.2f\n", totalCost);
    }
}
