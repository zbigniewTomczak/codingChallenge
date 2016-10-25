package challenge01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderingTest {

	@Test
	public void orderedWord_emptyString_returnsInvalidStringMessage() {
		// given
		String emptyString = "";
		String invalidMessage = "Invalid String!";
		Ordering ordering = new Ordering();
		// when
		String result = ordering.orderWord(emptyString);
		//then
		assertEquals(invalidMessage, result);
	}

}
