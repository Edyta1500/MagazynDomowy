package pl.dudekonline.magazyndomowy.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dudekonline.magazyndomowy.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
