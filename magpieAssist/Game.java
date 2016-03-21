package magpieAssist;

public interface Game {
	
	public String getName();
	
	public abstract String endGame();
	
	public void play();
	
	public abstract String computerMove();
	
	public abstract String move();
	
	public abstract void reset();
}
