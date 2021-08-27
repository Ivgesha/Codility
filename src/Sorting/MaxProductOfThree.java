package Sorting;

/*
* A non-empty array A consisting of N integers is given. The product of triplet (P, Q, R) equates to A[P] * A[Q] * A[R] (0 ≤ P < Q < R < N).

For example, array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
contains the following example triplets:

(0, 1, 2), product is −3 * 1 * 2 = −6
(1, 2, 4), product is 1 * 2 * 5 = 10
(2, 4, 5), product is 2 * 5 * 6 = 60
Your goal is to find the maximal product of any triplet.

Write a function:

class Solution { public int solution(int[] A); }

that, given a non-empty array A, returns the value of the maximal product of any triplet.

For example, given array A such that:

  A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
the function should return 60, as the product of triplet (2, 4, 5) is maximal.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [3..100,000];
each element of array A is an integer within the range [−1,000..1,000].
*
*
*
* */


import java.util.Arrays;

public class MaxProductOfThree {
    // Task Score = 100;
    // Correctness = 100;
    // Performance = 100;
    // https://app.codility.com/demo/results/trainingXKD2HX-APR/

    public MaxProductOfThree(){

//        int[] A = {-3,1,2,-2,5,6};
//        int[] A = {-3,-2,5,6};
        int[] A = {-5,5,-5,4};
        int res;
        res = solution(A);
        System.out.println(res);


    }


    public int solution(int[] A) {
        int res =0;

        Arrays.sort(A);
        int res1 = A[0]*A[1]*A[A.length-1];
        int res2 = A[A.length -1] * A[A.length -2] * A[A.length -3];
        if (res1>=res2)
            res= res1;
        else
            res=res2;
        return res;
    }


}
