var assert = require('assert');
/* Complete the solution so that it splits the string
into pairs of two characters.
If the string contains an odd number of characters
then it should replace the missing
second character of the final pair with an underscore ('_').

Examples:

solution('abc') // should return ['ab', 'c_']
solution('abcdef') // should return ['ab', 'cd', 'ef']

*/

function solution(s) {

}

it('empty string', function() {
    //given
    var testString = '';
    var expected = [];
    //when
    var ret = solution(testString);
    //then
    assert.deepEqual(expected, ret);
});
