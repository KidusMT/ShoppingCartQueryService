package project.swa.ShoppingCartQueryService.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import project.swa.ShoppingCartCommandService.service.ShoppingCartDTO;
import project.swa.ShoppingCartQueryService.data.ShoppingCartRepository;
import project.swa.ShoppingCartQueryService.domain.ShoppingCartEvent;
import project.swa.ShoppingCartQueryService.service.ShoppingCartAdapter;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class KafkaReceiver {
    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    @KafkaListener(topics = {"shoppingcarttopic"})
    public void receive(@Payload List<ShoppingCartDTO> customerDTO,
                        @Headers MessageHeaders headers) {
        System.out.println("received message="+ customerDTO.toString());
        customerDTO.forEach(shoppingCartDTO -> {
            shoppingCartRepository.save(new ShoppingCartEvent("123", LocalDateTime.now(),
                    ShoppingCartAdapter.getShoppingCart(new project.swa.ShoppingCartQueryService.service.ShoppingCartDTO(
                    shoppingCartDTO.getShoppingCartNumber(),
                    null
            ))));
        });

    }
}
