import java.util.*;

public class LRUCache<K, V> {

    class ListNode {
        V val;
        K key;
        ListNode next;
        ListNode pre;

        @Override
        public String toString() {
            return  val.toString();
        }

        public ListNode() {
            val = null;
            key = null;
        }

        public ListNode(K key, V val) {
            this.val = val;
            this.key = key;
        }
    }
    public void addNode(ListNode node) {
       cache.put(node.key, node);
       ListNode headNext = head.next;
       head.next = node;
       node.pre = head;
       headNext.pre = node;
       node.next = headNext;
    }

    public void removeNode(ListNode node) {
        cache.remove(node.key);
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    private void moveToHead(ListNode node){
        this.removeNode(node);
        this.addNode(node);
    }

    private ListNode popTail(){
        ListNode res = tail.pre;
        this.removeNode(res);
        return res;
    }


    private Map<K, ListNode> cache = new HashMap<>();
    private int capacity;
    private ListNode head, tail;

    public LRUCache(int _capacity) {
        capacity = _capacity;
        head = new ListNode();
        head.pre = null;

        tail =new ListNode();
        tail.next = null;

        head.next = tail;
        tail.pre = head;
    }

    public V get(K key){
        if(cache.containsKey(key)){
            ListNode node = cache.get(key);
            removeNode(node);
            addNode(node);
            return node.val;
        }
        else {
            return null;
        }
    }

    @Override
    public String toString() {
        return  cache.values().toString();
    }

    public void put(K key, V value){
        if(cache.containsKey(key))
            removeNode(cache.get(key));
        if(cache.size() == capacity)
            removeNode(tail.pre);
        addNode(new ListNode(key, value));
    }
}
