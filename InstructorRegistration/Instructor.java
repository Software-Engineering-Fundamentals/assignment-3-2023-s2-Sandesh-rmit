package InstructorRegistration;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    public static Object teacher;
    String email;
    String name;
    String username;
    ArrayList<String> course = new ArrayList<>();

    // the constructor classes for instructor, defaults to null if no information is provided
    public Instructor() {
        email = null;
        name = null;
        username = null;
    }

    public Instructor(String email, String name, String username) {
        this.email = email;
        this.name = name;
        this.username = username;
    }

    // returns all the courses that the instructor has published
    public List<String> getPublishedCourses() {
        return course;
    }

    // adds a course to the list of published courses
    public void editPublishedCourses(String courseName) {
        this.course.add(courseName);
    }

    // getter and setter methods for obtaining the instructor's information
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}