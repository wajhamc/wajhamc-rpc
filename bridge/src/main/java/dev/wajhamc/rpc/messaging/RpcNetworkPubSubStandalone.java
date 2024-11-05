package dev.wajhamc.rpc.messaging;

import io.lettuce.core.api.async.RedisAsyncCommands; // wajhamc stack started xd

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author: wajhamc dev (sadcenter, rchomczyk, fmap) on 19;05, 05.11.2027
 **/
public interface RpcNetworkPubSubStandalone {

    void subscribe(String... channels);
    void publish(String... channels);
    void delete(String id, String key);

    <TYPE> CompletableFuture<TYPE> findById(String id, String key);
    <TYPE> CompletableFuture<TYPE> findById(RpcNetworkIdentity id, String key);

    <TYPE> CompletableFuture<TYPE> findById(String id, String key, Class<TYPE> type);
    <TYPE> CompletableFuture<TYPE> findById(RpcNetworkIdentity id, String key, Class<TYPE> type);
}

// undefined
interface RedisClient {
    <RESULT> RESULT apply(Consumer<RedisAsyncCommands<String, String>> redisAsyncCommands);
    <RESULT> RESULT apply(Function<RedisAsyncCommands<String, String>, RESULT> redisAsyncCommands);
}
