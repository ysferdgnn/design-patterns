package org.ysferdgnn.patterns.singleton.concretes.runnables;

import org.ysferdgnn.patterns.singleton.concretes.SingletonLazyThreadSafe;

public class SingletonThreadSafeRunnable implements Runnable{


    @Override
    public void run() {
        SingletonLazyThreadSafe singletonLazyThreadSafe = SingletonLazyThreadSafe.getInstance();
        System.out.println("Thread -> "+this.hashCode()+": "+ singletonLazyThreadSafe.giveCallCount());
    }
}
