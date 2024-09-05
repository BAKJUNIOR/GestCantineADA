package ci.gestcantineada.gestcantineada.repositorie;

import ci.gestcantineada.gestcantineada.model.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long> {
    List<Dish> findByNameContainingIgnoreCase(String name);
}