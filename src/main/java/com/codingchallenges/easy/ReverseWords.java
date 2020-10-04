package com.codingchallenges.easy;

public class ReverseWords {
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
