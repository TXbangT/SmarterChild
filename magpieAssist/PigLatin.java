package magpieAssist;

public class PigLatin
{
private static String final AY = "ay";
private String translated = "";
private String start;
private String word = ""

public PigLatin(String s)
{
  start = s;
}

public String convertWord(String w){
  return w.substring(1) + w.substring(0,1) + AY;
}


//I need something to deal with punctuation
public void translate()
{
  while(start.length > 0)
  {
    if(start.indexOf(" ") > 0 && start.indexOf(" ") < start.length())
    {
    word = start.substring(0, start.indexOf(" "));
    start -= (word + " ");
    translated = convertWord(word) + " ";
    }
    else
    {
    word = start;
    start -= word;
    translated = convertWord(word);
    }
  }
}
public String getTranslated()
{
  return translated;
}

}
