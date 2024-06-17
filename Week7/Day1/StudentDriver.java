package Week7.Day1;

public class StudentDriver {

    public static void main(String[] args) {

        System.out.println("--------------------");
        Student student1 = new Student();
        System.out.println("Student 1 Details");
        student1.displayStudent();

        System.out.println("--------------------");
        student1.setFirstName("Bruce");
        student1.setLastName("Wayne");
        student1.displayStudent();

        System.out.println("--------------------");
        System.out.println("Student 2 Details");
        Student student2 = new Student("Peter", "Parker", 80.0);
        student2.displayStudent();

    }

}
