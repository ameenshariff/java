package com.learn.streams;

import java.util.Comparator;
import java.util.Objects;

public class MyClass {
    String label,value;

    public MyClass setLabel(String label) {
        this.label = label;
        return this;
    }

    public MyClass setValue(String value) {
        this.value = value;
        return this;
    }

    public MyClass(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public MyClass() {
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


}
