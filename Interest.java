import java.util.Scanner;

public class Interest {
    /**
     * Ask the user for a initial and an annual interes rate,
     * and pring to the console the balance after 1 year
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask the user for initial balance and annual interest rate
        System.out.println("input balance:");
        String balanceInput = sc.nextLine();

        // convert the received string into a double
        double b = Double.parseDouble(balanceInput);

        System.out.println("input interest rate:");
        String interestInput = sc.nextLine();

        // convert the received string into a double
        double i = Double.parseDouble(interestInput);

        // perform the interest calculation
        double result = calculateBalanceAfterYear(b, i);
        
        // send that data back to the console
        System.out.println(result);
    }
    /**
     * add the amount received from interest to the original amount
     * @param principal the starting balance    
     * @param apy the interest rate
     * @return the final profit balance after interest
     */
    public static double calculateBalanceAfterYear(double principal, double apy){
        return principal + calculateProfit(principal, apy);
    }
    /**
     * 
     * @param principal 
     * @param apy
     * @return the profit gained from the principal * apy
     */
    public static double calculateProfit(double principal, double apy){
        return principal * apy;
    }
}