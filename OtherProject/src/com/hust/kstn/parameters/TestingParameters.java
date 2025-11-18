package com.hust.kstn.parameters;

public class TestingParameters {
    public static void main(String[] args) {
        Student s1 = new Student(1, "A");
        Student s2 = new Student(2, "B");
        swap(s1, s2);
        System.out.println("First student: " + s1.getName());
        System.out.println("Second student: " + s2.getName());
    }

    public static void swap(Object x1, Object x2) {
        Object tmp = x1;
        x1 = x2;
        x2 = tmp;
    }
}