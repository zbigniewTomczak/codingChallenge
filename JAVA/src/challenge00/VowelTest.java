package challenge00;

import org.junit.Assert;
import org.junit.Test;

public class VowelTest {
	@Test
	public void vowelOne_acceptance1_returnCorrectlyEncoded() {
		// given
		Vowel vowel = new Vowel();
		// when
		String encoded = vowel.vowelOne("abceios");
		//then
		Assert.assertEquals("1001110", encoded);
	}

	@Test
	public void vowelOne_acceptance2_returnCorrectlyEncoded() {
		// given
		Vowel vowel = new Vowel();
		// when
		String encoded = vowel.vowelOne("aeiou, abc");
		//then
		Assert.assertEquals("1111100100", encoded);
	}
}
