import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        String question = "What is the largest planet in our solar system? Earth, Jupiter or Saturn";
        String choiceOne = "Earth";
        String choiceTwo = "Jupiter";
        String choiceThree = "Saturn";

        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);

        // Write a print statement giving the answer choices
        System.out.println("Chose ono of the following: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree + ".");

        // Have the user input an answer
        Scanner scanner  = new Scanner(System.in);

        // Retrieve the user's input
        String input = scanner.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user.
        if(correctAnswer.equals(input.toLowerCase())) {
            System.out.println("That's correct answer!");
        } else {
            System.out.println("You are incorrect. Right anser is " + correctAnswer);
        }

        // If the user's input does not match the correctAnswer...
        // then the user is incorrect and we want to print out a message saying that the user is incorrect as well as what the correct choice was.

    }

}
