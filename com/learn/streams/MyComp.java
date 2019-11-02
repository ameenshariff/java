package com.learn.streams;

import java.util.Comparator;

public class MyComp implements Comparator<MyClass> {

    @Override
    public int compare(MyClass m1, MyClass m2) {
        return m1.label.compareToIgnoreCase(m2.label);
    }
}

