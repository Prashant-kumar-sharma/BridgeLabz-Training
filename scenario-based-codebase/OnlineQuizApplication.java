/* 17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;

public class OnlineQuizApplication {

    // Method to display a question and its options
    public static void showQuestion(String question, String[] options) {
        System.out.println(question);
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i]);
        }
    }

    // Method to check answer using switch
    public static boolean checkAnswer(char userAnswer, char correctAnswer) {
        switch (userAnswer) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
                return userAnswer == correctAnswer;
            default:
                System.out.println("Invalid option! No marks awarded.");
                return false;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\n====================================================");
        System.out.println("               Online Quiz Application               ");
        System.out.println("====================================================\n");

        String[] questions = {
            "1. Which symbol is used to end a statement in Java?",
            "2. Which keyword is used to create an object in Java?",
            "3. Which data type is used to store true or false?",
            "4. Which loop executes at least once even if condition is false?",
            "5. Which keyword is used to take input from the user?"
        };

        String[][] options = {
            {"a) :", "b) .", "c) ;", "d) ,"},
            {"a) class", "b) object", "c) new", "d) create"},
            {"a) int", "b) boolean", "c) char", "d) float"},
            {"a) for", "b) while", "c) do-while", "d) if"},
            {"a) Scanner", "b) System", "c) input", "d) println"}
        };

        char[] answers = {'c', 'c', 'b', 'c', 'a'};
        int score = 0;

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {

            showQuestion(questions[i], options[i]);

            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = input.next().toLowerCase().charAt(0);

            if (checkAnswer(userAnswer, answers[i])) {
                System.out.println("Correct Answer!\n");
                score++;
            } else {
                System.out.println("Wrong Answer! Correct answer is: " + answers[i] + "\n");
            }
        }

        // Final result
        System.out.println("====================================================");
        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + " / " + questions.length);
        System.out.println("====================================================");

        input.close();
    }
}
