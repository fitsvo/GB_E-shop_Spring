package com.geekbrains.geekmarketwinter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.config.annotation.*;

@Configuration
@EnableWebSocketMessageBroker
//@Component("messageBroker")
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
    @Override
    public void configureMessageBroker(MessageBrokerRegistry confi) {
        // префикс отправителя
        System.out.println("call method WebSocketConfig 1");
        confi.enableSimpleBroker("/topic");
        // префикс получателя
        confi.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        System.out.println("Web socket register...");
        registry.addEndpoint("/socket").withSockJS();
    }

}