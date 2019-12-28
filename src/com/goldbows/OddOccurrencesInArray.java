package com.goldbows;

import java.util.Scanner;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        String binaryStr = Integer.toBinaryString(N);
        String[] binaryGaps = binaryStr.split("1");
        if (!binaryStr.substring(binaryStr.length() - 1).equals("1") && binaryGaps.length > 1) {
            binaryGaps[binaryGaps.length -1] = null;
        }
        int lengthOfLongest = 0;
        for (String binaryGap : binaryGaps) {
            if (binaryGap != null) {
                lengthOfLongest = Math.max(lengthOfLongest, binaryGap.length());
            }
        }

        return lengthOfLongest;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
    }
}
