package LodgeInquiry;

public class Main {
    public static void main(String args[]) {
        // this file will be responsible for code related to the following scenario:
        // Lodge a general inquiry about the portal which is successfully addressed by
        // the Manager

        Student student = new Student("sophie33@gmail.com", "sophfam01", "asdfghjkl");
        Manager manager = new Manager("Manager@gmail.com", "MR Manager");

        String a = student.sendEnquiry("Can i have a discount?");
        String b = manager
                .respondToEnquiry("No, unfortunately we don't have promotions to able to provide any discounts");

        System.out.print(a);
        System.out.println(b);
    }
}
