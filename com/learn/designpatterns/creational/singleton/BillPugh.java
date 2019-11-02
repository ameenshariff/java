package com.learn.designpatterns.creational.singleton;

public class BillPugh {

    private BillPugh(){}

    private static class InnerHelper{
        private static final BillPugh innerInstance=new BillPugh();
    }

    public static BillPugh getInstance(){
        return InnerHelper.innerInstance;
    }
}
