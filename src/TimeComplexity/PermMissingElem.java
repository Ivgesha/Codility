package TimeComplexity;

public class PermMissingElem {

/*
* An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

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
* */







    public PermMissingElem() {


// Task Score = 100;
// Correctness = 100;
// Performance = 100;


        int[] A ={4,3,1,5};
        int res = solution(A);
        System.out.println(res);
    }

    public static int solution(int[] A) {
        long sum = 0;
        long expectedSum = 0;
        long lastNum = A.length;
        long missingNum;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        expectedSum = ((lastNum+1) * (lastNum + 2))/2;
        missingNum = expectedSum - sum;
        return (int)missingNum;
    }
}
