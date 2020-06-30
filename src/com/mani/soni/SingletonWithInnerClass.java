package com.mani.soni;

public class SingletonWithInnerClass {

    private SingletonWithInnerClass() {

    }

    private static class SingletonHelper {
        private static SingletonWithInnerClass instance = new SingletonWithInnerClass();
    }
    public static SingletonWithInnerClass getInstance() {
        return SingletonHelper.instance;
    }
}
