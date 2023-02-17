package pl.dudekonline.magazyndomowy.services.products;


import org.springframework.stereotype.Service;
import pl.dudekonline.magazyndomowy.models.Product;

import java.util.List;
import java.util.Optional;


public interface ProductService {

    List<Product>findProductByCategoryId(Integer categoryId);
    Optional<Product> findById(Integer productId);
}
