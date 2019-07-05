import java.util.Random;

public class diceGame{
    public static void main(String[] args){

	Random dice = new Random();

	int dice1 = dice.nextInt(6) + 1;
	int dice2 = dice.nextInt(6) + 1;
	int total = dice1 + dice2;

	System.out.println("Rolling the dice...");
	System.out.println("die 1: " + dice1);
	System.out.println("die 2: " + dice2);
	System.out.println("Total value: " + total);
    }
}
