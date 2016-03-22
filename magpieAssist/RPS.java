package magpieAssist;

import java.util.Random;


public class RPS implements Game{
	private static Random r = new Random();
	private static String computerPlay = "";
	private static String personPlay = "";
	private String output = "";
	
	public  void move(String move){
		personPlay = move;
	}
	
	public  String computerMove(){
		return computerPlay;
	}
	
	public  void Play(){
    	if(personPlay.compareTo(computerPlay.toUpperCase().substring(0, 1))==0){
    		output = "It's a tie!";
    	}else if(personPlay.equals("S")){
    		if(computerPlay.equals("paper")){
    			output = "Scisors cuts paper, you win!";
    		}else{
    			output = "Rock crushes scissors, you lose.";
    		}
    	}else if(personPlay.equals("P")){
    		if(computerPlay.equals("rock")){
    			output = "Paper covers rock, you win!";
    		}else{
    			output = "Scissors cuts paper, you lose.";
    		}
    	}else if(computerPlay.equals("scissors")){
    		output = "Rock crushes scissors, you win!";
    	}else{
    		output = "Paper covers rock, you lose.";
    	}
		return endGame();
		
	}
	
	public static void changeCompStatement(){
		String[] possibleCompPlays = new String[] {"rock", "paper", "scissors"};
    	int computerInt = r.nextInt(3);
    	computerPlay = possibleCompPlays[computerInt];
	}
	
	public String getName()
	{
	return "Rock Paper Scissors";	
	}
	
	public String endGame(){
		return output + " Good Game!";
	}
}
