package challenge04;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NarcissisticTest {
	@Test
	public void acceptancePositive() {
		// given
		Narcissistic narcissistic = new Narcissistic();
		//then
		assertTrue(narcissistic.isNarcissistic(1));
		assertTrue(narcissistic.isNarcissistic(153));
		assertTrue(narcissistic.isNarcissistic(370));
		assertTrue(narcissistic.isNarcissistic(371));
		assertTrue(narcissistic.isNarcissistic(407));
		assertTrue(narcissistic.isNarcissistic(1634));
		assertTrue(narcissistic.isNarcissistic(8208));
		assertTrue(narcissistic.isNarcissistic(9474));
		assertTrue(narcissistic.isNarcissistic(54748));
		assertTrue(narcissistic.isNarcissistic(92727));
		assertTrue(narcissistic.isNarcissistic(93084));
		assertTrue(narcissistic.isNarcissistic(548834));
		assertTrue(narcissistic.isNarcissistic(1741725));
		assertTrue(narcissistic.isNarcissistic(4210818));
		assertTrue(narcissistic.isNarcissistic(9800817));
		assertTrue(narcissistic.isNarcissistic(4679307774L));
	}
}
