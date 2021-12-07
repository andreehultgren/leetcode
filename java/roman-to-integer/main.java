class Solution {
    private int getValue(char c){
        int value;
        switch(c){
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                value = 0;
                break;
        }
        return value;
    }
    
    public int romanToInt(String s) {
        // Create hashmap
        
        int value = 0;
        int i = 0;
        int string_length = s.length();
        int this_value;
        int next_value;
        
        while(i<string_length-1){
            this_value = getValue(s.charAt(i));
            next_value = getValue(s.charAt(i+1));
            
            if(this_value >= next_value){
                value += this_value;
                i++;
            } else {
                value += next_value - this_value;
                i += 2;
            }
        }
        if(i==string_length-1){
            value += getValue(s.charAt(i));
        }
        return value;
        
    }
}
