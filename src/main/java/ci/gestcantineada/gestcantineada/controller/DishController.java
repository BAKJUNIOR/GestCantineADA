package ci.gestcantineada.gestcantineada.controller;

import ci.gestcantineada.gestcantineada.model.Dish;
import ci.gestcantineada.gestcantineada.service.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("dishes")
public class DishController {

    private final DishService dishService;
    @GetMapping
    public String ShowMenusPage(Model model){
        model.addAttribute("dishs", dishService.findAll());
        return "dishes/dish";
    }

    @GetMapping("add")
    public String showFormPage(Model model) {
        model.addAttribute("dish", new Dish());
        return "dishes/forms";
    }
    @GetMapping("/update/{id}")
    public String showUpdateDishPage(
            @PathVariable Long id,
            Model model
    ) {
        Optional<Dish> dishOptional = dishService.findById(id);
        if (dishOptional.isPresent()) {
            model.addAttribute("dish", dishOptional.get());
            return "dishes/forms";
        }
        return "redirect:/dishes";
    }

    @PostMapping("/save")
    public String saveDish(@ModelAttribute Dish dish) {
        dishService.save(dish);
        return "redirect:/dishes";
    }

    @PostMapping("/delete/{id}")
    public String deleteDish(@PathVariable Long id) {
        dishService.deleteById(id);
        return "redirect:/dishes";
    }

    @GetMapping("/search")
    public String searchDish(@RequestParam String query, Model model) {
        List<Dish> searchResults = dishService.findByName(query);
        model.addAttribute("dishes", searchResults);
        return "dishes/dish";

    }
    }
