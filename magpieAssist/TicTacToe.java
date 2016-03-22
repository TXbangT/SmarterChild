package magpieAssist;

import java.util.*;
public class TicTacToe implements Game{
  private int[] info = new int [3][3];
  private String name = "TicTacToe";
  private Scanner s = new Scanner(System.in);
  private int x;
  private int y;
  public TicTacToe(){
  }
  /**
   * Starts the game
   */
  public void play(){
  	System.out.println("You are X Computer is O");
  	while(checkWin()==0()){
  		System.out.println("Input the location of your play");
  		System.out.print("X: ");
  		s = s.nextInt();
  		
  	}
  }
  
  /**
   * @Return 0 if no win; 1 if X win; 2 if O win; -1 if tie;
   */
  public int checkWin(){
  	if(info[0][0]==info[1][1]&&info[2][2]=info[0][0]){
  		
  	}
  }
}
