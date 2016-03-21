package magpieAssist;

public class Information {
   private String type;
   private Object info;
   
   public Information(String tipe, Object inf){
	    type = tipe;
	    info = inf;
   }
   
   public String getType(){
	   return type;
   }
   
   public String getInfoString(){
	   return info.toString();
   }
   
   public Object getInfo(){
	   return info;
   }
   
   @Override
   public boolean equals(Object other){
	   if(other instanceof Information){
		   Information i = (Information)other;
	   return info.equals(i.getInfo()) && type.equals(i.getType());
	   }
	   return false;
   }
}
