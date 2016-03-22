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
		System.out.println("Hello " + returnName()+ "/nI am a smarter child of Magpie.");
	}
	
	private ArrayList<String> getGames(){
		List<String> out = new ArrayList<String>();
		out.add("TicTacToe")
	}
	
	public String returnName()
	{
		for(Information e:info)
			if(e.getType().equals("Name"))
				return e;
	}
}
