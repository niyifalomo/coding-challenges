package com.codingchallenges.easy;

import java.util.ArrayDeque;
import java.util.Deque;

/*

https://leetcode.com/problems/reverse-words-in-a-string/

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
 */

public class ReverseWords {

    //Method 1 Using Deque
    public static String reverse(String s) {

        int left = 0;
        int right = s.length() - 1;

        // trim leading and trailing spaces

        while (left <= right && s.charAt(left) == ' ') ++left;
        while (left <= right && s.charAt(right) == ' ') --right;

        //Deque to hold words
        Deque<String> deque =  new ArrayDeque();

        StringBuilder word = new StringBuilder();

        while (left <= right){
            char c = s.charAt(left);

            if (word.length() != 0 && c == ' ')
            {
                deque.offerFirst(word.toString());
                word.setLength(0);
            }
            else if ( c !=' '){
                word.append(c);
            }

            ++left;
        }
        deque.offerFirst(word.toString());


        return String.join(" ",deque);

    }

    //Method 2, reversing all characters , then reversing each character
    public static char[] reverse(char[] strArray) {

        reverseCharacters(strArray,0,strArray.length-1);
        int wordStartIndex=0;
        for (int i=0;i<=strArray.length;i++){
            if( i == strArray.length || strArray[i] == ' '){
                reverseCharacters(strArray,wordStartIndex,i-1);
                wordStartIndex =i +1;
            }
        }
        return strArray;
    }

    private static void reverseCharacters(char[] strArray,int startIndex, int lastIndex){
        int rightIndex = lastIndex;
        int leftIndex = startIndex;

        while (leftIndex < rightIndex)
        {
            char rightTemp = strArray[rightIndex];
            strArray[rightIndex]= strArray[leftIndex];
            strArray[leftIndex] = rightTemp;

            leftIndex++; rightIndex--;

        }
    }
}
