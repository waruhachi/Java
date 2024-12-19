import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> chars = new HashMap<>();

        for (char strChar : str.toCharArray()) {
            if (chars.get(strChar) != null) {
                chars.replace(strChar, (chars.get(strChar) + 1));
            } else {
                chars.put(strChar, 1);
            }
        }

        int maxCount = 0;
        char commonChar = ' ';
        
        for (char strChar : str.toCharArray()) {
            if (chars.get(strChar) > maxCount) {
                maxCount = chars.get(strChar);
                commonChar = strChar;
            }
        }

        return commonChar;
    }
}
