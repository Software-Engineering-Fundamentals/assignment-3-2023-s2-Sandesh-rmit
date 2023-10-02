package InstructorRegistration;

public class scenario_1{
    public static void main(String args[]){
        // this file will be responsible for code related to the following scenario:
        // Instructor registers a course on the learning portal/website
        Instructor teacher = new Instructor("Daniel@gmail", "Daniel", "Daniel_1");
        Courses enrolment = new Courses("Maths", "Daniel", "Fun class", false)

        String name = teacher.getName();
        String class = enrolment.title();

        System.out.println(name);
        System.out.println(class);
        
    }
}
