package com.codingchallenges.medium;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/first-missing-positive
 * Given an unsorted integer array, find the smallest missing positive integer.
 * Example 1:
 * Input: [1,2,0]
 * Output: 3
 *
 * Example 2:
 * Input: [3,4,-1,1]
 * Output: 2
 *
 * Example 3:
 * Input: [7,8,9,11,12]
 * Output: 1
 *
 * Note:
 * Your algorithm should run in O(n) time and uses constant extra space.
 */


public class SmallestMissingInteger {

    public static int smallestInteger(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Boolean> positiveNumbers= new HashMap<Integer, Boolean>();

        if (n==0) return 1;
        //keep track of positive numbers that exist in input array
        for (int i=0;i<n;i++) {
            if (nums[i]>0) positiveNumbers.put(nums[i],true);
        }
        // get the first integer not present in input array
        for(int i=1;i<=n;i++) {
            if (positiveNumbers.get(i)==null) return i;
        }
        return n+1;
    }
}
