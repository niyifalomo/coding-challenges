package com.codingchallenges;

import com.codingchallenges.easy.*;
import com.codingchallenges.hard.*;
import com.codingchallenges.medium.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PracticeMain {

    private static Logger LOGGER = LogManager.getLogger(PracticeMain.class);
    public static void main(String[] args){
        String[] strings = {"cool","lock","cook"};
        LOGGER.debug(CommonCharacters.commonChars(strings));

        /*
         int[] nums = {3, 4, 5, 6, 7}; int target = 8;
        int[] indices = twoSum(nums, target);
        LOGGER.debug("Indices: {},{}", indices[0], indices[1]);


        String S = "adebimpeb";
        char C = 'b';
        LOGGER.debug("Shortest Distance to {}: ",Arrays.toString(shortestDistance(S, C)));


        int[] nums = {1,2,1,3,5,6,4};
        int n = nums.length;
        LOGGER.debug(findPeakElement(nums,0,n-1));


        int[] nums = {-1,1,2,3,45,100,39,4,5};
        LOGGER.debug("Smallest Missing Integer: {}", smallestInteger(nums));
         */



    }
}
