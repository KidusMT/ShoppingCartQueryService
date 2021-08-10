package project.swa.ShoppingCartQueryService.service;

import project.swa.ShoppingCartQueryService.domain.CartLine;

public class CartLineAdapter {
    public static CartLine getShoppingCart(CartLineDTO cartLineDTO) {
        return new CartLine(
                cartLineDTO.getQuantity(),
                cartLineDTO.getProduct());
    }

    public static CartLineDTO getShoppingCartDTO(CartLine cartLine) {
        return new CartLineDTO(cartLine.getQuantity(),
                cartLine.getProduct());
    }
}
