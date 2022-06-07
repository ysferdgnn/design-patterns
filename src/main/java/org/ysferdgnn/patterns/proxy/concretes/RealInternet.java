package org.ysferdgnn.patterns.proxy.concretes;

import org.ysferdgnn.patterns.proxy.abstracts.Internet;

 class RealInternet implements Internet {
    @Override
    public void connectToInternet(String domain) {
        System.out.println(String.format("Real internet working for domain: %s",domain));
    }
}
