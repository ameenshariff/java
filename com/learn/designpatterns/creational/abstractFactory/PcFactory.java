package com.learn.designpatterns.creational.abstractFactory;

import com.learn.designpatterns.creational.factoryPattern.Computer;
import com.learn.designpatterns.creational.factoryPattern.ComputerFactory;
import com.learn.designpatterns.creational.factoryPattern.PC;

public class PcFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PcFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}
