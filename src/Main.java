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
        System.out.println("----------------------------------");
        System.out.println("Total bill before tip: $" + String.format("%.2f" , total));
        System.out.println("Tip percentage: " + (int) tipPercent + "%");
        double totalTip = (tipPercent / 100 * total);
        System.out.println("Total tip: $" + String.format("%.2f" , totalTip));
        double totalWTip = totalTip + total;
        System.out.println("Total bill with tip: $" + String.format("%.2f" , totalWTip));
        double perBefore = total / numPeople;
        System.out.println("Per person cost before tip: $" + String.format("%.2f" , perBefore));
        double perTip = totalTip / numPeople;
        System.out.println("Tip per person: $" + String.format("%.2f" , perTip));
        double perTotal = (totalTip + total) / numPeople;
        System.out.println("Total cost per person: $" + String.format("%.2f" , perTotal));

    }
}