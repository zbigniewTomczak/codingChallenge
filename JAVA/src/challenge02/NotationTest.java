package challenge02;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NotationTest {
	@Test
	public void underscoreToLowerCamelCase_emptyString_returnsEmptyString() {
		// given
		String emptyString = "";
		Notation notation = new Notation();
		// when
		String result = notation.underscoreToLowerCamelCase(emptyString);
		//then
		assertEquals(emptyString, result);
	}

}
