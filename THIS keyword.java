class student {
    String name;

    student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        student s1 = new student("Monica");
        s1.display();
    }
}
