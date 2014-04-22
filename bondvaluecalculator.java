
package bondvaluecalculator;

import java.util.Scanner;

/**
 *
 * @author Hardeep
 */
public class BondValueCalculator {
        
    //calls scanner
        
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //scanner declarations!
        Scanner CP = new Scanner(System.in);
        
        Scanner BI = new Scanner(System.in);
       
        Scanner Ter = new Scanner(System.in);
        
        //obtains current price of bond from user
       System.out.println("What is the coupon payment of the bond?");
       double CouponPayment = CP.nextDouble();  //user input
   
        //obtains interest rate from user
       
       System.out.println("What is the interest rate on the bond? i.e 10.5%");
       double BondInterest = BI.nextDouble(); 
       
        //market interest rate is a constant, 1 is placeholder
       final double MARKET_INTEREST_RATE = 9.00;
        
        //obtains term in years from user
        //only performs calculations for full years, not months
       
       System.out.println("What is the term of the bond in years?");
       int Term = Ter.nextInt();
        
        
        //calculates PV of bond
        double PresentValue;
        
        PresentValue = CouponPayment * ((1 - (Math.pow((1 + BondInterest),(-Term))))/1);
        
        System.out.println("The present value of the bond is: " + PresentValue);
        
        
    }
    
}
