package org.ysferdgnn.patterns.singleton.concretes;

public class SingletonEagerInitialization {

    private static final SingletonEagerInitialization instance= new SingletonEagerInitialization();

    private SingletonEagerInitialization(){

    }

    public static SingletonEagerInitialization getInstance(){
        return instance;
    }

    public String sayHello(){
        return "Hello";
    }


}
