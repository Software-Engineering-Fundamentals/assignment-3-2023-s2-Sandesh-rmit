package InstructorRegistration;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    public static Object teacher;
    String email;
    String name;
    String username;
    List<String> course = new ArrayList<>();

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

    public List<String> getPublishedCourses() {
        return course;
    }

    public void editPublishedCourses(String courseName) {
        this.course.add(courseName);
    }

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