package magpieAssist;

public interface Game {
	
	/**
	 * Returns the name of the game 
	 */
	public String getName();
	
	/**
	 *  Ends the game and determines a winner 
	 */
	public String endGame();
	
	/**
	 * Starts the game
	 */
	public void play();
	
	/**
	 * Makes a move for the computer
	 */
	public String computerMove();
	
	/**
	 * Makes a move given a string input
	 */
	public String move(String move);
	

}
