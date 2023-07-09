package Tic_Tac_Toe_GameProject;
//Final Code with Board full feature

//Still to work on and auto start new game feature!

import java.util.Scanner;

public class FinalGame {
    public static void main(String[] args) {
        char[][] playingBorad = new char[3][3];
        EmptyBorad(playingBorad);

        //Taking Players Name
        Scanner in = new Scanner(System.in);  // for Taking input

        System.out.print("Enter player1 Name :");
        String player1 = in.nextLine();

        System.out.print("Enter player2 Name : ");
        String player2 = in.nextLine();


        //created a player
        char player = 'X';
        boolean isGameOver = false;  // to check weather game is over or not

        while (!isGameOver) {
            printBoard(playingBorad);  // Printing board first for playing  (Actual Board is printing here.)
            if (player == 'X') {
                System.out.print(player1 + " please enter your co-ordinates: ");
            } else {
                System.out.print(player2 + " please enter your co-ordinates: ");
            }


            //Taking input of coordinates to place elements
            int row = in.nextInt();
            int col = in.nextInt();
            System.out.println();



            //Checking weather the given position is empty or not
            if (playingBorad[row][col] == ' ') {
                playingBorad[row][col] = player; // place the element
                isGameOver = isWon(playingBorad, player);  //checking the winning algorithm
                if (isGameOver) {
                    if (player == 'X') {
                        printBoard(playingBorad);
                        System.out.println(player1 + " has Won the game Congratulations ! ");
                        System.out.println();

                    } else {
                        printBoard(playingBorad);
                        System.out.println(player2 + " has Won the game Congratulations ! ");
                        System.out.println();

                    }
                } else {
                    if (player == 'X') {
                        player = 'O';
                        //System.out.println(player2 + "please enter your co-ordinates: ");
                    } else {
                        player = 'X';
                    }
                }
            } else {

                //Checking weather the board is full or not
                if (isFull(playingBorad)) {
                    System.out.println("Board is full, Starting New Game !");
                    EmptyBorad(playingBorad);
                    printBoard(playingBorad);
                    //break;
                } else {

                    //if board is not full then player can place element in empty space
                    System.out.println("Invalid move. Try another Positions ");
                    System.out.println();
                }
            }
        }
    }

    //winning algorithm
    public static boolean isWon(char[][] board, char player) {

        // check the horizontal winning positions
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }


        // check for vertical winning positions
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }


        // diagonal winning positions
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }


    //Method for Printing the board
    public static void printBoard(char[][] board) {
        //Sample board to identify the positions on board to place the element
        //For reference to players,so they don't need to count the coordinates
        char[][] sampleBoard = new char[3][3];
        for (int row = 0; row < sampleBoard.length; row++) {
            for (int col = 0; col < sampleBoard[row].length; col++) {
                System.out.print("(" + row + "" + col + ") | ");
            }
            System.out.println();
        }

        System.out.println("Above board show the co-coordinates for board positions,enter the co-ordinates of position where you want to place the element  ");


        //Main board where players are placing the elements
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");

            }
            System.out.println();
        }
    }


    //Checking weather the board is full or not
    public static boolean isFull(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }


    //Initializing the  empty Board
    public static void EmptyBorad(char[][] playingBorad) {
        //Initialising it empty
        for (int row = 0; row < playingBorad.length; row++) {
            for (int col = 0; col < playingBorad[row].length; col++) {
                playingBorad[row][col] = ' ';
            }
        }
    }
}
