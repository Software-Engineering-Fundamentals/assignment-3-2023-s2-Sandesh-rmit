package LodgeInquiry;

public class Scenario_2 {
    public static void main(String args[]) {
        // this file will be responsible for code related to the following scenario:
        // Lodge a general inquiry about the portal which is successfully addressed by
        // the Manager
        String sEmail = "sophie33@gmail.com";
        String username = "sophfam01";
        String password = "asdfghjkl";

        String mEmail = "Manager@gmail.com";
        String mName = "MR Manager";

        Student student = new Student(sEmail, username, password);
        Manager manager = new Manager(mEmail, mName);

        String a = student.sendEnquiry("Can i have a discount?");
        // calling the sendEnquiry method from Student class and storing the message
        String b = manager.respondToEnquiry("No, unfortunately we don't provide any discounts"); 
        // calling the respondToEnquiry method from Manager class which responds to the enquiry sent by a student

        System.out.println(a);
        // printing out the message from student enquiry
        System.out.println(b);
        // printing out the response from the manager

        /*  The 2 System.out.print() are used to check if the enquiries are going to the terminal and have 
          no issues with the system */
    }

}
