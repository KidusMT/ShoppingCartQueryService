package project.swa.ShoppingCartQueryService.service;

import project.swa.ShoppingCartQueryService.domain.ShoppingCart;

public class ShoppingCartAdapter {
    public static ShoppingCart getShoppingCart(ShoppingCartDTO shoppingCartDTO) {
        return new ShoppingCart(
                shoppingCartDTO.getShoppingCartNumber(),
                shoppingCartDTO.getCartLineDTOS().stream().map(CartLineAdapter::getShoppingCart).toList());
    }

    public static ShoppingCartDTO getShoppingCartDTO(ShoppingCart product) {
        return new ShoppingCartDTO(product.getShoppingCartNumber(),
                product.getCartLines().stream().map(CartLineAdapter::getShoppingCartDTO).toList());
    }
}
