/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:
Input: n = 1
Output: true
Explanation: 20 = 1

Example 2:
Input: n = 16
Output: true
Explanation: 24 = 16

Example 3:
Input: n = 3
Output: false
*/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        return false;
        String val=Integer.toBinaryString(n);
        // int len = val.length();
        System.out.println(val);
        if ((val.indexOf('1') == val.lastIndexOf('1'))&&(val.indexOf('1')!=-1)){
            return true;
        } return false;
    }
}