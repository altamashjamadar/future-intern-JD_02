import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Rock", "Paper", "Scissors"};
        String playAgain;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        do {

            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String userChoice = scanner.nextLine().trim();


            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = options[computerChoiceIndex];
            System.out.println("Computer chose: " + computerChoice);


            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);


            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.nextLine().trim().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thank you for playing!");
        scanner.close();
    }


    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "It's a tie!";
        }

        switch (userChoice.toLowerCase()) {
            case "rock":
                return (computerChoice.equals("Scissors")) ? "You win! Rock beats Scissors."
                        : "You lose! Paper beats Rock.";
            case "paper":
                return (computerChoice.equals("Rock")) ? "You win! Paper beats Rock."
                        : "You lose! Scissors beat Paper.";
            case "scissors":
                return (computerChoice.equals("Paper")) ? "You win! Scissors beat Paper."
                        : "You lose! Rock beats Scissors.";
            default:
                return "Invalid choice! Please choose Rock, Paper, or Scissors.";
        }
    }
}
