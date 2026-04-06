class Addition{
    void add(int a,int b){
        int sum = a+b;
        System.out.println("sum =" +sum);
    }
    public static void main(String[]args){
        Addition A=new Addition();
        A.add(10,20);
    }
}

or
class Addition{
    void add(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[]args){
        Addition A=new Addition();
        A.add(10,20);
    }
}
