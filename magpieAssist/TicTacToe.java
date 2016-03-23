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
  	while(checkWin()==-1()){
  		System.out.println("Input the location of your play");
  		System.out.print("X: ");
  		s = s.nextInt();
  		
  	}
  }
  
  /**
   * @Return -1 if no win; 0 if X win; 1 if O win; 2 if tie;
   */
  public int checkWin(){
    int winTile -1;
  	if(info[0][0]==info[1][1]&&info[2][2]=info[0][0]){
  		winTile = info[0][0];
  	}else if(info[0][2]==info[1][1]&&info[2][0]=info[0][2]){
  	  winTile = info[1][1];
  	}else{
  	  for(int i = 0; i<3; i++){
  	    if(info[0][i]==info[1][i]&&info[2][i]==info[0][i]){
  	      winTile = info[0][i];
  	      break;
  	    }
  	  }
  	    for(int i = 0; i<3; i++){
  	      if(info[i][0]==info[i][1]&&info[i][2]==info[i][0]){
  	        winTile = info[i][0];
  	        break;
  	      }
  	    }
  	  }
  	  for(int i = 0; i<3; i++){
  	    for(int j = 0; j<3; j++){
  	      if(info[i][j]==0){
  	        winTile = 2;
  	        i=4;
  	        break;
  	      }
  	    }
  	  }
  	  return winTile;
  	}
  }
