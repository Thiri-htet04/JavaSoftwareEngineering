package SalaryManagementSystem;

public class ContractEmployee extends Employee{

    private int contractDuration;
    private double contractAmount;

    public ContractEmployee(String name, int employeeId, double basicSalary, int contractDuration, double contractAmount){
        super(name, employeeId, basicSalary);

        this.contractAmount = contractAmount;
        this.contractDuration = contractDuration;

    }

    @Override
    public double calculateSalary() {

        return this.contractAmount/this.contractDuration;
    }

    @Override
    public void display(){
        System.out.println("***** Contract Employee ******");
        super.display();
    }
}
