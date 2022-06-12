package org.ysferdgnn.singleton;

import org.junit.jupiter.api.Test;
import org.ysferdgnn.patterns.singleton.concretes.runnables.SingletonThreadSafeRunnable;

public class SingletonLazyThreadSafeTest {


    @Test
    public void testMultiThreadHashCodes(){
        for (int i =0; i<50; i++){
            SingletonThreadSafeRunnable singletonThreadSafeRunnable = new SingletonThreadSafeRunnable();
            singletonThreadSafeRunnable.run();

        }
    }
}
