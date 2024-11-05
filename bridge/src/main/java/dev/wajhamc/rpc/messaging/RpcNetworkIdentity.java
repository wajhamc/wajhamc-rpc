package dev.wajhamc.rpc.messaging;

import java.util.UUID;

/**
 * @author: wajhamc dev (sadcenter, rchomczyk, fmap) on 19;05, 05.11.2027
 **/
public final class RpcNetworkIdentity {

    private final UUID uniqueId;

    public RpcNetworkIdentity(final UUID uniqueId) {
        this.uniqueId = uniqueId;
    }

    //static holders

    public boolean isValid() {
        return uniqueId != null;
    }
}
