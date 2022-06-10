package bankApp;

public class Savings extends Account {

    private int safetyDepositBox;
    private int safetyDepositBoxKey;

    //constructor
    public Savings(String name,String ssn,double initDeposit) {
        super(name, ssn ,initDeposit);
        this.accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
//        System.out.println("Savings Account");
        System.out.println(toString());
        showInfo();
    }

    @Override
    public void setRate(){
        System.out.println("implement rate for savings");
        this.rate = getBaseRate()-.25;
    }

    private void setSafetyDepositBox(){
        int threeDigitNum = (int)(Math.random()*Math.pow(10,3));
        int fourDigitPin = (int)(Math.random()*Math.pow(10,4));
        this.safetyDepositBox = threeDigitNum;
        this.safetyDepositBoxKey = fourDigitPin;

    }

    public void showInfo() {
        super.toString();
        System.out.println( "----------" +
                            "\n"+ "Account type= Savings" +
                            "\n" +  "Safety Deposit Box Number= " + safetyDepositBox +
                            "\n" +
                            "Safety " +
                            "Deposit Box Key= " + safetyDepositBoxKey +
                            "\n" +
                            "**********");

    }






}
