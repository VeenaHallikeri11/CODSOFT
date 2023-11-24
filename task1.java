import java.util.Random; 
import java.util.Scanner; 
  
public class task1 { 
    public static void main(String args[]) 
    {  
        int answer,guessno;  
        final int MAX = 100;  
        Scanner sc = new Scanner(System.in);  
        Random rand = new Random();
        boolean Correct = false; 
        answer = rand.nextInt(MAX)+1; 
        while (!Correct) {
            System.out.println("Guess a number between  1 and 100: "); 
            guessno = sc.nextInt();  
            if (guessno > answer) 
            { 
                System.out.println("Too high, play again"); 
            }
            else if (guessno < answer) { 
                System.out.println("Too low, play again"); 
            }
            else
             { 
                System.out.println("Yes, you guessed the correct  number!"); 
                Correct = true; 
            } 
        } 
       sc.close(); 
    } 
}