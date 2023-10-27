// Import the necessary Java Swing library for creating GUI components.
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Define the dimensions of the game board.
        int boardWidth = 600;
        int boardHeight = boardWidth;

        // Create a JFrame (window) for the game and set its title.
        JFrame frame = new JFrame("Snake");

        // Make the frame visible to the user.
        frame.setVisible(true);

        // Set the dimensions (width and height) of the frame.
        frame.setSize(boardWidth, boardHeight);

        // Center the frame on the screen.
        frame.setLocationRelativeTo(null);

        // Disable resizing of the frame.
        frame.setResizable(false);

        // Specify what should happen when the user closes the frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create an instance of the Snake_Game class, which represents the game board.
        Snake_Game snakeGame = new Snake_Game(boardWidth, boardHeight);

        // Add the Snake_Game component to the frame so it can be displayed.
        frame.add(snakeGame);

        // Pack the frame, which sizes it properly to fit its components.
        frame.pack();

        // Request focus for the Snake_Game component, so it can respond to user input.
        snakeGame.requestFocus();
    }
}
