package project.swa.ShoppingCartQueryService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.swa.ShoppingCartQueryService.data.ShoppingCartRepository;
import project.swa.ShoppingCartQueryService.domain.ShoppingCartEvent;

import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    public List<ShoppingCartEvent> getAll() {
        return shoppingCartRepository.findAll();
//        return shoppingCartRepository.findAll().stream().map(ShoppingCartAdapter::getShoppingCartDTO).toList();
    }
}
