package LodgeInquiry;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String email;
    List<String> course = new ArrayList<>();
    String password;
    String username;
    boolean quitCourse;
    boolean refundApproved;
    String question;
    String responses;

    // constructor which gives password, username a default value
    public Student() {
        this.email = null;
        this.username = null;
        this.password = null;
    }

    public Student(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    // returns the course that student is enroled in
    public List<String> getCourses() {
        return course;
    }

    // adds courseName into ArrayList course
    public void editCourses(String courseName) {
        course.add(courseName);
    }

    // returns responses from the instructor to the student's questions
    public String receiveResponse() {
        return responses;
    }

    // adds question to string with \n to seperate them
    public void addQuestion(String sentence) {
        question += sentence + "\n";
    }

    // returns the student's question
    public String returnQuestion() {
        return question;
    }

    // store new email address into address variable
    public void changeEmail(String email) {
        this.email = email;
    }

    // returns the stored email address of student
    public String getEmail() {
        return email;
    }

    // store new password into password variable
    public void changePassword(String password) {
        this.password = password;
    }

    // remove courseName from Arraylist course
    public void quitCourse(String courseName) {
        this.course.remove(courseName);
    }

    // returns True if refund is applicable
    public boolean applyForRefund(boolean refund) {
        refundApproved = false;

        if (refund == true) {
            refundApproved = refund;
        }

        return refundApproved;
    }
}
