package pl.dudekonline.magazyndomowy.services.categories;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.dudekonline.magazyndomowy.models.Category;
import pl.dudekonline.magazyndomowy.repositories.CategoryRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryDatabaseServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Integer id) {
        return categoryRepository.findById(id);
    }
}
