package givenNullReturnsHappy;

public class MoodAnalyser {
private String message;

	   public String analyserMood(String message) throws MoodAnalyserException {
	     return this.message = message;
	   }
	   
	   void analyserMood() {
		   this.message = message;
	   }
	 
	   public String MoodAnalyser() throws MoodAnalyserException {
	       try {
	           if (message.contains("Sad"))
	        	  if (message.contains("Sad"))
	        	     return "SAD";
	              else
	        	     return "HAPPY";
	       }  
	       catch (NullPointerException e) {
	    	   	throw new MoodAnalyserException( "Please enter Proper Mood");
	       }
	       			return "Happy";
	  }
}
