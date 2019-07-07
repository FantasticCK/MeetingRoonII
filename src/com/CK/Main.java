package com.CK;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{9, 14};
        int[] b = new int[]{5, 6};
        int[] c = new int[]{3, 5};
        int[] d = new int[]{12, 19};

        int[][] schedule = new int[4][2];
        schedule[0] = a;
        schedule[1] = b;
        schedule[2] = c;
        schedule[3] = d;

        Solution2 solution = new Solution2();
        System.out.println(solution.minMeetingRooms(schedule));
    }
}

// Rearrange Start and End, Sort
class Solution2 {
    public int minMeetingRooms(int[][] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int rooms = 0;
        int endsItr = 0;
        for (int i = 0; i < starts.length; i++) {
            if (starts[i] < ends[endsItr])
                rooms++;
            else
                endsItr++;
        }
        return rooms;
    }
}


