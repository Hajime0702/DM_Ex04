import java.util.Random;
import java.util.Scanner;

public class diceGame{
    public static void main(String[] args){

	Random dice = new Random();

	int dice1 = dice.nextInt(6) + 1;
	int dice2 = dice.nextInt(6) + 1;
	int dice3 = dice.nextInt(6) + 1;
	int total = dice1 + dice2 + dice3;
	
	System.out.println("What is your name?");
	System.out.print(">");
	
	Scanner scan = new Scanner(System.in);
	String name = scan.next();
	
	System.out.println("Hello, " + name + "!");
	
	System.out.println("Rolling the dice...");
	System.out.println("die 1: " + dice1);
	System.out.println("die 2: " + dice2);
	System.out.println("die 3: " + dice3);
	System.out.println("Total value: " + total);

	if(total > 7)
	    System.out.println(name + " won!");
	else
	    System.out.println(name + " lost...");
    }
}
