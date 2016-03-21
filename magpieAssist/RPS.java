package magpieAssist;

import java.util.Random;


public class RPS {
	private static Random r = new Random();
	private static String computerPlay = "";
	private static String personPlay = "";
	
	public static void inputPlay(String play){
		personPlay = play;
	}
	
	public static String getCompPlay(){
		return computerPlay;
	}
	
	public static String determineWin(){
		String out = "";
    	if(personPlay.compareTo(computerPlay.toUpperCase().substring(0, 1))==0){
    		System.out.print("It's a tie!");
    	}else if(personPlay.equals("S")){
    		if(computerPlay.equals("paper")){
    			out = "Scisors cuts paper, you win!";
    		}else{
    			out = "Rock crushes scissors, you lose.";
    		}
    	}else if(personPlay.equals("P")){
    		if(computerPlay.equals("rock")){
    			out = "Paper covers rock, you win!";
    		}else{
    			out = "Scissors cuts paper, you lose.";
    		}
    	}else if(computerPlay.equals("scissors")){
    		out = "Rock crushes scissors, you win!";
    	}else{
    		out = "Paper covers rock, you lose.";
    	}
		return out;
		
	}
	
	public static void changeCompStatement(){
		String[] possibleCompPlays = new String[] {"rock", "paper", "scissors"};
    	int computerInt = r.nextInt(3);
    	computerPlay = possibleCompPlays[computerInt];
	}
}
