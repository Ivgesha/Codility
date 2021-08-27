package Sorting;

import java.util.Arrays;

/*
* An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:

A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
For example, consider array A such that:

  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
Triplet (0, 2, 4) is triangular.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

For example, given array A such that:

  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
the function should return 1, as explained above. Given array A such that:

  A[0] = 10    A[1] = 50    A[2] = 5
  A[3] = 1
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647]
* */
public class Triangle {
    public Triangle(){

        // Task Score = 100;
        // Correctness = 100;
        // Performance = 100;
        //https://app.codility.com/demo/results/trainingWNCY6Y-SNR/

//        int[] A = {10,2,5,1,8,20};
        int[] A = {10,50,5,1};
        int res = solution(A);
        System.out.println(res);

    }
    public int solution(int[] A) {

        int res=0;
        Arrays.sort(A);
        for(int i = 0;i<A.length-2;i++){
            res = check((long)A[i],(long)A[i+1],(long)A[i+2]);
            if(res == 1)
                return 1;
        }

            return 0;
    }


    public int check(long a,long b,long c){
        if((a+b>c) && (a+c>b) && (b+c>a))
            return 1;
        else
            return 0;
    }
}
