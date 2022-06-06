package org.ysferdgnn.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ysferdgnn.patterns.singleton.concretes.SingletonClassSample;

public class SingletonTest {

    @Test
    public void testSingleton(){
        SingletonClassSample singletonClassSample = SingletonClassSample.getInstance();
        Assertions.assertNotNull(singletonClassSample);
    }
}
