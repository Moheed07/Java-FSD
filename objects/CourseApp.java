public class CourseApp {
    public static void main(String[] args) {
        Course course = new Course();
        course.id = 1;
        course.name = "Moheed";
        course.mentor = "Punith Sir";
        course.duration = 6;
        
        course.start();
        course.learn();
        course.end();
    }
}
