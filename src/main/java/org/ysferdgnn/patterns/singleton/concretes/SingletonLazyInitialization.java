package org.ysferdgnn.patterns.singleton.concretes;

public class SingletonLazyInitialization {
    private static SingletonLazyInitialization instance;


    private SingletonLazyInitialization(){
    }

    public static SingletonLazyInitialization getInstance(){
        if (instance==null)
            instance=new SingletonLazyInitialization();
        return instance;
    }

    public String sayHello(){
        return "Hello";
    }
}
