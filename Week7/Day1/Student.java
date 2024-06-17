package Week7.Day1;

public class Student {

    // data members here
    private String firstName;
    private String lastName;
    private Long id;
    private Double grade;

    //default constructor
    public Student() {

        this.id = 0L;
        this.firstName = "";
        this.lastName = "";
        this.grade = 0.0;

    }

    //non default constructor
    public Student(String firstName, String lastName, Double grade) {

        this.id = 0L;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;

    }


    //setter's and getter's
    public void setId (long id) {
        this.id = id;
    }
    public Long getId(){
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
    public Double getGrade(){
        return grade;
    }


    public String toString() {
        return "Student { id " + this.id + "\nfirstName " + this.firstName +
                "\nlastName " + this.lastName + "\ngrade " + this.grade + " }";
    }


    public void displayStudent() {
        System.out.println("First Name : " + this.firstName);
        System.out.println("Last Name : " + this.lastName);
        System.out.println("Grade : " + this.grade);
    }


}
