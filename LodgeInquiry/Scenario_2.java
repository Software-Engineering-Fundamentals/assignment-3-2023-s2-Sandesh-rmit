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
        String b = manager
                .respondToEnquiry("No, unfortunately we don't have promotions to able to provide any discounts");

        System.out.print(a);
        System.out.println(b);
    }
}
