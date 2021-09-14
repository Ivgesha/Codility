package PrimeAndCompositeNumbers;

public class CountFactors {
/*
* A positive integer D is a factor of a positive integer N if there exists an integer M such that N = D * M.

For example, 6 is a factor of 24, because M = 4 satisfies the above condition (24 = 6 * 4).

Write a function:

class Solution { public int solution(int N); }

that, given a positive integer N, returns the number of its factors.

For example, given N = 24, the function should return 8, because 24 has 8 factors, namely 1, 2, 3, 4, 6, 8, 12, 24. There are no other factors of 24.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..2,147,483,647].
* */


    // Task Score = 100;
    // Correctness = 100;
    // Performance = 100;
    // https://app.codility.com/demo/results/trainingW553WK-ZZP/
    public CountFactors(){
        int N = 24;
        int res = solution(N);
        System.out.println(res);
    }

    public int solution(int N) {

    int res = 0;
    long i = 1;
    double sqrN = Math.sqrt(N);
    while(i < sqrN){
        if(N%i == 0){
            res += 2;   // two dividers
        }
        i++;
    }
    if(i*i == N){
        res += 1;
    }
    return res;
    }
}
