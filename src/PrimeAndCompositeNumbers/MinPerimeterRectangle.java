package PrimeAndCompositeNumbers;
/*
* An integer N is given, representing the area of some rectangle.

The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).

The goal is to find the minimal perimeter of any rectangle whose area equals N. The sides of this rectangle should be only integers.

For example, given integer N = 30, rectangles of area 30 are:

(1, 30), with a perimeter of 62,
(2, 15), with a perimeter of 34,
(3, 10), with a perimeter of 26,
(5, 6), with a perimeter of 22.
Write a function:

class Solution { public int solution(int N); }

that, given an integer N, returns the minimal perimeter of any rectangle whose area is exactly equal to N.

For example, given an integer N = 30, the function should return 22, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..1,000,000,000].
*
* */
public class MinPerimeterRectangle {

    // decided to submit solution2

    // Task Score = 100;
    // Correctness = 100;
    // Performance = 100;

    // https://app.codility.com/demo/results/training362QT7-TYG/
    public MinPerimeterRectangle(){
        int N = 1000000000;
        int res = solution(N);
        System.out.println(res);
        int res2 = solution2(N);
        System.out.println(res2);

    }

    public int solution(int N) {
        double sqrN = Math.sqrt(N);
        System.out.println(sqrN);
        int i = 1;
        int A;
        int B;
        int minPerimeter = 2 * (1+N);
        int currentPerimeter = minPerimeter;
        while(i < sqrN){
            if(N % i == 0){
                A = N / i;
                B = i;
                currentPerimeter = 2 * (A+B);
                System.out.println("A = " + A + " B = " + B + " currentPerimeter = " + currentPerimeter);
                if(currentPerimeter <= minPerimeter){
                    minPerimeter = currentPerimeter;
                }
             }
            i++;
        }
     return minPerimeter;
    }
    public int solution2(int N){
        double sqrN = Math.sqrt(N);
        int i = (int)sqrN;
        int A;
        int B;
        int minPerimeter = 2 * (1+N);
        while(i > 0){
            if(N % i == 0){
              A = N / i;
              B = i;
              minPerimeter = 2 * (A+B);
              return minPerimeter;
            }
            i--;
        }
        return minPerimeter;
    }
}
