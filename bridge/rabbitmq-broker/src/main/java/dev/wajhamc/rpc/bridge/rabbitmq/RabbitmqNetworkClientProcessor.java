package dev.wajhamc.rpc.bridge.rabbitmq;

import com.rabbitmq.client.ConnectionFactory;

public record RabbitmqNetworkClientProcessor(ConnectionFactory connectionFactory) {
}
