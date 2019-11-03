package com.learn.designpatterns.creational.builderPattern;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer c = new Computer.BuilderComputer("500 Gb", "32 Gb")
                .build();
        System.out.println(c);
    }
}
