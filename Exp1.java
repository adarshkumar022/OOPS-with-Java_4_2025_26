class Student {

    int roll; 
    String name;

    Student() {
        roll = 01;
        name = "Adarsh";
    }

    Student(Integer r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println(roll + " " + name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(20, "Adarsh");

        s1.display();
        s2.display();
    }
}