package bankApp;

public class Savings extends Account {

    private int safetyDepositBox;
    private int safetyDepositBoxKey;

    public Savings(String name,String ssn,double initDeposit) {
        super(name, ssn ,initDeposit);
        System.out.println("Savings Account");
    }
}
