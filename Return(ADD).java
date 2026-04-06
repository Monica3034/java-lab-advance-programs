class ReturnDemo{
    int add (int a,int b){
        int sum=a+b;
        return sum;
    }
public static void main(String[]args){
    ReturnDemo obj=new ReturnDemo();
    int result =obj.add(10,20);
    System.out.println("sum="+result);
    }
}
