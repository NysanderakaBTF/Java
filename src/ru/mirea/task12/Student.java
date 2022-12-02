package ru.mirea.task12;


import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;
    private int GPA;
    private static int all;

    public Student(String name, int GPA, int id) {
        this.iDNumber = id++;
        this.name = name;
        this.GPA=GPA;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public Student() {
        this.name = "Student_" + (all++);
        this.iDNumber = all;
        GPA= (int) (Math.random()*1000);
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    public void setId(int id) {
        this.iDNumber = id;
    }

    @Override
    public int compareTo(Student o) {
        return this.getGPA() -  o.getGPA();
    }
}
