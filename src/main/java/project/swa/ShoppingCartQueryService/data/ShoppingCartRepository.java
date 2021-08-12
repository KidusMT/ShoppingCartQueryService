package project.swa.ShoppingCartQueryService.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import project.swa.ShoppingCartQueryService.domain.ShoppingCartEvent;

@Repository
public interface ShoppingCartRepository extends MongoRepository<ShoppingCartEvent, String> {

}
