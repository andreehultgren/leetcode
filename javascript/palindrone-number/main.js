/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
  const x_string = x.toString();
  for (var i = 0; i < x_string.length / 2; i++) {
    if (x_string[i] !== x_string[x_string.length - i - 1]) {
      return false;
    }
  }
  return true;
};
