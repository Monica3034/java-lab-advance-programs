import java.util.Scanner;
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        double basic = scanner.nextDouble();

      
        double hra = 0.20 * basic;
        double gross = basic + hra;
        double pf = 0.12 * basic;
        double tax = 0.10 * gross;
        double net = gross - pf - tax;

       
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Tax: " + tax);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);

        scanner.close();
    }
}
