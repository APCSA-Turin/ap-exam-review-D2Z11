public class StringAnalyzer {
    /**
     * Returns a count of how many times smallStr occurs in largeStr, as
     * described in part (a)
     *
     * Precondition: largeStr is not null; smallStr is not null.
     * The length of smallStr is less than the length of largeStr.
     */
    public static int countRepeat(String largeStr, String smallStr) {
        int idx = largeStr.indexOf(smallStr);
        int count = 0;
        while (idx != -1) {
            count++;
            largeStr = largeStr.substring(idx + smallStr.length());
            idx = largeStr.indexOf(smallStr);
        }
        return count;
    }
}