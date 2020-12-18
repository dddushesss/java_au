#Design
+ [Implement Stack using Queues](#implement-stack-using-queues)
<....>
## Implement Stack using Queues
https://leetcode.com/problems/implement-stack-using-queues
```java
class MyStack {

    private Deque<Integer> stack;

    public MyStack() {
        this.stack = new ArrayDeque<>();
    }

    public void push(int x) {
        this.stack.add(x);
    }

    public int pop() {
        int val = top();
        this.stack.removeLast();
        return val;
    }

    public int top() {
        return this.stack.getLast();
    }

    public boolean empty() {
        return this.stack.isEmpty();
    }
}
```