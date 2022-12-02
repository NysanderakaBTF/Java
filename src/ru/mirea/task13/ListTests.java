package ru.mirea.task13;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListTests {
    public static void main(String[] args) {
        ArrayList<Integer> mm = new ArrayList<>();
        mm.add(12);
        mm.add(454);
        mm.add(-12);
        System.out.println(mm);
        System.out.println(mm.size());
        System.out.println(mm.indexOf(454));
        System.out.println(mm.contains(12));
        mm.add(1, 4654543);
        System.out.println(mm);
        mm.set(1, 68464);
        System.out.println(mm);
        mm.remove(2);
        System.out.println(mm);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(454);
        list.add(-12);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.indexOf(454));
        System.out.println(list.contains(12));
        list.add(1, 4654543);
        System.out.println(list);
        list.set(1, 68464);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.addFirst(121212);
        System.out.println(list);
        list.addLast(-98468468);
        System.out.println(list);

    }
}
