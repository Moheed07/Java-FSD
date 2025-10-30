public class StudentConstructor {
    private int id;
    private String name;
    private String gender;
    private String marks;

    // Constructor to initialize the student object
    public StudentConstructor(int id, String name, String gender, String marks) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.marks = marks;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for gender
    public String getGender() {
        return gender;
    }

    // Getter for marks
    public String getMarks() {
        return marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Marks: " + marks);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        // Creating student objects using the constructor
        StudentConstructor student1 = new StudentConstructor(1, "Ayesha", "Female", "90");
        StudentConstructor student2 = new StudentConstructor(2, "Ismail", "Male", "85");

        System.out.println("Student Details:");
        student1.displayDetails();
        student2.displayDetails();
    }
}
