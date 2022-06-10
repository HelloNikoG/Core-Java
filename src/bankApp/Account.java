package bankApp;

public abstract class Account implements IbaseRate {
     private String name;
     private String ssn;
     private double accountBalance;
     private static int index = 10000;

     protected String accountNumber;
     protected double rate;


    //constructor to set base properties and initialize account
    public Account(String name, String ssn, double initDeposit){
        this.name = name;
        this.ssn = ssn;
        this.accountBalance = initDeposit;
        index++;
        this.accountNumber = setAccountNumber();
       setRate();



    }

    public abstract void setRate();// abstract method needs to be implemented by child class

    private String  setAccountNumber(){
      String lastTwoSSN = ssn.substring(ssn.length()-2);
      int uniqueID = index;
      int randomNum = (int) (Math.random()* Math.pow(10,3));
        return  lastTwoSSN + uniqueID + randomNum;
    }

    //compound
    public void compound(){
        double accruedInterest = this.accountBalance * (rate/100);
        this.accountBalance += accruedInterest;
        System.out.println("Accrued interest: " + accruedInterest);
    }

    //common methods
    public void deposit(double amount){
        this.accountBalance += amount;
        System.out.println("depositing $" + amount );
        printBalance();

    }
    public void withdraw(double amount){
        this.accountBalance -= amount;
        System.out.println("withdrawing $" + amount);
        printBalance();
    }
    public void transfer(double amount, String toWhere){
        this.accountBalance -= amount;
        System.out.println("$" + amount + " was transferred to " + toWhere);
        printBalance();
    }

    public void printBalance(){
        System.out.println("Your balance is $" + accountBalance);
    }






    


    @Override
    public String toString() {
        return "Account " +
                "Name= '" + name + '\n' +
                "SSN= '" + ssn + '\n' +
                "Account Balance= " + "$" + accountBalance + '\n' +
                "Account Number= " + accountNumber + '\n' +
                "Rate= " + rate;
    }




}

