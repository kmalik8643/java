import java.util.Scanner;

public class customer_care {
    public static void main(String[] args) {
        System.out.println("Welcome to shaw communication");
        Scanner myobj = new Scanner(System.in);
        System.out.println("Please enter you account no:");
        int Account_no= myobj.nextInt();
        System.out.println("Press 1 for Billing\n2 for technical support\n3for ticket inquiry\n4to speak to support agent");
        int value_step1 = myobj.nextInt();
        switch (value_step1) {
            case (1):
                System.out.println("Press 1 for the Current Bill\n2 for last payment \n3 for speaking to a billing agent");
                int value_billing_step2 = myobj.nextInt();
                switch (value_billing_step2) {
                    case 1:
                        System.out.println("Your balance for account"+  Account_no+"1234");
                        break;
                    case 2:
                        System.out.println("last payment for account"+  Account_no+"1234");
                        break;
                    case 3:
                        System.out.println("connecting to billing agent \nif you want to leave for call back option");
                        char call_back = myobj.next().charAt(0);
                        switch (call_back){
                            case 'T':
                                System.out.println("enter the call back no");
                                int Call_back_no = myobj.nextInt();
                                System.out.println("You will get call in 30-35 minutes");
                                break;
                            case 'F':
                                System.out.println("wait for the next agent");
                                break;
                            default:
                                System.out.println("Incorrect value");


                        }

                        break;

                }
                break;
            case (2):
                System.out.println("Press 1 for NO Internet\n2 for slow internet\n3 for speaking to a techagent");
                int value_tech_step2 = myobj.nextInt();
                switch (value_tech_step2) {
                    case 1:
                        System.out.println("NO internet");
                        break;
                    case 2:
                        System.out.println("slow internet");
                        break;
                    case 3:
                        System.out.println("techagent");
                        break;
                }
                break;
            case (3):
                System.out.println("Enter you Shaw ticket no");
                int value_ticket = myobj.nextInt();
                System.out.println("your ticket no" + value_ticket + "processing");
                break;

            case (4):
                System.out.println("wait time is 10 minutes");
                break;

            default:
                System.out.println("Sorry! wrong input please select the corret input");



        }
    }
}
