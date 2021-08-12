package project.swa.ShoppingCartQueryService.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "SHOPPINGCART")
public class ShoppingCartEvent {
    private String eventId;
    private LocalDateTime eventdateTime;
    private ShoppingCart currentShoppingCart;

    public ShoppingCartEvent(){}

    public ShoppingCartEvent(String eventId, LocalDateTime eventdateTime, ShoppingCart currentShoppingCart) {
        this.eventId = eventId;
        this.eventdateTime = eventdateTime;
        this.currentShoppingCart = currentShoppingCart;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public LocalDateTime getEventdateTime() {
        return eventdateTime;
    }

    public void setEventdateTime(LocalDateTime eventdateTime) {
        this.eventdateTime = eventdateTime;
    }

    public ShoppingCart getCurrentShoppingCart() {
        return currentShoppingCart;
    }

    public void setCurrentShoppingCart(ShoppingCart currentShoppingCart) {
        this.currentShoppingCart = currentShoppingCart;
    }
}