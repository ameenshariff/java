package com.learn.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Class c1= Ajmal.class;
        System.out.println(c1.getName());
        System.out.println();
        System.out.println(c1.getSuperclass().getName());
        System.out.println();
        Class[] inter=c1.getInterfaces();
        for (Class aClass :inter) {
            System.out.println(aClass);
        }
        System.out.println();


        System.out.println(Modifier.toString(c1.getModifiers()));
        System.out.println();

        Field[] fields=c1.getDeclaredFields();
        for (Field f:fields) {
            System.out.println(f.getType()+" "+f.getName()+" "+Modifier.toString(f.getModifiers()));

        }
    }
}
