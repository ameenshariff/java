package com.learn.designpatterns.creational.factoryPattern;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc=ComputerFactory.getComputer("pc","8 Gb","256 Gb","i5 8th gen");
        Computer server=ComputerFactory.getComputer("server","16 Gb","10 Tb","Intel Xeon");

        System.out.println(pc);
        System.out.println(server);
    }
}
