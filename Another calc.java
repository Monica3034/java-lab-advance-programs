import java.util.Scanner;

public class Calc {

    static double add(double a, double b){
        return a + b;
    }

    static double sub(double a, double b){
        return a - b;
    }

    static double mul(double a, double b){
        return a * b;
    }

    static double div(double a, double b){
        return a / b;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double n1, n2;
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
                System.out.println("Result = " + add(n1,n2));
                break;

            case 2:
                System.out.println("Result = " + sub(n1,n2));
                break;

            case 3:
                System.out.println("Result = " + mul(n1,n2));
                break;

            case 4:
                System.out.println("Result = " + div(n1,n2));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
