#Strings
+ [Palindromic Substrings](#palindromic-substrings)
<....>
## Palindromic Substrings
https://leetcode.com/problems/palindromic-substrings/
```java
class Solution {
        public int countSubstrings(String s) {
            if (s == null || s.isEmpty() || s.length() == 1) {
                return 1;
            }
            else {
                int count = 0;
                for (int i = 0; i < s.length(); i++) {
                    count += expandAroundCenter(s, i, i);
                    count += expandAroundCenter(s, i, i + 1);
                }
                return count;
            }
            }
    static int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
        return count;
    }
}
```
