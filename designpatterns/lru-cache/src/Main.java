public class Main {

    public static void main(String[] args) {
        LRUCache<String, Student> cache = new LRUCache(3);
        Student student = new Student("Ivan", "Ivanov", 2);
        Student student1 = new Student("Ivan", "Petrov", 2);
        cache.put(student.getSurname(), student);
        student.setGroup(5);
        cache.put(student1.getSurname(),student1);
        System.out.printf(String.valueOf(cache));
    }
}
