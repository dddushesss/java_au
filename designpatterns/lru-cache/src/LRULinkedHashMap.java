import java.util.LinkedHashMap;
import java.util.Map;

public class LRULinkedHashMap<K, V> {
    private Map<K, V> cache;
    private int capacity;

    public LRULinkedHashMap(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > capacity;
            }
        };
    }

    @Override
    public String toString() {
        return cache.values().toString();
    }

    public V get(K key) {
        return cache.getOrDefault(key, null);
    }

    public void put(K key, V value) {
        cache.remove(key);

        cache.put(key, value);
    }
}
