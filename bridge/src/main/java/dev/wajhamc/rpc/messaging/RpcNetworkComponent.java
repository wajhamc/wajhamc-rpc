package dev.wajhamc.rpc.messaging;

/**
 * @author: wajhamc dev (sadcenter, rchomczyk, fmap) on 19;05, 05.11.2027
 **/
public interface RpcNetworkComponent {

    void start();
    void stop();

    boolean isRunning();

    default void enableComponent() {
    }

    default void disableComponent() {
    }
}
