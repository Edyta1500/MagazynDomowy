package pl.dudekonline.magazyndomowy.services.categories;
import pl.dudekonline.magazyndomowy.models.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> findAll();
    Optional<Category> findById(Integer id);
}
