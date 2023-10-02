package InstructorRegistration;

public class scenario_1{
    public static void main(String args[]){
        // this file will be responsible for code related to the following scenario:
        // Instructor registers a course on the learning portal/website
        Instructor teacher = new Instructor("Daniel@gmail", "Daniel", "Daniel_1");

        String name = teacher.getName();

        System.out.println(name);
        
    }
}
