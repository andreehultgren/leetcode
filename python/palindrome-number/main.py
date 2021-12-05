class Solution:
    def isPalindrome(self, x):
        str_int = str(x)

        for i in range(len(str_int)//2):
            if str_int[i] != str_int[-(i+1)]:
                is_palindrome = False
                break
        else:
            is_palindrome = True

        return is_palindrome