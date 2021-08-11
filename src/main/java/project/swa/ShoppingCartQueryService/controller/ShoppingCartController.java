package project.swa.ShoppingCartQueryService.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.swa.ShoppingCartQueryService.exception.ShoppingCartNotFoundException;
import project.swa.ShoppingCartQueryService.service.ShoppingCartDTO;
import project.swa.ShoppingCartQueryService.service.ShoppingCartService;

import java.util.List;

@RestController
@RequestMapping("/shoppingquery")
public class ShoppingCartController {
    private static final Logger logger = LoggerFactory.getLogger(ShoppingCartController.class.getName());

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping
    public ResponseEntity<?> getCustomers() {
        logger.info("Calling GET /shoppingquery");
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
