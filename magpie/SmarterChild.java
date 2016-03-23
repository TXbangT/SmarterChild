package magpie;

import java.util.*;
import magpieAssist.*;

public class SmarterChild extends Main{
	private List<Information> info = new ArrayList<Information>();
	private Scanner s = new Scanner(System.in);
	public SmarterChild(){
		getName();
		getAge();
		info.add(new Information("Games Known", getGames()));
	}
	
	private void getName(){
		System.out.println("What is your name?");
		info.add(new Information("Name", s.next()));
		System.out.println("Hello " + returnName()+", I am a smarter child of Magpie. Let's talk.");
	}
	
	private void getAge(){
		System.out.println("How old are you?");
		info.add(new Infomation("Age", s.next()));
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
	
	public String returnAge()
	{
		for(Information e: info)
			if(e.getType.equals("Age"))
				return e;
	}
	
	public String getResponse(String statement)
	{
		in = prepStatement(statement);
		if(in.equals("say something")){
			response = "I'm giving up on you";
		}
		else if (in.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (in.indexOf("mother") >= 0
				|| in.indexOf("father") >= 0
				|| in.indexOf("sister") >= 0
				|| in.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}else if(in.indexOf("rock")>=0){
			playRPS("R");
		}else if(in.indexOf("scissors")>=0){
			playRPS("S");
		}else if(in.indexOf("paper")>=0){
			playRPS("P");
		}else if(in.indexOf("backwards")>=0||in.indexOf("reverse")>=0){
			response = flipString(getRandomResponse());
	    }else{
			response = getRandomResponse();
		}
		prevResponse = response;
		return response;
	}
}
