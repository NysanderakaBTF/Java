package ru.mirea.task13;
import java.util.Iterator;
public class MyIter<T> implements Iterator<T>{

    private int index = 0;
    private T[] values;

    MyIter(T[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {
        return values[index++];
    }
}

