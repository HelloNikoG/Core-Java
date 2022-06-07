package emailapp;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String email;
    private String department;
    private String password;
    private int defaultPWlength = 10;
    private int mailboxCapacity = 500;
    private String alternateEmail;

    //constructor to receive firstname and lastname
    //constructor for making the object instance
    public Email(String firstname, String lastname) {
        this.firstname = firstname; //first part is class level, last part is constructor level
        this.lastname = lastname;
        //call method to generate dept
        this.department = setDepartment();
        System.out.println("Email created: " + firstname + " " + lastname);
        System.out.println("Department: " + department);
        this.password = randomPassword(defaultPWlength);
        System.out.println("Password: " + password);
        //combine elements to get email
            String fullname = firstname + "." + lastname;
            email = fullname.toLowerCase() + "@" + department.toLowerCase() + "." + "company.com";
            System.out.println("Email: " + email);

    }



    //ask for dept
    // we dont want this to be public, but it will be called in the constructor
    private String setDepartment() {
        System.out.println("Enter the department\n " +
                "1 for sales\n " +
                "2 for development\n " +
                "3 for accounting\n 0 for none");
        Scanner sc = new Scanner(System.in);
        int departmentChoice = sc.nextInt();
        if (departmentChoice == 1) {
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }



        //generate random password
            //to be called in the constructor

            private double setPassword(){
                return Math.floor(Math.random()*10000);
        }

        //or

        private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] passwordArray = new char[length];
        for(int i =0; i< length; i++){
            int rand = (int)(Math.random()*passwordSet.length());//must cast to int
            passwordArray[i] = passwordSet.charAt(rand);
            //this gets a random number from the passwordSet and adds it to the passwordArray
        }
        return new String(passwordArray);//cast passwordArray into String
        }
        //set mailbox capacity
        public void setMailboxCapacity(int capacity){
            mailboxCapacity = capacity;
        }

        //get mailbox capacity
        public int getMailboxCapacity(){
            return mailboxCapacity;
        }

        //get password
        public String getPassword(){
            return password;
        }
    //change password
        public void changePassword(String password){
            this.password = password;

        }




    //set alternate email

        //get alternate email
    public String getAlternateEmail(){
        return alternateEmail;
    }
        //setting is defining properties, getting is retrieving them
        public void setAlternateEmail(String alternateEmail) {
            this.alternateEmail = alternateEmail;
        }

    @Override
    public String toString() {
        return "Email{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", password='" + password + '\'' +
                ", defaultPWlength=" + defaultPWlength +
                ", mailboxCapacity=" + mailboxCapacity +
                ", alternateEmail='" + alternateEmail + '\'' +
                '}';
    }
}
