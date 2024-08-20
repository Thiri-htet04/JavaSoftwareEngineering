package SalaryManagementSystem;

public class Employee {
    private String name;
    private int employeeId;
    private double basicSalary;
    public Employee(String name, int employeeId, double basicSalary){
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }
    public double calculateSalary(){
        return this.basicSalary;
    }
    public double getBasicSalary(){
        return this.basicSalary;
    }
    public void display(){
        System.out.println("Employee name : " + this.name);
        System.out.println("Employee Id : " + this.employeeId);
        System.out.println("Basic Salary : " + this.basicSalary);
        System.out.println("Total Salary : " + calculateSalary());
        System.out.println();
    }
}
