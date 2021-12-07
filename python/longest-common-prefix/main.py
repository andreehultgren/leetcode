class Solution:
    def longestCommonPrefix(self, strs):
        common_prefix = ""
        while True:
            proposed_char = None
            
            # Check all samples
            for sample_string in strs:
                if len(common_prefix) >= len(sample_string):
                    break
                
                if not proposed_char:
                    proposed_char = sample_string[len(common_prefix)]
                elif proposed_char != sample_string[len(common_prefix)]:
                    break
            else:
                common_prefix += proposed_char
                continue
            break
        
        return common_prefix
                