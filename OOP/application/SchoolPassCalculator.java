package OOP.application;

import OOP.entities.StudentEntity;
import java.util.*;

public class SchoolPassCalculator {
    
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        StudentEntity student = new StudentEntity();
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the name of the student");
        student.name = sc.next();
        System.out.print("Enter the first grade: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Enter the second grade: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Enter the third grade: ");
        student.grade3 = sc.nextDouble();
        }
        if(student.getAverage() >= 60){
            System.out.println("Congratulations! " + student.name + ", you passed with " + student.getAverage() + " points.");
        }else {
            System.out.println("You achieved " + student.getAverage() + " points");
            System.out.println("Failed, missing " + student.MissingNote() + " points.");
        }
    }
}
