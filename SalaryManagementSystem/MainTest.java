package SalaryManagementSystem;


public class MainTest {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("John Doe", 101, 50000.0, 0, 20000.0);
        Employee emp2 = new PartTimeEmployee("Jane Smith", 102, 0.0, 4, 3000.0);
        Employee emp3 = new ContractEmployee("Mark Johnson", 103, 0.0, 2, 10000.0);

        emp1.display();
        emp2.display();
        emp3.display();
    }
}
