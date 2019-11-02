package com.learn.streams;

import java.util.Comparator;
import java.util.Objects;

public class MyClass {
    String label,value;

    public MyClass(String label, String value) {
        this.label = label;
        this.value = value;
    }



    @Override
    public boolean equals(Object o) {
        MyClass other=(MyClass) o;
        return value.equalsIgnoreCase(other.value);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "label='" + label + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public void some(String s){
        value.compareToIgnoreCase(s);
    }

//    @Override
//    public int compareTo(MyClass myClass) {
//        return value.compareToIgnoreCase(myClass.value);
//    }
}
