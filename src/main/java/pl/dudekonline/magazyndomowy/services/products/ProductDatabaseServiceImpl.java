package pl.dudekonline.magazyndomowy.services.products;


import org.springframework.stereotype.Service;
import pl.dudekonline.magazyndomowy.models.Product;
import pl.dudekonline.magazyndomowy.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDatabaseServiceImpl  implements ProductService{

    private final ProductRepository productRepository;

    public ProductDatabaseServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findProductByCategoryId(Integer categoryId) {
        return productRepository.findAllByCategoryId(categoryId);
    }

    @Override
    public Optional<Product> findById(Integer productId) {
        return productRepository.findById(productId);
    }
}
