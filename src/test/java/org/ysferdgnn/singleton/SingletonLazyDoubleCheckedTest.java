package org.ysferdgnn.singleton;

import org.junit.jupiter.api.Test;
import org.ysferdgnn.patterns.singleton.concretes.runnables.SingletonLazyDoubleCheckedRunnable;

import java.time.Duration;
import java.time.Instant;

public class SingletonLazyDoubleCheckedTest {


    @Test
    public void testMultiThreadHashCodes(){
        SingletonLazyDoubleCheckedRunnable singletonLazyDoubleCheckedRunnable =new SingletonLazyDoubleCheckedRunnable();
        Instant instantStart = Instant.now();
        for (int i =0; i< 500; i++){
            singletonLazyDoubleCheckedRunnable.run();
        }
        Instant instantEnd = Instant.now();

        System.out.println(Duration.between(instantStart,instantEnd).getNano()/1_000_000);

    }
}
