package org.ysferdgnn.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ysferdgnn.patterns.singleton.concretes.SingletonLazyInitialization;

public class SingletonLazyInitializationTest {

    @Test
    public void testSingletonHashCode(){
        SingletonLazyInitialization singletonLazyInitialization1 = SingletonLazyInitialization.getInstance();
        SingletonLazyInitialization singletonLazyInitialization2 = SingletonLazyInitialization.getInstance();
        Assertions.assertEquals(singletonLazyInitialization1.hashCode(),singletonLazyInitialization2.hashCode());

    }

    @Test
    public void testSayHello(){
        SingletonLazyInitialization singletonLazyInitialization = SingletonLazyInitialization.getInstance();
        Assertions.assertEquals("Hello",singletonLazyInitialization.sayHello());
    }
}
