package org.ysferdgnn.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ysferdgnn.patterns.proxy.abstracts.Internet;
import org.ysferdgnn.patterns.proxy.concretes.ProxyInternet;
import org.ysferdgnn.patterns.proxy.errors.BannedDomainError;

public class ProxyInternetTest {



    @Test
    public void  testInternetBannedDomain(){
        Internet internet = new ProxyInternet();
        Assertions.assertThrows(BannedDomainError.class,() ->internet.connectToInternet("facebook.com"));
    }
    @Test
    public void testInternetNotBannedDomain() throws BannedDomainError {
        Internet internet = new ProxyInternet();

        Assertions.assertDoesNotThrow(() -> internet.connectToInternet("google.com"));
    }
}
