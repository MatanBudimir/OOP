package pete.prvi;

import java.util.Arrays;
import java.util.Objects;

public class SimpleArrayList {
    private Object[] arr;
    
    public SimpleArrayList() {
        this.arr = new Object[2];
    }

    public boolean add(Object o) {
        if (size() == arr.length) {
            Object[] tmp = arr.clone();
            arr = new Object[size() * 2];
            for (int i = 0; i < tmp.length; i++)
                arr[i] = tmp[i];
        }

        arr[size()] = o;
        return true;
    }
    
    public int size() {
        return (int) Arrays.stream(arr).filter(Objects::nonNull).count();
    }

    public Object get(int index) {
        if (size() <= index)
            return null;
        return arr[index];
    }

    public int indexOf(Object o) {
        for (int i = 0; i < arr.length; i++)
            if (o == arr[i])
                return i;

        return -1;
    }
}
