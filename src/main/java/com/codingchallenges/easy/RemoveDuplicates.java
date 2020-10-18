package com.codingchallenges.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    /*
        Returns distinct values from sorted array.
     */
    public static int[] remove(int[] nums) {
        int len =nums.length;
        if(len<2) return nums;
        List<Integer> distincts = new ArrayList<Integer>();

        for(int i=0;i<len-1;i++) {
            if(nums[i] != nums[i+1]) distincts.add(nums[i]);
        }
        distincts.add(nums[len-1]);

        return  distincts.stream().mapToInt(Integer::intValue).toArray();
    }
}

