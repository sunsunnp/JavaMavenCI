package com.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.main.Calculate;

public class CalculateTest {
	
	public int score;
	public Calculate cal;
	
	@Before
	public void initScoreZero() {
		this.score = 0;
	}
	
	@Before
	public void initCalculateClass() {
		this.cal = new Calculate();
	}

	@Test
	public void getScoreFromSetScorebyScore() {
		this.score = 100;
		
		int expected = 100;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void getScoreFromSetScorebyScore0() {
		this.score = 0;
		
		int expected = 0;
		
		cal.setScore(this.score);
		int actual = cal.getScore();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculatebyScore100() {
		this.score = 100;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculatebyScore80() {
		this.score = 80;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void gradeAFromSetScoreAndCalculatebyScore90() {
		this.score = 90;
		
		String expected = "A";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void gradeBplusFromSetScoreAndCalculatebyScore75() {
		this.score = 75;
		
		String expected = "B+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void gradeBplusFromSetScoreAndCalculatebyScore79() {
		this.score = 79;
		
		String expected = "B+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void gradeBplusFromSetScoreAndCalculatebyScore77() {
		this.score = 77;
		
		String expected = "B+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void gradeBFromSetScoreAndCalculatebyScore70() {
		this.score = 70;
		
		String expected = "B";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeBFromSetScoreAndCalculatebyScore74() {
		this.score = 74;
		
		String expected = "B";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeBFromSetScoreAndCalculatebyScore72() {
		this.score = 72;
		
		String expected = "B";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeCplusFromSetScoreAndCalculatebyScore65() {
		this.score = 65;
		
		String expected = "C+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeCplusFromSetScoreAndCalculatebyScore69() {
		this.score = 69;
		
		String expected = "C+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeCplusFromSetScoreAndCalculatebyScore67() {
		this.score = 67;
		
		String expected = "C+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeCFromSetScoreAndCalculatebyScore60() {
		this.score = 60;
		
		String expected = "C";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeCFromSetScoreAndCalculatebyScore64() {
		this.score = 64;
		
		String expected = "C";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeCFromSetScoreAndCalculatebyScore62() {
		this.score = 62;
		
		String expected = "C";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeDplusFromSetScoreAndCalculatebyScore55() {
		this.score = 55;
		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeDplusFromSetScoreAndCalculatebyScore59() {
		this.score = 59;
		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeDplusFromSetScoreAndCalculatebyScore57() {
		this.score = 57;
		
		String expected = "D+";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeDFromSetScoreAndCalculatebyScore50() {
		this.score = 50;
		
		String expected = "D";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeDFromSetScoreAndCalculatebyScore54() {
		this.score = 54;
		
		String expected = "D";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeDFromSetScoreAndCalculatebyScore52() {
		this.score = 52;
		
		String expected = "D";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeFFromSetScoreAndCalculatebyScore49() {
		this.score = 49;
		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeFFromSetScoreAndCalculatebyScore0() {
		this.score = 0;
		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void gradeFFromSetScoreAndCalculatebyScore25() {
		this.score = 25;
		
		String expected = "F";
		
		cal.setScore(this.score);
		String actual = cal.calculateGrade();
		
		Assert.assertEquals(expected, actual);
	}
}
