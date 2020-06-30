package com.mani.soni;

public class SingletonClass {

   /* private static final SingletonClass instance = new SingletonClass();

    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        return instance;
    }
    */

    private static  SingletonClass instance = null;

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {

        synchronized (SingletonClass.class) {
            if (instance == null) {
                return instance = new SingletonClass();
            }
        }
        return instance;
    }

}
