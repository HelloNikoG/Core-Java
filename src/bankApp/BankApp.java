package bankApp;

import java.util.List;

public class BankApp {
    public static void main(String[] args) {
        String file = "C:\\Users\\NikoG1\\Documents\\Java\\Core Java\\Java Beginner Projects\\NewBankAccounts.csv";
 /*
        Checking chk1 = new Checking("Niko Garalde", "123456789", 1500); // the super gets called first
        Savings sv1 = new Savings("Riche Lowe", "987654321", 2500);

       sv1.deposit(5000);
       sv1.withdraw(200);
       sv1.transfer(100, "brokerage");
       System.out.println(sv1.toString());


        sv1.compound();
        System.out.println(sv1.toString());


*/


        //read csv and create new accounts based on that data


        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for(String[] accountHolder: newAccountHolders){
            System.out.println("New Account");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);

        }
    }
}
