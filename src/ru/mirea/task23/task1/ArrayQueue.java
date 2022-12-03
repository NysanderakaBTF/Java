package ru.mirea.task23.task1;

public class ArrayQueue {
    private int siz = 0;
    private int cap = 8;
    private Object a[];


    //Инвариант: currentSize >=0 и currentSize < realSize

    public ArrayQueue(){
        a = new Object[cap];
        siz = 0;
    }

    /*
    * Предусловие: newSize > 0
    * Постусловие: array.length' > array.length
    * */

    private void increaseRealSize( int newSize){
        if ( newSize < a.length) return;
        cap = newSize;
        Object[] tmp = new Object[cap];

        System.arraycopy(a, 0, tmp, 0, siz);

        a = tmp;

    }

    /*
    * Предусловие: newElement != null
    * Постусловие: array[currentSize - 1] = element
    * Постусловие: currentSize' = currentSize++
    * */

    public void enqueue(Object newElement){
        if ( newElement == null) return;
        if (a.length + 1 >= cap *0.75) increaseRealSize(cap *2);

        a[siz++] = newElement;
    }

    public Object element() {
        if(isEmpty()) return null;
        return a[0];
    }

    public Object dequeue() {
        if (isEmpty()) return null;
        Object[] tmp = new Object[cap];
        Object firstElement = a[0];
        System.arraycopy(a, 0, tmp, 0, siz);
        siz--;
        a = tmp;
        return firstElement;
    }


    public int size() {
        return siz;
    }

    public boolean isEmpty() {
        return (siz == 0);
    }


    public void clear() {
        siz = 0;
        cap = 8;
        a = new Object[cap];
    }

    public String show() {
        String result = "Queue: ";
        for (int i = 0; i < siz; i++) result += a[i] + " ";
        return result;
    }
}
