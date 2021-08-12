package project.swa.ShoppingCartCommandService.service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//@Data
@Document(collection = "SHOPPINGCART")
public class ShoppingCart {
    @Id
    private String shoppingCartNumber;
    private List<CartLine> cartLines;

    public ShoppingCart(String shoppingCartNumber, List<CartLine> cartLines) {
        this.shoppingCartNumber = shoppingCartNumber;
        this.cartLines = cartLines;
    }

    public ShoppingCart() {
    }

    public String getShoppingCartNumber() {
        return shoppingCartNumber;
    }

    public void setShoppingCartNumber(String shoppingCartNumber) {
        this.shoppingCartNumber = shoppingCartNumber;
    }

    public List<CartLine> getCartLines() {
        return cartLines;
    }

    public void setCartLines(List<CartLine> cartLines) {
        this.cartLines = cartLines;
    }
}
