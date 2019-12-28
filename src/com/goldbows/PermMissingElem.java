/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
*/

package com.goldbows;

import java.util.Arrays;

public class PermMissingElem {

    public static int solution(int[] A) {
        Arrays.sort(A);
        int missingElement = 1;
        for (int val : A) {
            if (val != missingElement) {
                return missingElement;
            } else {
                missingElement++;
            }
        }

        if (missingElement == A.length) {
            return missingElement + 1;
        }

        return missingElement;
    }

    public static void main(String[] args) {
        System.out.println(solution( new int[] {1,2}));
        System.out.println(solution( new int[] {2}));
        System.out.println(solution( new int[] {10,9,8,7,6,5,3,2,4,1,12}));
    }
}
