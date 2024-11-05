package dev.wajhamc.rpc.messaging;

import java.util.Map;
import java.util.function.Supplier;

/**
 * @author: wajhamc dev (sadcenter, rchomczyk, fmap) on 19;05, 05.11.2027
 **/
public interface RpcProxyProfile {

    Map<String, Object> getAdditionalProxyProfile();

    @SuppressWarnings("unchecked")
    default <TYPE> TYPE applyAdditionalProxyProfile(String key, Supplier<TYPE> supplier) {
        return (TYPE) getAdditionalProxyProfile().computeIfAbsent(key, (ignored) -> supplier.get());
    }
}
