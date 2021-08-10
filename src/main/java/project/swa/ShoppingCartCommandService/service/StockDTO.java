package project.swa.ShoppingCartCommandService.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StockDTO {
    private int numberInStock;
    private String locationCode;

    public StockDTO(int numberInStock, String locationCode) {
        this.numberInStock = numberInStock;
        this.locationCode = locationCode;
    }
}
