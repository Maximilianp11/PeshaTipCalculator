import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // this welcomes the user, asks how many people are in the group, and asks for the tip percentage
        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many people are in your group: ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        double tipPercent = 0;
        System.out.println("What is the tip percentage? (0-100): ");
        tipPercent = scan.nextInt();
        scan.nextLine();
        double item1 = 0;
        double item2 = 0;
        double total = 0;

            // this is the loop where the user keeps inputting items until they type -1
            while (item1 != -1) {

            item1 = 0;
            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end) (-2 to remove previous item)");
            item1 += scan.nextDouble();
            total += item1;
            if (item1 == -2) {
                total += 2;
                total -= item2;
            }
            item2 = 0;
            item2 = item1;

            scan.nextLine();

            }

        // this prints out all the information like cost per person, tip percentage, etc
        total += 1; // this adds 1 to the total because -1 is added when stopping the loop
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
        System.out.println("----------------------------------");
    }
}