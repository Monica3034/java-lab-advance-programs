class overload{
    int add(int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double a,double b){
        return a+b;
    }
    public static void main(String[]args){
        overload obj = new overload();
        System.out.println(obj.add(5,3));
        System.out.println(obj.add(6,7,8));
        System.out.println(obj.add(2.4,5.6));
    }
}
