package com.codingchallenges.easy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;

/**
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 * Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.
 * Example 1:
 * Input: S = "loveleetcode", C = 'e'
 * Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 *
 * Note:
 * S string length is in [1, 10000].
 * C is a single character, and guaranteed to be in string S.
 * All letters in S and C are lowercase.
 */
public class ShortestDistanceToCharacter {

    private static final Logger LOGGER = LogManager.getLogger(ShortestDistanceToCharacter.class.getName());

    public static void main(String[] args) {
        String S = "adebimpeb";
        char C = 'b';
        LOGGER.debug("Shortest Distance to {}: ",Arrays.toString(shortestDistance(S, C)));
    }

    public static int[] shortestDistance(String inputStr, char targetCharacter) {
        int[] result = new int[inputStr.length()];
        int prevTargetIndex = 10000;
        //forward pass
        for (int i = 0; i < inputStr.length(); i++) {
            if (inputStr.charAt(i) == targetCharacter) prevTargetIndex = i;
            result[i] = i - prevTargetIndex;
        }
        prevTargetIndex = 10000;
        //backward pass
        for (int i = inputStr.length() - 1; i > -1; i--) {
            if (inputStr.charAt(i) == targetCharacter) prevTargetIndex = i;
            result[i] = Math.min(Math.abs(result[i]),  prevTargetIndex - i);
        }
        return result;
    }

}
