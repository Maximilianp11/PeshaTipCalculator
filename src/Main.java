import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group: ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.println("What is the tip percentage? (0-100): ");
        double tipPercent = scan.nextInt();
        scan.nextLine();
        double item = 0;
        double total = 0;

            while (item != -1) {

            item = 0;
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            item += scan.nextDouble();
            total += item;
            scan.nextLine();
            }

        total += 1;
        System.out.println("Total bill before tip: $" + total);
        System.out.println("Tip percentage: " + tipPercent);
        double totalTip = (tipPercent / 100 * total);
        System.out.println("Total tip: $" + totalTip);
        double totalWTip = totalTip + total;
        System.out.println("Total bill with tip: $" + totalWTip);
        double perBefore = total / numPeople;
        System.out.println("Per person cost before tip: $");

    }
}