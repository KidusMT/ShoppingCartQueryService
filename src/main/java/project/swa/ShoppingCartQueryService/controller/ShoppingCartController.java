package project.swa.ShoppingCartQueryService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.swa.ShoppingCartQueryService.exception.ShoppingCartNotFoundException;
import project.swa.ShoppingCartQueryService.service.ShoppingCartDTO;
import project.swa.ShoppingCartQueryService.service.ShoppingCartService;

import java.util.List;

@RestController
@RequestMapping("/shopping")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping
    public ResponseEntity<?> getCustomers() {
        List<ShoppingCartDTO> customerDTO1 = shoppingCartService.getAll();
        try {
            if (customerDTO1 != null) {
                return new ResponseEntity<>(customerDTO1, HttpStatus.CREATED);
            } else {
                throw new ShoppingCartNotFoundException("Product not found");
            }
        } catch (ShoppingCartNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
