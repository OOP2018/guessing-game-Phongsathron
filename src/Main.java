/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
            // upper limit for secret number in guessing game
            int upperBound = 100;
//            NumberGame game = new PhongsathronGame(upperBound);
            NumberGame game = new DumpGame(upperBound);
//            GameConsole ui = new GameConsole();
//            int solution = ui.play(game);

//            GameSolver solver = new GameSolver();
//            int solution = solver.play(game);

            GameDialog ui = new GameDialog();
            int solution = ui.play(game);
            
            //TODO display the answer returned by play
            System.out.println("Right! The secret number is "+solution);
            //TODO display how many guesses the user made
            System.out.println("User played "+game.getCount()+" times.");
	}
}
