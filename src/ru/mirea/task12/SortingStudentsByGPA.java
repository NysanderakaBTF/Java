package ru.mirea.task12;


import java.util.Comparator;
import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator<Student> {
    public SortingStudentsByGPA() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Student[] arr = new Student[size];
        for (int i = 0; i < size; i++) {
            arr[i] = new Student();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        quicksort(arr, 0, size-1);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public void quicksort(Student []students, int low, int high){
        if (students.length == 0){
            return;
        }
        if (low >= high){
            return;
        }
        int middle = low +(high - low)/2;
        Student student = students[middle];
        int i = low, j = high;
        while (i <= j){
            while (compare(students[i],student)>0){
                i++;
            }
            while (compare(students[j],student) <0){
                j--;
            }
            if (i <= j){
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                i++;
                j--;
            }
            if ( low < j ){
                quicksort(students,low,j);
            }
            if (high > i ){
                quicksort(students,i,high);
            }
        }

    }

    public static void main(String[] args) {
        SortingStudentsByGPA a = new SortingStudentsByGPA();
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGPA() - o2.getGPA();
    }
}