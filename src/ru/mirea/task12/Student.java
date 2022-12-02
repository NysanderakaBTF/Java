package ru.mirea.task12;


import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Student implements Comparable<Student> {
    protected int iDNumber;

    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    protected String name;
    protected int GPA;
    protected static int all;

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

    public void setId(int id) {
        this.iDNumber = id;
    }

    @Override
    public int compareTo(Student o) {
        return this.getGPA() -  o.getGPA();
    }
}
