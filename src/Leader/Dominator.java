package Leader;

import java.util.HashMap;
import java.util.Map;

/*
An array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.

For example, consider array A such that

 A[0] = 3    A[1] = 4    A[2] =  3
 A[3] = 2    A[4] = 3    A[5] = -1
 A[6] = 3    A[7] = 3
The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.

Write a function

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.

For example, given array A such that

 A[0] = 3    A[1] = 4    A[2] =  3
 A[3] = 2    A[4] = 3    A[5] = -1
 A[6] = 3    A[7] = 3
the function may return 0, 2, 4, 6 or 7, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
* */
public class Dominator {

// Task Score = 100;
// Correctness = 100;
// Performance = 100;
    // https://app.codility.com/demo/results/trainingRVRCM4-MNT/
    public Dominator(){

//        int[] A = {3,4,3,2,3,-1,3,3};
        int[] A = {4,6,6,6,6,8,8};
//        int[] A = {1,2,3,3,3,2,2,2};
        int res = solution(A);
        int res2 = mapSolution(A);
        System.out.println(res);
        System.out.println(res2);
    }

    public int solution(int[] A) {
        int size = 0;
        int value = -1;
        int candidate = -1;
        int count = 0;
        for(int i = 0;i<A.length;i++){
            if(size==0){
                value = A[i];
                size+=1;
            }else{
                if(value == A[i]){
                    size+=1;
                }else{
                    size -= 1;
                }
            }
        }
        if(size> 0)
            candidate = value;
        for(int i =0;i<A.length;i++){
            if(candidate == A[i])
                count++;
            if(count > A.length / 2){
                return i;
            }
        }
        return -1;
    }


    // O(n)
    public int mapSolution(int[] A){
        int counter = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0;i<A.length;i++){
            if(map.get(A[i]) == null){
                map.put(A[i],1);
            }else{
                counter = map.get(A[i]);
                counter += 1;
                map.put(A[i],counter);
            }
            // check if leader.
            if(map.get(A[i]) >= A.length / 2){
                // return the leader.
                return A[i];
            }
        }

        // no leader
        return -1;

    }



}
