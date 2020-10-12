#Strings
+ [Valid Palindrome](#valid-palindrome)
<....>
## Valid Palindrome
https://leetcode.com/problems/valid-palindrome/
```java
class Solution {
        public boolean isPalindrome(String s) {
            return s.replaceAll("[^a-z^A-Z^0-9]","").equalsIgnoreCase(new StringBuilder(s).reverse().toString().replaceAll("[^a-z^A-Z^0-9]",""));
        }
    }
```
