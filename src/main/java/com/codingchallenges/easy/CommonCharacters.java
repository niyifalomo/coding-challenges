package com.codingchallenges.easy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

/**
 * Given an array A of strings made only from lowercase letters, return a list of all characters that show up in all strings within the list (including duplicates).  For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.
 * You may return the answer in any order.
 *
 * Example 1:
 * Input: ["bella","label","roller"]
 * Output: ["e","l","l"]
 *
 * Example 2:
 * Input: ["cool","lock","cook"]
 * Output: ["c","o"]
 *
 * Note:
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] is a lowercase letter
 */

public class CommonCharacters {

    public static List<String> commonChars(String[] A){
        List<String> lst = new ArrayList<>();
        String firstString=A[0];
        for (int i=0;i<firstString.length();i++) {
            Boolean allStringContainsChar= true;
            for (int j = 1; j < A.length; j++) {
                StringBuilder  str =  new StringBuilder();
                str.append(A[j]);
                int index = str.indexOf(String.valueOf(firstString.charAt(i)));
                if (index == -1) {
                    allStringContainsChar= false;
                    break;
                }
                else A[j] =String.valueOf(str.deleteCharAt(index));
            }
            if(allStringContainsChar) lst.add(String.valueOf(firstString.charAt(i)));
        }
        return lst;

        /*
        //Shorter but slower
        List<String> lst = new ArrayList<>();
        String firstString=A[0];
        for (int i=0;i<firstString.length();i++) {
            Boolean allContainsChar= true;
            for (int j = 1; j < A.length; j++) {
                String  c = String.valueOf(firstString.charAt(i));
                int index = A[j].indexOf(c);
                if (index == -1) allContainsChar= false;
                else  A[j] = A[j].replaceFirst(c,"");
            }
            if(allContainsChar) lst.add(String.valueOf(firstString.charAt(i)));
        }
        return lst;
         */
    }
}
