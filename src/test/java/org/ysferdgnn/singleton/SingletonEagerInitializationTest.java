package org.ysferdgnn.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ysferdgnn.patterns.singleton.concretes.SingletonEagerInitialization;

public class SingletonEagerInitializationTest {

    @Test
    public void testSingletonHashCode(){
        SingletonEagerInitialization singletonEager1 = SingletonEagerInitialization.getInstance();
        SingletonEagerInitialization singletonEager2 = SingletonEagerInitialization.getInstance();

        Assertions.assertEquals(singletonEager1.hashCode(),singletonEager2.hashCode());
    }

    @Test
    public void testSingletonHello(){
        SingletonEagerInitialization singletonEagerInitialization = SingletonEagerInitialization.getInstance();
        Assertions.assertEquals("Hello",singletonEagerInitialization.sayHello());
    }
}
