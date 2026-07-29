class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLen =0;
        Set<Integer> hs = new HashSet<>();
        for(int num : nums)
            hs.add(num);
        for(int num : nums)
        {
            if(!hs.contains(num-1))
            {
                int len = 0;
                while(hs.contains(num+len))
                    len++;
                maxLen = Math.max(len, maxLen);
            }
        }
        return maxLen;
        
    }
}
