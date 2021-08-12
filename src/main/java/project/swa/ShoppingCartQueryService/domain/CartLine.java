package project.swa.ShoppingCartQueryService.domain;

import project.swa.ShoppingCartQueryService.service.ProductDTO;

//@Data
public class CartLine {
    private int quantity;
    private ProductDTO product;

    public CartLine(int quantity, ProductDTO product) {
        this.quantity = quantity;
        this.product = product;
    }

    public CartLine() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProductDTO getProduct() {
        return product;
    }

    public void setProduct(ProductDTO product) {
        this.product = product;
    }
}
