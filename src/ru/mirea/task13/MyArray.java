package ru.mirea.task13;


import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class MyArray<T>  implements Iterable<T>{
    private T[] values;

    public MyArray() { //конструктор
        values = (T[]) new Object[0];
    }

    public boolean add(T elem) {
        try {
            T[] temp = values;
            values = (T[])new  Object[temp.length+1];
            System.arraycopy(temp, 0, values, 0, temp.length);
            values[values.length - 1] = elem;
            return true;
        } catch (java.lang.Exception ex){
            ex.printStackTrace();
        }
        return false;
    }

    public void remove(int index) {
        try {
            int q=0;
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            for (int i = 0; i < temp.length; i++) {
                if(i!=index){
                    values[q]=temp[i];
                    q++;
                }
            }
        } catch (ClassCastException ex){
            ex.printStackTrace();
        }
    }

    public T get(int index) {
        return values[index];
    }

    public int size() {
        return values.length;
    }

    public T set(int index, T element) {
        T oldValue = values[index];
        values[index] = element;
        return oldValue;
    }
    public boolean isEmpty() {
        return values.length == 0;
    }

    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < values.length; i++) {
            s.append(values[i]+" ");
        }
        return new String(s);
    }
    @Override
    public Iterator<T> iterator() {
        return new MyIter<T>(values);
    }
    public static void main(String[] args) {
        MyArray<Integer> a = new MyArray<>();
        a.add(23);
        a.add(234435);
        System.out.println(a);
        a.add(86468);
        a.set(1,0);
        System.out.println(a);
        System.out.println(a.isEmpty());
        a.remove(0);
        for (Integer b:a) {
            System.out.println(b);
        }

    }


}
