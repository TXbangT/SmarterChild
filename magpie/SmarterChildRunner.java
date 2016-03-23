package magpie;

import java.util.*;
import magpieAssist.*;

public class SmarterChildRunner {

  public static void main(String[] args){
    SmarterChild child= new SmarterChild();
    child.
    Scanner s= new Scanner(in);
    String statement= s.nextLine();
    
    while (!statement.toUpperCase().equals("BYE")&&(!statement.toUpperCase().equals("GOODBYE")))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}

                in.close();
  }
}
