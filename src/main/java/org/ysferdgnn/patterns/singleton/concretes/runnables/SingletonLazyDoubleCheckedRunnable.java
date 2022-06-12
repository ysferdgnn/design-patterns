package org.ysferdgnn.patterns.singleton.concretes.runnables;

import org.ysferdgnn.patterns.singleton.concretes.SingletonLazyDoubleChecked;

import java.time.Instant;

public class SingletonLazyDoubleCheckedRunnable implements Runnable{

    @Override
    public void run() {
        SingletonLazyDoubleChecked singletonLazyDoubleChecked = SingletonLazyDoubleChecked.getInstance();
        System.out.println("Thread -> "+this.hashCode()+" : "+singletonLazyDoubleChecked.giveCallCount());

    }
}
