package com.learn.designpatterns.creational.singleton;

public class SingletonEager {

    private static SingletonEager inst=new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
            return inst;
    }
}
