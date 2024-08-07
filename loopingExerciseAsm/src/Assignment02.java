import java.util.Scanner;
public class Assignment02 {

    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int ans = 0;

        for (int i=0; i<=num; i++){
            if (i == 0){
                ans = 1;
            }
            else{
                ans *= i;
            }
        }
        System.out.print("The answer is "+ ans + ".");
    }
}
