## Tic-Tac-Toe Game

This is a Java project that implements a simple command-line version of the Tic-Tac-Toe game. The game allows two players to take turns and compete against each other to win.

### How to Play

1. When the game starts, the empty game board is displayed.
2. Players are prompted to enter their names.
3. The first player is assigned the symbol 'X', and the second player is assigned the symbol 'O'.
4. Players take turns entering their coordinates to place their symbols on the board.
5. The game checks if the entered position is empty and valid. If it is, the symbol is placed on the board.
6. After each move, the game checks if a player has won by completing a row, column, or diagonal with their symbols.
7. If a player wins, the game ends, and the winner is announced.
8. If the board is full and no player has won, the game ends in a draw and a new game can be started.

### Project Structure

The project consists of a single Java class named `FinalGame`. Here is an overview of the methods and their functionality:

- `main`: The entry point of the program. It handles the game loop and player input.
- `isWon`: Checks if a player has won the game by examining the game board.
- `printBoard`: Prints the game board, including the sample board with coordinates for reference.
- `isFull`: Checks if the game board is full, indicating a draw.
- `EmptyBoard`: Initializes the game board to an empty state.

### Usage

To use this project, follow these steps:

1. Set up a Java development environment with a compatible IDE.
2. Create a new Java project and add the `FinalGame.java` file to the project.
3. Compile and run the program.
4. Follow the on-screen prompts to play the Tic-Tac-Toe game.

Note: This project can be further enhanced to include features like an auto-start for new games and an improved user interface.
