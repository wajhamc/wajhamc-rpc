package dev.wajhamc.rpc.messaging;

/**
 * @author: wajhamc dev (sadcenter, rchomczyk, fmap) on 19;05, 05.11.2027
 **/
public interface RpcNetworkCallback {

    default void success() {
    }

    default void failure() {
    }
}
