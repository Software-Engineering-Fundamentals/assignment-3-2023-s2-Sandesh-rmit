package LodgeInquiry;

public class Manager {
    String email;
    String name;
    String response;

    public Manager() {
        email = null;
        name = null;
    }

    public Manager(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String respondToEnquiry(String response){
        return this.response = response;
    }
}
