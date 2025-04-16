import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("Please enter a game score (format: Home:Visitor|21:9): ");
        String input = scanner.nextLine();

        // Split into two parts: team names and scores
        String[] parts = input.split("\\|");

        // Split team names and scores
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        String team1 = teams[0];
        String team2 = teams[1];


        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        // Determine and print the winner
        if (score1 > score2) {
            int difference = score1 - score2;
            System.out.println("Winner: " + team1 +  "\nBy " + difference + " points");
        } else if (score2 > score1) {
            int difference = score2 - score1;
            System.out.println("Winner: " + team2 + "\nBy " + difference + " points");
        } else {
            System.out.println("It's a tie!");
        }
    }
}