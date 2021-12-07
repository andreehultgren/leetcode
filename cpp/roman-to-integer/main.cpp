class Solution {  
    
public:
    int romanToInt(string s) {
        map<char, int> romanMap;
        romanMap['I'] = 1;
        romanMap['V'] = 5;
        romanMap['X'] = 10;
        romanMap['L'] = 50;
        romanMap['C'] = 100;
        romanMap['D'] = 500;
        romanMap['M'] = 1000;
            
    
        int string_length = s.length();
        int i = 0;
        int value = 0;
        int this_value;
        int next_value;
        
        while(i<string_length-1){
            this_value = romanMap[s[i]];
            next_value = romanMap[s[i+1]];
            
            if(this_value >= next_value){
                value += this_value;
                i++;
            } else {
                value += next_value - this_value;
                i += 2;
            }
        }
        if(i==string_length-1){
            value += romanMap[s[i]];
        }
        return value;
    }
};
