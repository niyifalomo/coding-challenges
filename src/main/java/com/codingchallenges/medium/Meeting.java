package com.codingchallenges.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Meeting implements Comparable<Meeting> {

    private int startTime;
    private int endTime;

    public Meeting() {
    }

    public Meeting(int startTime, int endTime) {
        //number of 30mins blocks past 9:00AM
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }


    public ArrayList<Meeting> mergeRanges(Meeting[] meetingTimes) {
        ArrayList<Meeting> merged = new ArrayList<>();
        //Sort Meeting Times
        Arrays.sort(meetingTimes);
        //get first meeting time,,,compare with next merge them if in the same range.
        for (int i = 0; i < meetingTimes.length; i++) {
            int startTime = meetingTimes[i].startTime;
            int endTime = meetingTimes[i].endTime;
            int nextIndex = i+1;
            //compare with Next meeting
            if (nextIndex <meetingTimes.length && endTime >= meetingTimes[nextIndex].getStartTime()) {
                //merge with Next Meeting
                merged.add(new Meeting(startTime, meetingTimes[nextIndex].getEndTime()));
                i++;
            }
            else merged.add(new Meeting(startTime,endTime));
        }
        return merged;
    }

    @Override
    public int compareTo(Meeting m1) {
        return this.startTime  - m1.startTime;
    }
}



