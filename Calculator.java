import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1, n2, result;
        int choice;

        System.out.println("Enter the 1st number:");
        n1 = sc.nextDouble();

        System.out.println("Enter the 2nd number:");
        n2 = sc.nextDouble();

        System.out.println("Choose Operation");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");

        choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                result = n1 + n2;
                System.out.println("Add = " + result);
                break;

            case 2:
                result = n1 - n2;
                System.out.println("Sub = " + result);
                break;

            case 3:
                result = n1 * n2;
                System.out.println("Mul = " + result);
                break;

            case 4:
                result = n1 / n2;
                System.out.println("Div = " + result);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
