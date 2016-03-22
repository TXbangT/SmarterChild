package magpie;

import java.util.*;
import magpieAssist.*;

public class SmarterChild extends Main{
	private List<Information> info = new ArrayList<Information>();
	private Scanner s = new Scanner(System.in);
	public SmarterChild(){
		getName();
		info.add(new Information("Games Known", getGames()));
	}
	
	private void getName(){
		System.out.println("What is your name?");
		info.add(new Information("Name", s.next()));
	}
	
	private ArrayList<String> getGames(){
		List<String> out = new ArrayList<String>();
		out.add("TicTacToe")
	}
	
	public String respond(String statement)
	{
		String response="";
		if(statement.toUpperCase().indexOf("MY NAME")>=0)
		response= "Your name is "+Information.getInfo();
	}
}
