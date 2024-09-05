package ci.gestcantineada.gestcantineada.service;


import ci.gestcantineada.gestcantineada.model.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuService {


    Menu save(Menu menu);
    Menu update(Menu menu);
    Optional<Menu> findById(Long id);
    List<Menu> findAll();
    void deleteById(Long id);
    List<Menu>  findByName(String query) ;

}
