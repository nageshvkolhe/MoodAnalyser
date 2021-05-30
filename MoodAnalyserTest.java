package givenNullReturnsHappy;

import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserTest {

	    @Test
		public void givenNullMood_ShouldThrowException() {
	    	MoodAnalyser moodAnalyser = new MoodAnalyser();
	    	try {
	    		moodAnalyser.analyserMood(null);
	    	} catch (MoodAnalyserException e) {
	            Assert.assertEquals("Enter proper mood", moodAnalyser);
	    	}
	    }

}
