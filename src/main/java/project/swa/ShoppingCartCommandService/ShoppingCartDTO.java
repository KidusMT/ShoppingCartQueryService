package project.swa.ShoppingCartCommandService;

import lombok.Data;
import lombok.NoArgsConstructor;
import project.swa.ShoppingCartQueryService.service.CartLineDTO;

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
