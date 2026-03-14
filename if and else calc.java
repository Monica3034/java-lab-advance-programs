import java.util.Scanner;

public class Calc
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt(), b = s.nextInt();
        char op = s.next().charAt(0);

        if(op=='+') System.out.println(a+b);
        else if(op=='-') System.out.println(a-b);
        else if(op=='*') System.out.println(a*b);
        else if(op=='/') {
            if(b != 0) System.out.println(a/b);
            else System.out.println("Error: Division by zero");
        }
        else System.out.println("Error: Invalid operator");
        
    }
}
