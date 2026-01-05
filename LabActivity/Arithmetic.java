import java.util.Scanner;
import java.util.Random;

public class ArithmeticGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        int totalQuestions = 5; 

        System.out.println("=== Welcome to the Arithmetic Game! ===");
        System.out.println("Answer the following " + totalQuestions + " questions:");

        for (int i = 1; i <= totalQuestions; i++) {
            int num1 = rand.nextInt(20) + 1; 
            int num2 = rand.nextInt(20) + 1;
            int correctAnswer = 0;
            char operator;

            int op = rand.nextInt(4); 
            switch(op) {
                case 0:
                    operator = '+';
                    correctAnswer = num1 + num2;
                    break;
                case 1:
                    operator = '-';
                    correctAnswer = num1 - num2;
                    break;
                case 2:
                    operator = '*';
                    correctAnswer = num1 * num2;
                    break;
                default:
                    operator = '/';
                    while(num2 == 0) {
                        num2 = rand.nextInt(20) + 1;
                    }
                    correctAnswer = num1 / num2;
                    break;
            }

            System.out.print("Q" + i + ": " + num1 + " " + operator + " " + num2 + " = ");
            int userAnswer = input.nextInt();

            if(userAnswer == correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + correctAnswer);
            }
        }

        System.out.println("\nGame Over! Your score: " + score + "/" + totalQuestions);
        input.close();
    }
}
