package com.learn.designpatterns.creational.abstractFactory;

import com.learn.designpatterns.creational.factoryPattern.Computer;
import com.learn.designpatterns.creational.factoryPattern.PC;

public class Test {
    public static void main(String[] args) {
        Computer pc=ComputerFactory.getComputer(new PcFactory("8 Gb","256 Gb","i5 8th gen"));
        Computer server=ComputerFactory.getComputer(new ServerFactory("16 Gb","8 Tb","Intel Xeon"));

        System.out.println(pc);
        System.out.println(server);
    }
}
