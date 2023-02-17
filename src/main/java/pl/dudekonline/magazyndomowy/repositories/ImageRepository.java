package pl.dudekonline.magazyndomowy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dudekonline.magazyndomowy.models.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
}
