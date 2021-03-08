package testproj.calcproj;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class testcase {
	
	private static calc calculator;
	
	@BeforeClass 
	public static void setup() {
		calculator = new calc();
	}
	
	@Test
	public void testadd() {
		assertEquals(10,calculator.add(7, 3));
	}
}