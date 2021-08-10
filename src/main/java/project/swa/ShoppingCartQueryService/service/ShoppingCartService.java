package project.swa.ShoppingCartQueryService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.swa.ShoppingCartQueryService.data.ShoppingCartRepository;

import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

    public List<ShoppingCartDTO> getAll() {
        return shoppingCartRepository.findAll().stream().map(ShoppingCartAdapter::getShoppingCartDTO).toList();
    }
}
