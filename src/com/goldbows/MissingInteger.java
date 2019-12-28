/*
This is a demo task.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
*/

package com.goldbows;

import java.util.*;

public class MissingInteger {

    public static int solution(int[] A) {
        Set<Integer> existingInts = new HashSet<>();

        for (int val : A) {
            existingInts.add(val);
        }

        int currentInt = 1;
        while (currentInt < Integer.MAX_VALUE) {
            if (!existingInts.contains(currentInt)) {
                return currentInt;
            }
            currentInt++;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 4, 6, 1, 4, 4}));
    }
}
