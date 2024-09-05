package ci.gestcantineada.gestcantineada.service.Impl;

import ci.gestcantineada.gestcantineada.model.Menu;
import ci.gestcantineada.gestcantineada.repositorie.MenuRepository;
import ci.gestcantineada.gestcantineada.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;

    @Override
    public Menu save(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public Menu update(Menu menu) {
        if (menuRepository.existsById(menu.getId())) {
            return menuRepository.save(menu);
        }
        return null;
    }

    @Override
    public Optional<Menu> findById(Long id) {
        return menuRepository.findById(id);
    }


    @Override
    public List<Menu> findAll() {
        return menuRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
     menuRepository.deleteById(id);
    }

    @Override
    public List<Menu> findByName(String query) {
        return menuRepository.findAll().stream()
                .filter(menu -> menu.getDish() != null &&
                        menu.getDish().getName().toLowerCase().contains(query.toLowerCase()))
                .toList();
    }


}