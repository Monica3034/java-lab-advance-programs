public class main{
    public static void main(String[]args){
        student s = new student();
        s.setName("Arun");
        System.out.println(s.getName());
    }
}
class student{
    private String name;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
