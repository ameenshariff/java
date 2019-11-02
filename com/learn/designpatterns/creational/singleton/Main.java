package com.learn.designpatterns.creational.singleton;


import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
//        Singleton instance=Singleton.getInstance();
//        SingltonLazy instance=SingltonLazy.getInstance();
//        BillPugh instance=BillPugh.getInstance();
        SingletonThreadSafe instance=SingletonThreadSafe.getInstance();

        out.println(instance);

//        Singleton another=Singleton.getInstance();
//        SingltonLazy another=SingltonLazy.getInstance();
//        BillPugh another=BillPugh.getInstance();
        SingletonThreadSafe another=SingletonThreadSafe.getInstance();
        out.println(another);
    }
}
