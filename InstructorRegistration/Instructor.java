package InstructorRegistration;

public class Instructor {
    String email;
    String name;
    String username;

    public Instructor(){
        email = null;
        name = null;
        username = null;
    }
    public Instructor(String email, String name, String username) {
        this.email = email;
        this.name = name;
        this.username = username;
    }
}