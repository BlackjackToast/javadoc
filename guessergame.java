package hilo;
import java.util.Scanner;


public class HiLo {

	public static void main(String[] args) {
		//input
		Scanner scan = new Scanner(System.in);
		//Create a random number
		int theNumber = (int) (Math.random() * 1000 + 1);
		System.out.println( theNumber );
		int guess = 0;
		while (guess != theNumber)
		System.out.println("Guess a number between 1 and 100:");
		//store user guess
		guess = scan.nextInt();
		//making sure the program is working so far
		System.out.println("You enter " + guess + ".");

	}

}
