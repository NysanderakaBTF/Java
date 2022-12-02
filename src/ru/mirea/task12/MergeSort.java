package ru.mirea.task12;
import ru.mirea.task12.SortingStudentsByGPA;

public class MergeSort {
    public static void main(String[] args) {

        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new Student();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(students[i]);
        }

        // merge sort
        System.out.println();
        Student[] students2 = new Student[10];
        for (int i = 0; i < 10; i++) {
            students2[i] = new Student();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(students2[i]);
        }
        System.out.println();

        Student[] allStudents = new Student[students.length + students2.length];
        for (int i = 0; i < students.length; i++) {
            allStudents[i] = students[i];

        }
        for (int i = 0; i < students2.length; i++) {
            allStudents[students.length+i] = students2[i];

        }
        mergeSort(allStudents, allStudents.length);
        for (Student s : allStudents) {
            System.out.println(s);
        }
    }


    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right)
    {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right)
            if (l[i].compareTo(r[j]) < 0)
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        while (i < left)
            a[k++] = l[i++];
        while (j < right)
            a[k++] = r[j++];
    }

    public static void mergeSort(Student[] a, int n)
    {

        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];
        for (int i = 0; i < mid; i++)
            l[i] = a[i];
        for (int i = mid; i < n; i++)
            r[i - mid] = a[i];
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }
}