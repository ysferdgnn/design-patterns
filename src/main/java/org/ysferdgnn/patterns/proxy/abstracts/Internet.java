package org.ysferdgnn.patterns.proxy.abstracts;

import org.ysferdgnn.patterns.proxy.errors.BannedDomainError;

public interface Internet {
    public void connectToInternet(String domain) throws BannedDomainError;
}
