package com.MoodAnalyser;

import org.junit.Assert;
import org.junit.Test;

	public class MoodAnalyserExceptionTest {

		@Test
		public void givenMessage_WhenSad_ShouldReturnSad() {
			MoodAnalyserException moodAnalyser = new MoodAnalyserException("SAD");
			String mood = moodAnalyser.analyseMood("This is a Sad Message");
			Assert.assertEquals("SAD", mood);
			}

		@Test
		public void givenMessage_WhenNotSad_ShouldReturnHappy() {
			MoodAnalyserException moodAnalyser = new MoodAnalyserException("HAPPY");
			String mood = moodAnalyser.analyseMood("This is a HAPPY Message");
			Assert.assertEquals("HAPPY", mood);
			}
		
		@Test
		public void givenMessage_WhenNotSad_ShouldReturnHappy1() {
			MoodAnalyserException moodAnalyser = new MoodAnalyserException(null);
			String mood = moodAnalyser.analyseMood("This is a null Message");
			Assert.assertEquals("HAPPY", mood);
			}
}



