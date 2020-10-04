package com.codingchallenges.easy;

public class ReverseStringInPlace {

    public static String reverse(String str){

        int rightIndex = str.length()-1;
        int leftIndex = 0;
        char[] strArray = str.toCharArray();

        while (leftIndex < rightIndex)
        {
            char rightTemp = strArray[rightIndex];
            strArray[rightIndex]= strArray[leftIndex];
            strArray[leftIndex] = rightTemp;

            leftIndex++; rightIndex--;

        }
        return String.valueOf(strArray);
    }
}
