class Solution {
    public boolean isPalindrome(int x) {
        
        String x_str = Integer.toString(x);
        int string_length = x_str.length();
        for(int i = 0 ; i<string_length/2 ; i++){
            if(x_str.charAt(i) != x_str.charAt(string_length-i-1)){
                return false;
            }
        }
        return true;
    }
}