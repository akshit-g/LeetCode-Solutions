'''
A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.

Example 1:
Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.

Example 2:
Input: num = 7
Output: false
'''

import math

class Solution(object):
    def checkPerfectNumber(self, num):
        if num == 1:
            return False

        divisor_sum = 1  # Start with 1 since it's always a divisor
        
        # Iterate up to the square root of num
        for i in range(2, int(math.sqrt(num)) + 1):
            if num % i == 0:
                divisor_sum += i
                # If i is not equal to num // i, include num // i in the sum
                if i != num // i:
                    divisor_sum += num // i
        
        # If the sum of divisors equals num, it's a perfect number
        return divisor_sum == num