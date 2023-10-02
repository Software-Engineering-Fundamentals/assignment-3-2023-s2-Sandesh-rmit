package InstructorRegistration;

public class scenario_1 {
    public static void main(String args[]) {
        // this file will be responsible for code related to the following scenario:
        // Instructor registers a course on the learning portal/website
        Instructor teacher = new Instructor("Daniel@gmail", "Daniel", "Daniel_1");
        Courses newCourse = new Courses("Maths", "Daniel", "Fun class", false);

        // add newCourse to instructors published courses
        teacher.editPublishedCourses(newCourse.getTitle());

        System.out.print(teacher.getPublishedCourses());

        // String class = newcourse.title();

        // System.out.println(name);
        // System.out.println(class);

    }
}
