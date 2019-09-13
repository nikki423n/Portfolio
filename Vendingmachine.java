import java.util.Scanner;
public class Vendingmachine
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
        System.out.print("Enter bill value (1 = $1 bill, 5 = $5 bill, etc.): ");

        int billValue = in.nextInt();

        System.out.print("Enter coin value (1 = 1 quarter, 2 = 2 quarters, etc.): ");
        int coinValue = in.nextInt();

        System.out.print("Enter item price in pennies: ");
        int itemPrice = in.nextInt();
        // compute change due
        int changeDue = ((PENNIES_PER_DOLLAR * billValue) + (PENNIES_PER_QUARTER * coinValue)) - itemPrice;
        int dollarCoins = changeDue / PENNIES_PER_DOLLAR;
        changeDue = changeDue % PENNIES_PER_DOLLAR;
        int quarters = changeDue / PENNIES_PER_QUARTER;
        changeDue = changeDue % PENNIES_PER_QUARTER;
        // Print change due
        System.out.printf("Dollar coins: %6d", dollarCoins);
        System.out.println();
        System.out.printf("Quarters:     %6d", quarters);
        System.out.println();
    }
}
