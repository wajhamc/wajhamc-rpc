package dev.wajhamc.rpc.messaging;

/**
 * @author: wajhamc dev (sadcenter, rchomczyk, fmap) on 19;05, 05.11.2027
 **/
public interface RpcNetwork {

    RpcNetworkClient setup(String name); // ...

    void disposeClient(RpcNetworkClient client);
}
