public class Main {
    public static void main(String[] args) {
        MyLinkedList<Student> list = new MyLinkedList<>();
        list.addAtHead(new Student("Petrov",202,1));
        list.addAtHead(new Student("Ivanov",202,1));
        list.addAtHead(new Student("Sidorov",202,2));
        for (Student student:list) {
            System.out.println(student);
        }
        Array3D<Integer> MyInt = new Array3D<>(new Integer[][][]{{{1, 2}, {3, 5}}, {{7, 8}, {9, 10}}});
        for (var i:MyInt) {
            System.out.println(i);
        }

    }
    static class Student{
        String name;
        int group;
        int subgroup;
        public Student(String name, int group, int subgroup) {
            this.name = name;
            this.group = group;
            this.subgroup = subgroup;
        }

        @Override
        public String toString() {
            return  name + ' ' + group + "." + subgroup;
        }
    }
}
