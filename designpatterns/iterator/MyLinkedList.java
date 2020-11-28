public class MyLinkedList {

    ListNode head, tail;
    int size;

    class ListNode {
        int val;
        ListNode next;
        ListNode pre;

        ListNode(int value) {
            this.val = value;
        }
    }

    public MyLinkedList() {
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.pre = head;
    }

    public int get(int index) {
        if (index < 0 || index >= size) throw new UnsupportedOperationException();
        ListNode curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
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
