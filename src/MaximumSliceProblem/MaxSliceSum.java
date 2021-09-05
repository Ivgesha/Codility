package MaximumSliceProblem;

import java.util.Map;

/*
A non-empty array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice of array A. The sum of a slice (P, Q) is the total of A[P] + A[P+1] + ... + A[Q].

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the maximum sum of any slice of A.

For example, given array A such that:

A[0] = 3  A[1] = 2  A[2] = -6
A[3] = 4  A[4] = 0
the function should return 5 because:

(3, 4) is a slice of A that has sum 4,
(2, 2) is a slice of A that has sum −6,
(0, 1) is a slice of A that has sum 5,
no other slice of A has sum greater than (0, 1).
Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..1,000,000];
each element of array A is an integer within the range [−1,000,000..1,000,000];
the result will be an integer within the range [−2,147,483,648..2,147,483,647].

* */
public class MaxSliceSum {

    // Task Score = 100;
    // Correctness = 100;
    // Performance = 100;
    //todo https://app.codility.com/demo/results/trainingZ2SWVM-NYG/


    public MaxSliceSum(){
//    int[] A = {3,2,-6,4,0};
//    int[] A = {-7,-2};
//    int[] A = {-2,-1};
    int[] A = {2,1};
    int res = solution(A);
    System.out.println(res);
    }
    public int solution(int[] A) {
        int maxTemp;
        int maxSlice;
        if(A.length == 0){
            return -1;
        }
        maxSlice = A[0];
        maxTemp = 0;
        for(int i = 0;i<A.length;i++){


            maxTemp += A[i];
            maxSlice = Math.max(maxSlice,maxTemp);
            if(maxTemp < 0 )
                maxTemp = 0;
            /*
            maxTemp += A[i];
            maxTemp = Math.max(0,maxTemp);
            maxSlice = Math.max(maxTemp,maxSlice);
            */

        }

        return maxSlice;
    }
}
