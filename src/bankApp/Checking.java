package bankApp;

public class Checking extends Account {
    //list properties specific to checking
    //debit card w/ 12digit num and 4 digit pin
    private int debitCardPin;
    private int debitCardNumber;
    //pin
    //2 as first digit

    //constructor
    // to initialize checking properties
    public Checking(String name, String ssn,double initDeposit){
        super(name, ssn, initDeposit);
        this.accountNumber = "2" + accountNumber;
        setDebitCard();
        System.out.println(toString());
        showInfo();

    }

    //abstract method implementation
    @Override
    public void setRate(){
        System.out.println("implement rate for checking");
        this.rate = getBaseRate()*0.15;
    }

    private void setDebitCard(){
        int twelveDigitNum = (int)(Math.random()*Math.pow(10,12));
        int fourDigitPin = (int)(Math.random()*Math.pow(10,4));
        this.debitCardNumber = twelveDigitNum;
        this.debitCardPin = fourDigitPin;

    }


    public void showInfo() {
        super.toString();
        System.out.println("**********" + "\n" +"Account type= Checking" + "\n" + "Debit Card Number= " + debitCardNumber +
                "\n" +
                "Debit " +
                "Card " +
                "Pin= " + debitCardPin +
                "\n" + "----------");

    }

    //list methods for checking
}
