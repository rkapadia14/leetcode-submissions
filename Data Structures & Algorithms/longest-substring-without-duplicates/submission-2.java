class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs = new HashSet<>();
        int maxLen = 0;
        int left = 0;
        for(int i=0;i<s.length(); i++)
        {
            while(hs.contains(s.charAt(i)))
            {
                hs.remove(s.charAt(left++));
            }
            hs.add(s.charAt(i));
            maxLen = Math.max(maxLen, hs.size());
        }
        return maxLen;
        
    }
}