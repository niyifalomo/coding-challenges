package com.codingchallenges.easy;

import java.util.ArrayDeque;
import java.util.Deque;

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
