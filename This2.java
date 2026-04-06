class student {
    int id;
    String name;
    student(int id,String name)
    {
        this.id = id;
        this.name=name;
    }
    void display() {
        System.out.println("ID:" +id);
        System.out.println("Name:" +name);
    }

    public static void main(String[] args) {
        student s1 = new student(101,"xxx");
        student s2 = new student(102,"yyy");
        s1.display();
        s2.display();
    }
}
