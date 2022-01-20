import java.io.PrintStream;
import java.util.Scanner;

public class CollatzConjecture {
	PrintStream out;
	Scanner scan;

	CollatzConjecture () {
		out = new PrintStream(System.out);
		scan = new Scanner(System.in);
	}

	public int start() {
		// Enter an integer
		out.printf("Enter an integer: ");
		int firstInt = scan.nextInt();

		// keep count of all the numbers to get to one
		int counter = 0;
		
		out.printf("%d ", firstInt);
		
		// check that the input isn't one 
		if (firstInt == 1) throw new IllegalArgumentException("Please pick an integer greater than 1");
		while (firstInt != 1) {
			int secondInt = firstInt % 2;

			if (secondInt == 0) {
				firstInt = (firstInt / 2);
				counter++;
			} else {
				firstInt = (3 * firstInt + 1);
				counter++;
			}

			out.printf(" %d ", firstInt);
		}
		out.println("It will take " + counter + " try's to reach 1");
		return counter;
	
	}

	public static void main(String[] args) {
		new CollatzConjecture().start();
	}
	
}