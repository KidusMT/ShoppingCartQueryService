package project.swa.ShoppingCartQueryService.domain;

import java.util.List;

//@Data

public class ShoppingCart {

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
