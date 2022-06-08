package bankApp;

public class Checking extends Account {
    //list properties specific to checking
    //debit card w/ 12digit num and 4 digit pin
    private int debitCardNumber;
    private int debitCardPin;
    //pin
    //2 as first digit

    //constructor to initialize checking properties
    public Checking(String name, String ssn,double initDeposit){
        super(name, ssn, initDeposit);
        System.out.println("Checking Account");

    }


    //list methods for checking
}
