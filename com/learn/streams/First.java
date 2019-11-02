package com.learn.streams;

import java.util.*;

public class First {
    public static void main(String[] args) {
        Set<MyClass> s=new TreeSet<>(new MyComp());
        s.add(new MyClass("2222","iuj"));
        s.add(new MyClass("3333","abg"));
        s.add(new MyClass("1111","sde"));

        s.forEach(k->System.out.println(k));

    }
}
