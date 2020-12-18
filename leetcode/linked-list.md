#Linked List

+ [Intersection of Two Linked Lists](#intersection-of-two-linked-lists/submissions)
<....>
## Intersection of Two Linked Lists
https://leetcode.com/problems/intersection-of-two-linked-lists/submissions
```java
class Solution {
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while( a != b){
            a = a == null? headB : a.next;
            b = b == null? headA : b.next;
        }

        return a;
    }
}
```