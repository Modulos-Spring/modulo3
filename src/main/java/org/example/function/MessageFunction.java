package org.example.function;

import org.example.function.dto.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class MessageFunction {

    @Bean
    public Consumer<Message> messageConsumer() {
        return msn -> {
            System.out.println("A mensagem chegou:" + msn);
        };
    }
}
