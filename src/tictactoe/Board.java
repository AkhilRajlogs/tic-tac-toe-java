package tictactoe;

public class Board {
    private char board[][];
    private int boardSize = 3;
    private char p1Symbol, p2Symbol;
    //to count total number of cells filled:-
    private int count;
    private static final char EMPTY = ' ';

    public Board(char p1Symbol, char p2Symbol){
        board = new char[boardSize][boardSize];
        for(int i = 0; i < boardSize; i++){
            for(int j = 0; j < boardSize; j++){
                board[i][j] = EMPTY;
            }
        }
        //Currently the board assumes a 2 player game with fixed symbols
        this.p1Symbol = p1Symbol;
        this.p2Symbol = p2Symbol;
    }
    


}
