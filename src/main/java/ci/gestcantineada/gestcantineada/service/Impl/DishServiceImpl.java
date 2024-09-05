package ci.gestcantineada.gestcantineada.service.Impl;


import ci.gestcantineada.gestcantineada.model.Dish;
import ci.gestcantineada.gestcantineada.repositorie.DishRepository;
import ci.gestcantineada.gestcantineada.service.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DishServiceImpl implements DishService {
    private final DishRepository dishRepository;


    @Override
    public Dish save(Dish dish) {
        return dishRepository.save(dish);
    }

    @Override
    public Dish update(Dish dish) {
        if (dishRepository.existsById(dish.getId())) {
            return dishRepository.save(dish);
        }
        return null;
    }

    @Override
    public Optional<Dish> findById(Long id) {
        return dishRepository.findById(id);
    }


    @Override
    public List<Dish> findAll() {
        return dishRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        dishRepository.deleteById(id);

    }


    public List<Dish> findByName(String name) {
        return dishRepository.findByNameContainingIgnoreCase(name);
    }
}
