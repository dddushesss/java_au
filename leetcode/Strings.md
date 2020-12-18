#Strings
+ [Reverse Linked List](#reverse-linked-list)
<....>
## Reverse Linked List
https://leetcode.com/problems/reverse-linked-list
```java
class Solution {
       public ListNode reverseList(ListNode head) {
           ListNode newHead = null;
           while (head != null) {
               ListNode next = head.next;
               head.next = newHead;
               newHead = head;
               head = next;
           }
           return newHead;
       }
}
```