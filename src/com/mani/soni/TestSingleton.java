package com.mani.soni;

public class TestSingleton {

    public static void main(String[] args) {
        SingletonWithInnerClass instance1 = SingletonWithInnerClass.getInstance();

        SingletonWithInnerClass instance2 = SingletonWithInnerClass.getInstance();
        {
            System.out.println("insdie block scope");
        }

        if(instance1 == instance2) {
            System.out.println("Both are same");
        }
    }
}
