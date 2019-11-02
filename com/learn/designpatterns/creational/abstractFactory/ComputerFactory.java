package com.learn.designpatterns.creational.abstractFactory;

import com.learn.designpatterns.creational.factoryPattern.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
