package ci.gestcantineada.gestcantineada.controller;

import ci.gestcantineada.gestcantineada.model.Dish;
import ci.gestcantineada.gestcantineada.model.Menu;
import ci.gestcantineada.gestcantineada.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("menus")
public class MenuController {

    private final MenuService menuService;

    @GetMapping
    public String showMenusPage(Model model) {
        model.addAttribute("menus", menuService.findAll());
        return "menus/menu";
    }

    @GetMapping("add")
    public String showFormPage(Model model) {
        model.addAttribute("menu", new Menu());
        return "menus/forms";
    }

    @GetMapping("/update/{id}")
    public String showUpdateMenuPage(@PathVariable Long id, Model model) {
        Optional<Menu> menuOptional = menuService.findById(id);
        if (menuOptional.isPresent()) {
            model.addAttribute("menu", menuOptional.get());
            return "menus/forms";
        }
        return "redirect:/menus";
    }

    @PostMapping("/save")
    public String saveMenu(@ModelAttribute Menu menu, Model model) {
        try {
            if (menu.getDish() == null) {
                menu.setDish(new Dish());
            }
            menuService.save(menu);
            return "redirect:/menus";
        } catch (Exception e) {
            model.addAttribute("error", "Une erreur est survenue lors de l'ajout du menu : " + e.getMessage());
            return "menus/forms";
        }
    }
    @PostMapping("/delete/{id}")
    public String deleteMenu(@PathVariable Long id) {
        menuService.deleteById(id);
        return "redirect:/menus";
    }
}