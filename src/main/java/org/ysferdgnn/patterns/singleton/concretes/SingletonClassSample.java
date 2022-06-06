package org.ysferdgnn.patterns.singleton.concretes;

public class SingletonClassSample {

    private static  SingletonClassSample instance;

    private SingletonClassSample(){

    }

    public static SingletonClassSample getInstance(){

        if (instance ==null)
            instance=new SingletonClassSample();
        return instance;
    }


}
