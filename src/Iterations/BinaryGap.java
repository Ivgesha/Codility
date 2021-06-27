package Iterations;

public class BinaryGap {
    /*
    A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

    For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.

    Write a function:

    class Solution { public int solution(int N); }

    that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

    For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [1..2,147,483,647].


    */
    public BinaryGap(){

        // Task Score = 100;
        // Correctness = 100;
        // Performance = Not assessed


        // 102 = 1100110
        // 100 = 1100100
        // 9 = 1001
        // 55 = 110111
        // 13 = 1101
        // 647 = 1010000111
        // 32 = 100000
        int res = solution(102 );
        System.out.println(res);

    }

    public int solution(int N){
        int[] arrBin;
        int i =0;
        int counter = 0;
        int max = 0;

        if(N < 3){
            return 0;
        }
        arrBin = convertToBinary(N);
        System.out.println(arrBin.length);

        for(i = 0;i<arrBin.length; i++){
            counter=0;
            while((i<arrBin.length - 1) && (arrBin[i] == 0)){
                counter++;
                i++;
            }
            if(arrBin[i]==1){      // done substring so we have a gap.
                if(counter >= max){
                    max = counter;
                }
            }
        }
        return max;

    }

    public int[] convertToBinary(int N){
        int number = N;
        int counter = 0;
        int[] revBinArr,binArr;
        int i=0;
        while(number >0){
            number = number / 2;
            counter++;
        }
        revBinArr = new int[counter];
        binArr = new int[counter];
        number = N;
        while(number >0){
            revBinArr[i] = number % 2;
            i++;
            number = number / 2;
        }


        i=0;
        while(i<counter){
            binArr[(counter-1)-i] = revBinArr[i];
            i++;
        }

        return binArr;

    }





}
