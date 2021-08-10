package project.swa.ShoppingCartQueryService.integration;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import project.swa.ShoppingCartCommandService.ShoppingCartDTO;

import java.util.List;

@Component
public class KafkaReceiver {
    @KafkaListener(topics = {"shoppingcarttopic"})
    public void receive(@Payload List<ShoppingCartDTO> customerDTO,
                        @Headers MessageHeaders headers) {
        System.out.println("received message="+ customerDTO.toString());
    }
}
