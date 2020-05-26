package com.codingchallenges.medium;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.util.HashMap;

/**
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
    private static final Logger LOGGER = LogManager.getLogger(SmallestMissingInteger.class);
    public static void main(String[] args) {
        //int[] nums ={2, 3, 7, 6, 8, -1, -10, 15};
        //int[] nums = { 2, 3, -7, 6, 8, 1, -10, 15 };
        //int[] nums= {7,8,9,11,12};
        //int[] nums={4,1,2,3};
        //int[] nums={1};
        //int[] nums = {1,2,3,4,5};
        int[] nums = {-1,1,2,3,45,100,39,4,5};
        LOGGER.debug("Smallest Missing Integer: {}", smallestInteger(nums));
    }

    public static int smallestInteger(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Boolean> positiveNumbers= new HashMap<>();

        if (n==0) return 1;
        //keep track of positive numbers that exist in input array
        for (int i=0;i<n;i++) {
            if (nums[i]>0) positiveNumbers.put(nums[i],true);
        }
        // get the first integer not present in inout array
        for(int i=1;i<=n;i++) {
            if (positiveNumbers.get(i)==null) return i;
        }
        return n+1;
    }
}
