package assignment3_day4;

import java.util.Arrays;

public class Student {
    private String name;
    private String address1;
    private String address2;
    private int[] marks;
    private static int[] subjectMean= {0,0,0,0,0,0};
    private static int studentCount=0;
    private static int allTotalMark=0;

    public Student(String name, String address1, int[] marks){
        this.name = name;
        this.address1 = address1;
        this.marks = marks;
        studentCount++;
        allTotalMark += this.totalMark();
        updateSubjectMean();
    }
    public Student(String name, String address1, String address2, int[] marks){
        this.name = name;
        this.address1 = address1;
        this.address2 = address2;
        this.marks = marks;
        studentCount++;
        allTotalMark += this.totalMark();
        updateSubjectMean();
    }
    public static double getMeanMark(){
        double mean = allTotalMark/studentCount;
        return mean;
    }
    private int totalMark(){
        int total = 0;
        for(int i=0; i<this.marks.length; i++){
            total+=this.marks[i];
        }
        return total;
    }

    private void updateSubjectMean() {
        for (int i = 0; i < this.marks.length; i++) {
            Student.subjectMean[i] += this.marks[i];
        }
    }

    public double calculateGPA(){
        int total = this.totalMark();
        double gpa = (double) total / 6;
        return gpa;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Marks : " + Arrays.toString(this.marks));
        System.out.println("GPA : " + this.calculateGPA());
        System.out.println("Address 1 : " + this.address1);
        if (this.address2 == null || this.address2.isEmpty()){
            System.out.println("Address 2 : Not provided");
        }else{
            System.out.println("Address 2 : " + this.address2);
        }
    }

    public static int[] getSubjectMean(){
        return subjectMean;
    }
    public static int getStudentCount(){
        return studentCount;
    }
}
