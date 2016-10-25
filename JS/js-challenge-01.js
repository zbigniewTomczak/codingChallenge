var assert = require('assert');

/* The challenge is to find proper name of this function */
function XXX(numbers){
  return getFirstPart(numbers) + " " + getSecondPart(numbers);
}

function getFirstPart(numbers) {
  return "(" + getNumbers(numbers, 0, 3) + ")";
}

function getNumbers(numbers, start, end) {
  return numbers.slice(start, end).join("");
}

function getSecondPart(numbers) {
  return getNumbers(numbers, 3, 6) + "-" + getNumbers(numbers, 6, 10);
}

it('getNumbers', function() {
    //given
	//when
	var retNumbers = getNumbers(numbers, start, end);
	//then
    assert.equal(expected, retNumbers);
});
