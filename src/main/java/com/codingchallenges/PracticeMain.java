package com.codingchallenges;

import com.codingchallenges.medium.*;
import com.codingchallenges.easy.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeMain {

    private static Logger LOGGER = LogManager.getLogger(PracticeMain.class);
    public static void main(String[] args){
        //String[] strings = {"cool","lock","cook"};
        //LOGGER.debug(CommonCharacters.commonChars(strings));

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

       /* Meeting[] mergedRanges = new Meeting[5];
        mergedRanges[0] = new Meeting(1,3);
        mergedRanges[1] = new Meeting(2,3);
        mergedRanges[2] = new Meeting(4,7);
        mergedRanges[3] = new Meeting(8,10);
        mergedRanges[4] = new Meeting(9,20);

        //merge meeting
        Meeting meeting = new Meeting();
        ArrayList<Meeting> mergedMeetings = meeting.mergeRanges(mergedRanges);
        for(Meeting m:mergedMeetings){
            System.out.format("Meeting(%s,%s)\n",m.getStartTime(),m.getEndTime());
        }

        */
        //System.out.println(ReverseStringInPlace.reverse("olaniyii"));
        /*String message = "face challenges with the right attitude!";
        System.out.println(String.valueOf(ReverseWords.reverse(message.toCharArray())));
         */
        /*int[] arr = {1,2,2,3,4,4,5,5,5,6};
        System.out.println(Arrays.toString(RemoveDuplicates.remove(arr)));*/

        System.out.println(UniqueCharacters.hasUniqueCharacters("olaniyyek"));



    }
}
