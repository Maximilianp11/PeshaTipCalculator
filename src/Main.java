import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome tot the tip calculator!");
        System.out.println("How many people are in your group: ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.println("What is the tip percentage? (0-100): ");
        int tipPercent = scan.nextInt();
        scan.nextLine();
        double item = 0;
        double total = 0;

            while (item !<= 0) {

            System.out.println("Enter a cost in dollars and cents, e.g. 12.50 (-1 to end): ");
            item += scan.nextDouble();
            total += item;
            scan.nextLine();
            }

        System.out.println("test");
        System.out.println(total);
    }
}