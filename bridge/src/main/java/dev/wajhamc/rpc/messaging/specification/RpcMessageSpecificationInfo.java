package dev.wajhamc.rpc.messaging.specification;

import java.util.function.Supplier;

interface RpcMessageSpecificationInfo<TYPE> extends Supplier<TYPE> {

    @Override
    TYPE get();
}
