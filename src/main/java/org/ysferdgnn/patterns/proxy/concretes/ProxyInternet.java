package org.ysferdgnn.patterns.proxy.concretes;

import org.ysferdgnn.patterns.proxy.abstracts.Internet;
import org.ysferdgnn.patterns.proxy.errors.BannedDomainError;

import java.util.Arrays;
import java.util.List;

public class ProxyInternet implements Internet {

    private final RealInternet realInternet= new RealInternet();



    List<String> bannedDomains = Arrays.asList("facebook.com","twitter.com","instagram.com");

    @Override
    public void connectToInternet(String domain) throws BannedDomainError {
        System.out.println(String.format("proxy internet working for domain: %s",domain));
        if (bannedDomains.contains(domain))
            throw  new BannedDomainError();
        realInternet.connectToInternet(domain);
    }
}
