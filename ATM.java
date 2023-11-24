import java.io.*; 
public class ATM{  
    public static void Balance(int balance) 

    { 
       System.out.println("Current Balance of your account :" +balance); 
        System.out.println(); 

    } 
    public static int Withdrawing(int balance,  int withdrawAmount) 

    { 

        System.out.println("Withdrawn Operation is Going!"); 

        System.out.println(" Your Withdrawn amount is:" + withdrawAmount); 

        if (balance >= withdrawAmount) { 

            balance = balance - withdrawAmount; 

            System.out.println("Please collect your money and collect your card back"); 

           Balance(balance); 

        } 

        else { 

            System.out.println("Sorry! Insufficient Balance on your account!"); 

            System.out.println(); 

        } 

        return balance; 

    } 
    public static int Depositing(int balance,int depositAmount) 

    { 

        System.out.println("Deposit Operation is going!"); 

        System.out.println(" your Depositing amount  is:" + depositAmount); 

        balance = balance + depositAmount; 

        System.out.println("Your Money has been successfully deposited"); 

        Balance(balance); 

        return balance; 

    } 

    public static void main(String args[]) 

    { 

        int balance = 25000; 
        int withdrawAmount = 5000; 
        int depositAmount = 2000;  
        Balance(balance);
        balance = Withdrawing(balance, withdrawAmount); 
        balance = Depositing(balance, depositAmount); 

    } 
}