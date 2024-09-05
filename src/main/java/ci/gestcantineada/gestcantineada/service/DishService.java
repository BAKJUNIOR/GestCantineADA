package ci.gestcantineada.gestcantineada.service;


import ci.gestcantineada.gestcantineada.model.Dish;
import ci.gestcantineada.gestcantineada.model.Menu;

import java.util.List;
import java.util.Optional;

public interface DishService {

    Dish save(Dish dish );
    Dish update(Dish dish);
    Optional<Dish> findById(Long id);
    List<Dish> findAll();
    void deleteById(Long id);
    List<Dish>  findByName(String query) ;

}
