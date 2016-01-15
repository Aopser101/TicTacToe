import java.util.Scanner;
import java.util.Random;
public class TicTacToe
{
    char[][] board = new char[3][3];
    private int x;
    Scanner reader = new Scanner(System.in);
    char sign;
    public TicTacToe()
    {
    }
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    public Pair<Integer,Integer> makeMove(){
        boolean notfoundyet=true;
        Pair best = new Pair(0,0);
        int x,y;
        x=randInt(0,3);
        y=randInt(0,3);
        while(notfoundyet){
            if(board[x][y]== 'X' || board[x][y]=='O'){
                notfoundyet=true;
            }
            else{
                notfoundyet=false;
            }
        }
        best = new Pair(x,y);
        return best;
    }
    public void makeMoveforOpponent()
    {
        System.out.println("Make your move. Enter the x coordinate and then the y coordinate.");
        int boardx = reader.nextInt();
        int boardy = reader.nextInt();
        board[boardx][boardy]=sign;
    }
    public boolean hasWon(char board[][])
    {
        boolean yes=false;
        if(board[0][0]==board[0][1] && board[0][1]==board[0][2]){
            yes=true;
        }
        if(board[1][0]==board[1][1] && board[1][1]==board[1][2]){
            yes=true;
        }
        if(board[2][0]==board[2][1] && board[2][1]==board[2][2]){
            yes=true;
        }
        if(board[0][0]==board[1][0] && board[1][0]==board[2][0]){
            yes=true;
        }
        if(board[0][1]==board[1][1] && board[1][1]==board[2][1]){
            yes=true;
        }
        if(board[0][2]==board[1][2] && board[1][2]==board[2][2]){
            yes=true;
        }
        if(board[0][0]==board[1][1] && board[1][1]==board[2][2]){
            yes=true;
        }
        if(board[0][2]==board[1][1] && board[1][1]==board[2][0]){
            yes=true;
        }
        return yes;
    }
    public void printMap(char board[][]){
        for(int k=0;k<=2;k++){
            System.out.println("["+board[k][0]+"]"+"["+board[k][1]+"]"+"["+board[k][2]+"]");
        }
    }
}
