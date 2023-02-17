package pl.dudekonline.magazyndomowy.services.categories;

import org.springframework.stereotype.Service;
import pl.dudekonline.magazyndomowy.models.Category;
import pl.dudekonline.magazyndomowy.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryDatabaseServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryDatabaseServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Integer id) {
        return categoryRepository.findById(id);
    }
}
