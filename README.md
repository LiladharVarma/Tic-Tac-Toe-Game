# Tic-Tac-Toe-Game
Tic-Tac-Toe Game
This is a Java project that implements a simple command-line version of the Tic-Tac-Toe game. The game allows two players to take turns and compete against each other to win.

How to Play
When the game starts, the empty game board is displayed.
Players are prompted to enter their names.
The first player is assigned the symbol 'X', and the second player is assigned the symbol 'O'.
Players take turns entering their coordinates to place their symbols on the board.
The game checks if the entered position is empty and valid. If it is, the symbol is placed on the board.
After each move, the game checks if a player has won by completing a row, column, or diagonal with their symbols.
If a player wins, the game ends, and the winner is announced.
If the board is full and no player has won, the game ends in a draw and a new game can be started.
Project Structure
The project consists of a single Java class named FinalGame. Here is an overview of the methods and their functionality:

main: The entry point of the program. It handles the game loop and player input.
isWon: Checks if a player has won the game by examining the game board.
printBoard: Prints the game board, including the sample board with coordinates for reference.
isFull: Checks if the game board is full, indicating a draw.
EmptyBoard: Initializes the game board to an empty state.
Usage
To use this project, follow these steps:

Set up a Java development environment with a compatible IDE.
Create a new Java project and add the FinalGame.java file to the project.
Compile and run the program.
Follow the on-screen prompts to play the Tic-Tac-Toe game.
Note: This project can be further enhanced to include features like an auto-start for new games and an improved user interface.
