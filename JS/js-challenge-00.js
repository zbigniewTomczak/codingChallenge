var assert = require('assert');

/*
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells
 * and carries the "instructions" for the development and functioning of living organisms.
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
 * You have function with one side of the DNA you need to get the other complementary side.
 * DNA strand is never empty or there is no DNA at all.

    complementaryDNA ("ATTGC") # return "TAACG"

    complementaryDNA ("GTAT") # return "CATA"

 */
function complementaryDNA(strand){

}

it('complementaryDNAForEmptyChain', function() {
    //given
    var empty = '';
	//when
	var ret = complementaryDNA(empty);
	//then
    assert.equal(empty, ret);
});
