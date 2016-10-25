package challenge03;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BracketTest {

	@Test
	public void closingBracketsAreEnclosingToOpeningBrackets() {
		// given
		Bracket openingRound  = new Bracket('(');
		Bracket openingSquare = new Bracket('[');
		Bracket openingCurly  = new Bracket('{');

		Bracket closingRound  = new Bracket(')');
		Bracket closingSquare = new Bracket(']');
		Bracket closingCurly  = new Bracket('}');
		// when
		//then
		assertThat(closingRound. isEnclosingTo(openingRound),  is(true));
		assertThat(closingSquare.isEnclosingTo(openingSquare), is(true));
		assertThat(closingCurly. isEnclosingTo(openingCurly),  is(true));
	}

	@Test
	public void openingBracketsAreNotEnclosingToClosingBrackets() {
		// given
		Bracket openingRound  = new Bracket('(');
		Bracket openingSquare = new Bracket('[');
		Bracket openingCurly  = new Bracket('{');

		Bracket closingRound  = new Bracket(')');
		Bracket closingSquare = new Bracket(']');
		Bracket closingCurly  = new Bracket('}');
		// when
		//then
		assertThat(openingRound. isEnclosingTo(closingRound),  is(false));
		assertThat(openingSquare.isEnclosingTo(closingSquare), is(false));
		assertThat(openingCurly. isEnclosingTo(closingCurly),  is(false));
	}

	@Test
	public void openingsAreNotEnclosingToTheSameBrackets() {
		// given
		Bracket openingRound  = new Bracket('(');
		Bracket openingSquare = new Bracket('[');
		Bracket openingCurly  = new Bracket('{');
		// when
		//then
		assertThat(openingRound. isEnclosingTo(openingRound),  is(false));
		assertThat(openingSquare.isEnclosingTo(openingSquare), is(false));
		assertThat(openingCurly. isEnclosingTo(openingCurly),  is(false));
	}

	@Test
	public void closingBracketsAreNotEnclosingToTheSameBrackets() {
		// given
		Bracket closingRoundA  = new Bracket(')');
		Bracket closingSquareA = new Bracket(']');
		Bracket closingCurlyA  = new Bracket('}');

		Bracket closingRoundB  = new Bracket(')');
		Bracket closingSquareB = new Bracket(']');
		Bracket closingCurlyB  = new Bracket('}');
		// when
		//then
		assertThat(closingRoundA. isEnclosingTo(closingRoundB),  is(false));
		assertThat(closingSquareA.isEnclosingTo(closingSquareB), is(false));
		assertThat(closingCurlyA. isEnclosingTo(closingCurlyB),  is(false));
	}

	@Test
	public void closingBracketsAreNotEnclosingToDifferentOpeningBrackets() {
		// given
		Bracket openingRound  = new Bracket('(');
		Bracket openingSquare = new Bracket('[');
		Bracket openingCurly  = new Bracket('{');

		Bracket closingRound  = new Bracket(')');
		Bracket closingSquare = new Bracket(']');
		Bracket closingCurly  = new Bracket('}');
		// when
		//then
		assertThat(closingSquare.isEnclosingTo(openingRound),  is(false));
		assertThat(closingCurly. isEnclosingTo(openingRound),  is(false));

		assertThat(closingRound. isEnclosingTo(openingSquare), is(false));
		assertThat(closingCurly. isEnclosingTo(openingSquare), is(false));

		assertThat(closingRound. isEnclosingTo(openingCurly),  is(false));
		assertThat(closingSquare.isEnclosingTo(openingCurly),  is(false));
	}

	@Test
	public void closingBracketsAreNotEnclosingToNull() {
		// given
		Bracket closingRound  = new Bracket(')');
		Bracket closingSquare = new Bracket(']');
		Bracket closingCurly  = new Bracket('}');
		// when
		//then
		assertThat(closingRound. isEnclosingTo(null), is(false));
		assertThat(closingSquare.isEnclosingTo(null), is(false));
		assertThat(closingCurly. isEnclosingTo(null), is(false));
	}

	@Test
	public void openingBracketsAreNotEnclosingToNull() {
		// given
		Bracket openingRound  = new Bracket('(');
		Bracket openingSquare = new Bracket('[');
		Bracket openingCurly  = new Bracket('{');
		// when
		//then
		assertThat(openingRound. isEnclosingTo(null), is(false));
		assertThat(openingSquare.isEnclosingTo(null), is(false));
		assertThat(openingCurly. isEnclosingTo(null), is(false));
	}
}
