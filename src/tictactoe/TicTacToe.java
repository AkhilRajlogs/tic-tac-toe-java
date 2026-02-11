package tictactoe;

import java.util.Scanner;

public class TicTacToe {

    private Player player1, player2;
    private Board board;


    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.startGame();
    }


    public void startGame() {
        Scanner s = new Scanner(System.in);
        //Take player input
        player1 = takePlayerInput(1, s);
        player2 = takePlayerInput(2, s);
        
        //check duplicate symbol
        while (player1.getSymbol()==player2.getSymbol()){
            System.out.println("Symbol already taken!! Please re-enter a different symbol.");
            player2.setSymbol(s.next().charAt(0));
            s.nextLine(); // to clean up left over and \n before next scan
        }

        //Create the Board            
            board = new Board(player1.getSymbol(), player2.getSymbol());

            board.printBoard();
        //Play the Game
        boolean player1Turn = true;

        //to be upgraded later
        while (true) {
            Player currentPlayer = player1Turn ? player1 : player2;
            System.out.print("Hi "+ currentPlayer.getName() + ", Enter row (1-3) of your move: ");
            int row = s.nextInt() - 1;

            System.out.print("Hi "+ currentPlayer.getName() + ", Enter column (1-3) of your move: ");
            int col = s.nextInt() - 1;
            s.nextLine();

            boolean moveMade = board.makeMove(row, col, currentPlayer.getSymbol());

            if (!moveMade) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board.printBoard();
            player1Turn = !player1Turn;
        }
    }

    private Player takePlayerInput(int num, Scanner s){
        System.out.println("Enter Player-" + num + " name: ");
        String name = s.nextLine();
        System.out.println("Enter Player-"+ num + " symbol: ");
        char symbol = s.next().charAt(0);
        s.nextLine(); // to clean up left over and \n before next scan

        return new Player(name, symbol);
    }
}
