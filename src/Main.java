import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean goAgain;
        double price;
        double totalCost = 0;

        do {
            price = InputHelper.getRangedDouble(scan, "Enter the item price: $",.50,9.99);
            totalCost += price;
            goAgain = InputHelper.getYNConfirm(scan, "Do you want to add another item? [Y/N]");
        }while (goAgain);
        System.out.printf("Total Cost in $: %5.2f", totalCost);
    }
}