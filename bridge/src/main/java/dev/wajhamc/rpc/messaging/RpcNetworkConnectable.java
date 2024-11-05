package dev.wajhamc.rpc.messaging;

/**
 * @author: wajhamc dev (sadcenter, rchomczyk, fmap) on 19;05, 05.11.2027
 **/
interface RpcNetworkConnectable extends Cloneable {

    void connect(String reason);
    void disconnect(String reason);
    void closeConnections();

    boolean isDisconnected();

}
