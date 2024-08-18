package assignment3_day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentApp {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Student[] studentArr = new Student[100];

    public static Student getStudentInfo() throws IOException {

        System.out.print("Name: ");
        String name = br.readLine();

        int[] marks = new int[6];

        System.out.println("Enter marks for 6 subjects (or less, defaults to 0): ");

        for (int i=0; i<6; i++){
            System.out.print("Subject "+ (i+1) + " : ");
            int mark = Integer.parseInt(br.readLine());
            marks[i] = mark;
        }

        System.out.print("Enter Address 1: ");
        String address1 = br.readLine();

        System.out.print("Enter Address 2 (or press Enter to skip): ");
        String address2 = br.readLine();

        Student student;
        if(address2.isEmpty()){
            student = new Student(name, address1, marks);
        }else{
            student = new Student(name, address1, address2, marks);
        }
        return student;
    }

    public static void findHighestGPA(){
        Student highestGPAStudent = null;
        double highestGPA = 0;

        for (int i=0; i<Student.getStudentCount(); i++){
            double currentGPA = studentArr[i].calculateGPA();
            if(currentGPA > highestGPA){
                highestGPA = currentGPA;
                highestGPAStudent = studentArr[i];
            }
        }

        if (highestGPAStudent != null){
            System.out.println("Student with the highest GPA: ");
            highestGPAStudent.display();
        }else{
            System.out.println("No students found.");
        }
    }

    public static void main(String[] args) throws IOException {
        String flag;
        do{
            System.out.println("Enter details for a new student: ");
            Student student = getStudentInfo();
            studentArr[Student.getStudentCount()-1] = student;
            System.out.println();
            System.out.print("Do you want to enter another new student? (yes/no) : ");
            flag = br.readLine();
            System.out.println();
        }while (flag.equalsIgnoreCase("yes"));

        System.out.println("All Students: ");

        display();
    }

    public static void display(){
        for(int i = 0; i< Student.getStudentCount(); i++){
            studentArr[i].display();
            System.out.println();
        }

        System.out.println("Mean Marks: ");
        for (int j=0; j<6; j++){
            double x = (double) Student.getSubjectMean()[j] / Student.getStudentCount();
            System.out.println("Subject " + (j+1) + ": " + x);
        }
        System.out.println();

        findHighestGPA();
    }
}

