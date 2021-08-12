package project.swa.ShoppingCartQueryService.service;

import project.swa.ShoppingCartQueryService.domain.ShoppingCart;

import java.util.List;

public class ShoppingCartInternalAdapter {
    public static ShoppingCart getShoppingCart(project.swa.ShoppingCartCommandService.service.ShoppingCart shoppingCartDTO) {
        return new ShoppingCart(
                shoppingCartDTO.getShoppingCartNumber(),
                List.of());
    }

    public static ShoppingCartDTO getShoppingCartDTO(ShoppingCartDTO product) {
        return new ShoppingCartDTO(product.getShoppingCartNumber(),
                List.of());
    }
}
