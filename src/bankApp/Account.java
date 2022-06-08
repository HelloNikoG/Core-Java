package bankApp;

public abstract class Account implements IbaseRate {
    private String name;
    private String ssn;
    private double accountBalance;

    private String accountNumber;
    private double rate;
    private static int index = 10000;

    //constructor to set base properties and initialize account
    public Account(String name, String ssn, double initDeposit){
        this.name = name;
        this.ssn = ssn;
        this.accountBalance = initDeposit;
        this.accountNumber = setAccountNumber();
        index++;
        System.out.println(toString());
    }

    private String  setAccountNumber(){
      String lastTwoSSN = ssn.substring(ssn.length()-2);
      int uniqueID = index;
      int randomNum = (int) (Math.random()* Math.pow(10,3));
        return  lastTwoSSN + uniqueID + randomNum;
    }

    


    @Override
    public String toString() {
        return "Account {" +
                "Name= '" + name + '\'' +
                ", SSN= '" + ssn + '\'' +
                ", Account Balance= " + "$" + accountBalance +
                ", Account Number= " + accountNumber + '\'' +
                ", Rate= " + rate +
                '}';
    }

    //common methods


}

