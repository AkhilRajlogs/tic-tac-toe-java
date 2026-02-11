package tictactoe;

public class Board {
    private char board[][];
    private final int boardSize = 3; //initial board assumes a 3 X 3 game
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

    public void printBoard(){
        for( int i = 0; i  < boardSize; i++){
            for( int j = 0; j < boardSize; j++){
                System.out.print(board[i][j]);
                if(j<boardSize-1){
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i<boardSize-1){
                System.out.println("---------");
            }
        }
    }

    public boolean makeMove(int row, int col, char symbol){
        //check OutOfBound moves
        if(row < 0 || row >= boardSize || col <0 || col >=boardSize){
            return false;
        }

        //check if already occupied
        if(board[row][col] != EMPTY){ 
            return false;
        }
            //Make move
            board[row][col] = symbol;
            count++;
            
            return true;
        
    }

    public GameStatus getGameStatus(){
        return GameStatus.IN_PROGRESS;
    }
    


}
