package com.codingchallenges.easy;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * https://leetcode.com/problems/two-sum/
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class TwoSum {
    private static final Logger LOGGER = LogManager.getLogger(TwoSum.class.getName());
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7}; int target = 8;
        int[] indices = twoSum(nums, target);
        LOGGER.debug("Indices: {},{}", indices[0], indices[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbersHash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (numbersHash.containsKey(diff)) {
                return new int[]{numbersHash.get(diff), i};
            }
            numbersHash.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
