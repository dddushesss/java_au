public class MyLinkedList<T> {

    ListNode head, tail;
    int size;

    class ListNode {
        T val;
        ListNode next;
        ListNode pre;

        ListNode(T value) {
            this.val = value;
        }
    }

    public MyLinkedList() {
        head = new ListNode(null);
        tail = new ListNode(null);
        head.next = tail;
        tail.pre = head;
    }

    public T get(int index) {
        if (index < 0 || index >= size) throw new UnsupportedOperationException();
        ListNode curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(T val) {
        addAtIndex(0, val);
    }

    public void addAtTail(T val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, T val) {
        if (index < 0 || index > size) return;
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = curr.next;
        newNode.next.pre = newNode;
        curr.next = newNode;
        newNode.pre = curr;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        ListNode curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        curr.next.pre = curr.pre;
        curr.pre.next = curr.next;
        size--;
    }
}
