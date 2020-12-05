public class Main {

    public static void main(String[] args) {
        LRULinkedHashMap<String, Integer> cache1 = new LRULinkedHashMap<>(2);
        cache1.put("1", 1);
        cache1.put("2", 2);
        cache1.get("1");
        cache1.put("3", 3);
        cache1.put("4", 4);
    }
}
