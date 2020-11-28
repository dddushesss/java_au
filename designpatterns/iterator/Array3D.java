import java.util.Iterator;

public class Array3D<T> implements Iterable<T> {
    T[][][] val;

    public Array3D(T[][][] val) {
        this.val = val;
    }

    @Override
    public Iterator<T> iterator() {

        return new Iterator<>() {
            int index1 = 0, index2 = 0, index3 = 0;

            @Override
            public boolean hasNext() {

                return index1 < val.length - 1 || index2 < val[index1].length - 1 || index3 < val[index1][index2].length;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new UnsupportedOperationException();
                } else if (index3 >= val[index1][index2].length) {
                    if (index2 < val[index1].length - 1) {
                        index3 = 0;
                        index2++;
                    } else {
                        index3 = 0;
                        index2 = 0;
                        index1++;
                    }
                }
                return val[index1][index2][index3++];
            }
        };
    }
}
