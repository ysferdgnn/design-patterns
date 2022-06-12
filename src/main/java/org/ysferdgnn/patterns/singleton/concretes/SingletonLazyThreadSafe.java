package org.ysferdgnn.patterns.singleton.concretes;

public class SingletonLazyThreadSafe {
    private static SingletonLazyThreadSafe instance;
    private int callCount=0;
    private SingletonLazyThreadSafe(){
        callCount+=1;
    }

    public static  SingletonLazyThreadSafe getInstance(){
        synchronized (SingletonLazyThreadSafe.class){
            if (instance==null)
                instance=new SingletonLazyThreadSafe();
            return instance;
        }
    }

    public int giveCallCount(){
        return callCount;
    }
}
