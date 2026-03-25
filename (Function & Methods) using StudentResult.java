public class StudentResult{
    public static int Total(int m1,int m2,int m3){
        return m1+m2+m3;
    }
    public static double Avg(int Total){
        return Total/3.0;
    }
    public static void CheckResult(double avg){
        if (avg >= 50){
            System.out.println("Result:Pass");
        }
        else{
            System.out.println("Result:Fail");
        }
    }
    public static void main(String[]args){
        int marks1=60,marks2=70,marks3=40;
        int total = Total(marks1,marks2,marks3);
        double avg= Avg(total);
        System.out.println("Total marks:" +total);
        System.out.println("Avg:" +avg);
        CheckResult(avg);
    }
}
