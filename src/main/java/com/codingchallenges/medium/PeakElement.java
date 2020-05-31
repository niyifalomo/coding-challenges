package com.codingchallenges.medium;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * https://leetcode.com/problems/find-peak-element/
 * A peak element is an element that is greater than its neighbors.
 * Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * You may imagine that nums[-1] = nums[n] = -∞.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 * Example 2:
 *
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 1 or 5
 * Explanation: Your function can return either index number 1 where the peak element is 2,
 *              or index number 5 where the peak element is 6.
 */

public class PeakElement {
    private static final Logger LOGGER = LogManager.getLogger(PeakElement.class);
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        int n = nums.length;
        LOGGER.debug(findPeakElement(nums,0,n-1));
    }

    public static int findPeakElement(int[] nums, int startIndex, int lastIndex) {
        //using recursive binary search

        if (startIndex == lastIndex) return startIndex;
        int middleIndex=(startIndex+lastIndex)/2;
        if (nums[middleIndex] > nums[middleIndex+1]) {
            return findPeakElement(nums,startIndex,middleIndex);
        }
        else{
            return findPeakElement(nums, middleIndex + 1, lastIndex);
        }

    }
}
