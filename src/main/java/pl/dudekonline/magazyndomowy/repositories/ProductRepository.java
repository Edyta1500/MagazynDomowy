package pl.dudekonline.magazyndomowy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dudekonline.magazyndomowy.models.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product>findAllByCategoryId(Integer categoryId);
}
