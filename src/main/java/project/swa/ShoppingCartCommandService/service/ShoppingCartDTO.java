package project.swa.ShoppingCartCommandService.service;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ShoppingCartDTO {
    private String shoppingCartNumber;
    private List<CartLineDTO> cartLineDTOS;

    public ShoppingCartDTO(String shoppingCartNumber, List<CartLineDTO> cartLineDTOS) {
        this.shoppingCartNumber = shoppingCartNumber;
        this.cartLineDTOS = cartLineDTOS;
    }
}
