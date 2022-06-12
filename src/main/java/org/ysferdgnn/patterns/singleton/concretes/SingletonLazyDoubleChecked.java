package org.ysferdgnn.patterns.singleton.concretes;

public class SingletonLazyDoubleChecked {
    private static SingletonLazyDoubleChecked instance;
    private int callCount;
    private  SingletonLazyDoubleChecked(){
        callCount +=1;
    }

    public  static  SingletonLazyDoubleChecked getInstance(){

        if (instance==null){
            synchronized (SingletonLazyDoubleChecked.class){
                if (instance==null){
                    instance=new SingletonLazyDoubleChecked();
                }
            }
        }
        return instance;
    }
    public int giveCallCount(){
        return callCount;
    }

}
