/* Type any missing code here */
import java.util.Scanner;

public class QuizTest {
   
	public static void main( String[] args) {
		Scanner in = new Scanner(System.in);
		String response;
		
		//Question 1 : short answer
		QuizQuestion q1 = new QuizQuestion("2*2= ?", "4");
		//Display the question
		System.out.println(q1);
		//Get an answer from the user
		response = in.nextLine();
		//Return boolean type
		System.out.println(q1.isAnswerCorrect(response));
		
		// Question2 : multiple choice
		Quiz4ChoiceQuestion q2 = new Quiz4ChoiceQuestion("What color is the ocean ?", "Blue", "Yellow", "Pink", "Orange", "A");

		/* Complete the rest of the code here */
		
		System.out.println(q2);
		response = in.nextLine();
		System.out.println(q2.isAnswerCorrect(response));
		
		in.close();
	}
}