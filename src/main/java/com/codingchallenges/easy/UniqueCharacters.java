package com.codingchallenges.easy;
import java.util.*;

public class UniqueCharacters {
    public static boolean hasUniqueCharacters(String str) {
        HashMap<Character,Integer> uniqueValues = new HashMap<>();
        for(int i =0 ;i< str.length();i++){
            char ch = str.charAt(i);
            if (uniqueValues.containsKey(str.charAt(i))) return false;
            uniqueValues.put(ch,i);
        }
        return true;

    }
}
