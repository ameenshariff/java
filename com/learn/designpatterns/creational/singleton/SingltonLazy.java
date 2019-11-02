package com.learn.designpatterns.creational.singleton;

public class SingltonLazy {
    private static SingltonLazy inst=null;

    private SingltonLazy(){}

    public static SingltonLazy getInstance(){
        if(inst==null){
            inst=new SingltonLazy();
        }

        return inst;
    }
}
