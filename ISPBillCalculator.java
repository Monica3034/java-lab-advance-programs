import java.util.Scanner;

public class ISPBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int usage = scanner.nextInt();
        int bill = 0;

        if (usage <= 100) {
            bill = usage * 5;
        } else if (usage <= 200) {
            bill = (100 * 5) + ((usage - 100) * 4);
        } else {
            bill = (100 * 5) + (100 * 4) + ((usage - 200) * 3);
        }

        System.out.println(bill);
        
        scanner.close();
    }
}
