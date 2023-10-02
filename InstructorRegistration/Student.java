package InstructorRegistration;

import java.util.*;

public class Student {
    String email;
    String name;
    String username;
    List<String> course = new ArrayList<>();

    public Student() {
        email = null;
        name = null;
        username = null;
    }

    public Student(String email, String name, String username) {
        this.email = email;
        this.name = name;
        this.username = username;
    }

    public void editCourses() {
        String courseName = "duifue";
        this.course.add(courseName);
    }

    // returns a list of Courses
    public List<String> getCourses() {
        return this.course;
    }

    // public void quitCourse() {

    // }
}
