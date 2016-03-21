package magpie;

import magpieAssist.RPS;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Main
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String[] randomResponses = new String[] {"Do you like potatos?", "404 Statement Not Found.", "No.", 
			"I do not want to build a snowman.", "Don't pull a 757."};
	private String prevResponse = "";
	protected static String response = "";
	private String in = "";
	final int NUMBER_OF_RESPONSES = randomResponses.length;
	
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
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

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		int whichResponse = (int)(Math.random() * NUMBER_OF_RESPONSES);
		String test = "";
		String out = "";
		while((!test.equals(prevResponse))&&(!test.equals(""))){
		whichResponse = (int)(Math.random() * NUMBER_OF_RESPONSES);
		test = randomResponses[whichResponse];
		}
		out = randomResponses[whichResponse];
		return out;
	}
	
	private String prepStatement(String statement){
		statement=statement.trim();
		statement=statement.toLowerCase();
		return statement;
	}
	
	public static void changeResponse(String in){
		response = in;
	}
	
	private static String flipString(String in){
		String out = "";
		char char1 = ' ';
		while(in.length()>0){
			out = out + in.substring(in.length()-1);
			in = in.substring(0, in.length()-1);
		}
		char1 = out.charAt(0);
		out = out + char1;
		out = out.toLowerCase();
		out = out.substring(1);
		in = "" + out.charAt(0);
		in = in.toUpperCase();
		out.replaceFirst(out.substring(0,1), in);
		out.replaceAll(" i ", " I ");
		out.replaceAll(" i.", " I.");
		return out;
	}
	
	public static void playRPS(String play){
		RPS.inputPlay(play);
		RPS.changeCompStatement();
		System.out.printf("I played %s.\n", RPS.getCompPlay());
		response = RPS.determineWin();
	}
}
