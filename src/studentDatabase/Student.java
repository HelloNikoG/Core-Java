package studentDatabase;

import java.util.Scanner;

public class Student {
    private String firstname;
    private String lastname;
    private int gradeYear;
    private String studentID;
    private static int id = 1000;
    private static int courseCost = 600;
    private int tuitionBalance;
    private String courses = null;

    //constructor:prompt name and year
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter students first name");
        firstname = sc.nextLine();
        System.out.println("Enter students last name");
        lastname = sc.nextLine();
        System.out.println("Enter students last name\n"+
                "1 - Freshman\n"+
                "2 - Sophomore\n" +
                "3 - Junior\n"+
                "4 - Senior\n");
        gradeYear = sc.nextInt();
        setStudentID();
        System.out.println(toString());
    }



    //student should have 5-digit unique id, first number is grade level
    public void setStudentID() {
        studentID = gradeYear + "" + id;
        id++;

    }



    //student can enroll in courses
    public void enrollInCourse() {
        do {

            Scanner sc = new Scanner(System.in);
            System.out.print("Please enroll in course(Q for quit)");
            String course = sc.nextLine();


            if (!course.equals("Q")) {
                courses += "\n" + course;
                tuitionBalance += courseCost;
            } else {
                break;
            }
        } while (1 != 0);


        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition balance: " + tuitionBalance);
        System.out.println(toString());
    }



    //student should be able to view balance

    public void getTuitionBalance() {
        System.out.println("Your balance is: " + tuitionBalance);

    }


    //pay tuition
    public void payTuition(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How much do you want to pay?");
        int paymentAmount = sc.nextInt();
        tuitionBalance -= paymentAmount;
        getTuitionBalance();
    }






    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\n' +
                ", lastname='" + lastname + '\n' +
                ", gradeYear='" + gradeYear + '\n' +
                ", StudentID=" + studentID +
                ", tuitionBalance=" + tuitionBalance +
                ", courses='" + courses + '\n' +
                '}';
    }
}
