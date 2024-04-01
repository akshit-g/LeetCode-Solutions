/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*/


class Solution {
    public boolean isPalindrome(int x) {
        String str_x = Integer.toString(x);
        for (int i=0; i<(str_x.length()/2)+1; i++){
            if(str_x.charAt(i)==str_x.charAt(str_x.length()-i-1)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}