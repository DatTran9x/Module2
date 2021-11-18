package Bai10.MyList;


import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    private E[] data = (E[]) new Object[DEFAULT_CAPACITY];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(E[] objects) {
        for (int i = 0; i < objects.length; i++)
            add(objects[i]); // Warning: don't use super(objects)!
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E remove(int index) {
        checkIndex(index);

        E e = data[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];

        data[size - 1] = null; // This element is now null

        // Decrement size
        size--;
        return e;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public int size() {
        return this.size;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public E[] clone() {
        E[] newData = (E[]) (new Object[size]);
        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
        return newData;
    }

    public E[] getData() {
        return this.data;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i]))
                return true;
        return false;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i])) return i;
        return -1;
    }

    public E set(int index, E e) {
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }
}
