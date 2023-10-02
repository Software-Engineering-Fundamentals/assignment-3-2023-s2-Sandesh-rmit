package LodgeInquiry;

public class Student {
    String email;
    String course;
    String password;
    String userName;
    boolean quitCourse;
    boolean refundApproved;
    String question;
    String responses;

    public String getCourses() {
        return course;
    }

    public String receiveResponse() {
        return responses;
    }

    public void addQuestion(String sentence) {
        question += sentence + "\n";
    }

    public String returnQuestion() {
        return question;
    }

    public void changeEmail(String newEmail) {
        email = newEmail;
        // store new email address into address variable
    }

    public String getEmail() {
        return email;
    }

    public void changePassword(String newPassword) {
        password = newPassword;
        // store new password into password variable
    }

    public String getPassword() {
        return password;
    }

    public void changeUserName(String newUserName) {
        userName = newUserName;
    }

    public String getUserName() {
        return userName;
    }

    public boolean quitCourse(boolean quit) {
        quitCourse = false;

        if (quit == true) {
            quitCourse = quit;
        }

        return quitCourse;
    }

    public boolean applyForRefund(boolean refund) {
        refundApproved = false;

        if (refund == true) {
            refundApproved = refund;
        }

        return refundApproved;
    }
}
