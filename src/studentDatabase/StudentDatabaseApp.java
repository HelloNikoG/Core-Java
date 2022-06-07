package studentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {

        // how many students will be added to db?
        System.out.println("enter number of new students to enroll: ");
        Scanner sc = new Scanner(System.in);

        //how do you create an array of students
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];

        //create n number of new students
        for(int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enrollInCourse();
            students[i].getTuitionBalance();
            students[i].payTuition();
        }






    }
}
