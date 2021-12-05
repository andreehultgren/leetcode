/**
 * @param {string} s
 * @return {number}
 */
var romanToInt = function (s) {
  roman_dict = { I: 1, V: 5, X: 10, L: 50, C: 100, D: 500, M: 1000 };
  var value = 0,
    i = 0;
  while (i < s.length - 1) {
    if (roman_dict[s[i]] >= roman_dict[s[i + 1]]) {
      value += roman_dict[s[i]];
      i++;
    } else {
      value += roman_dict[s[i + 1]] - roman_dict[s[i]];
      i += 2;
    }
  }
  if (i == s.length - 1) {
    value += roman_dict[s[i]];
  }
  return value;
};
