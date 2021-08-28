package StackAndQueues;

/*
* A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

class Solution { public int solution(String S); }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..200,000];
string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
* */

import java.util.Stack;

public class Brackets {
    // Task Score = 100;
    // Correctness = 100;
    // Performance = 100;
    // https://app.codility.com/demo/results/training2H2FDU-ESR/
    public Brackets() {
        String S = "{[()()]}";
        String S1 = "([)()]";
        String S2 = "((()))]";
        String S3 = "()(";
        int res = solution(S3);
        System.out.println(res);


    }




    public int solution(String S) {
        Stack<Character> stack = new Stack<Character>();
        Character peek;
        for (int i = 0; i < S.length(); i++) {
            if (((S.charAt(i) == '{') || (S.charAt(i) == '[') || (S.charAt(i) == '('))) {
                stack.push(S.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return 0;
                } else {
                    peek = stack.peek();
                    if (peek == '{' && S.charAt(i) == '}') {
                        stack.pop();
                    } else if (peek == '[' && S.charAt(i) == ']') {
                        stack.pop();
                    } else if (peek == '(' && S.charAt(i) == ')') {
                        stack.pop();
                    } else
                        return 0;
                }
            }
        }
        if(stack.isEmpty()){
            return 1;
        }else
            return 0;
    }   

}
