package tictactoe;
public class TicTacToe {

    private Player player1, player2;
    private Board board;


    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        t.startGame();
    }


    public void startGame() {
        //Take player input
        //Create the Board
            //temporary setup to check Board display
            player1 = new Player("Player 1", 'X');
            player2 = new Player("Player 2", 'O');

            board = new Board(player1.getSymbol(), player2.getSymbol());

            board.printBoard();
        //Play the Game
    }

    private Player takePlayerInput(int num){
        return null;//To be implemented
    }
}
