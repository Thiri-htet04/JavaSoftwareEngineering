package SalaryManagementSystem;

public class FullTimeEmployee extends Employee{
    private double allowance;
    private double bonus;
    public FullTimeEmployee(String name, int employeeId, double basicSalary, double allowance, double bonus){
        super(name, employeeId, basicSalary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return this.allowance + this.bonus + this.getBasicSalary();
    }

    @Override
    public void display(){
        System.out.println("***** FullTime Employee ******");
        super.display();
    }
}
