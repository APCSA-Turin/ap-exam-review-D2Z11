public class StringPatterns {
  /** Returns the String that results when letter and pattern are
    * compared, as described in part (a)
    *
    * Precondition: letter consists of one uppercase letter.
    *     pattern has at least 2 letters and all letters are uppercase
    *     and unique.
    */
  public static String letterAndPattern(String letter, String pattern) {
      // first check if in the string
if (pattern.indexOf(letter) != -1) {
	return letter;
} else {
// if not, reverse string
	String newStr = "";
for (int i = pattern.length() - 1; i>=0; i--) {
	newStr += pattern.charAt(i);
}
return newStr;
}

  }
}