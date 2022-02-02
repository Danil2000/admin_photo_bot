package org.example.admin_for_bot.controllers;

import org.example.admin_for_bot.entities.User;
import org.example.admin_for_bot.repositories.UserRepository;
import org.example.admin_for_bot.services.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    CheckService checkService;

    @GetMapping("/users")
    public String getDishes(Map<String, Object> model) {
        List<User> users = userRepository.findAll();
        model.put("users_src", checkService.srcToList(users));
        return "orders";
    }
//    @PostMapping("/addDish")
//    public String addDish(@RequestParam String name, @RequestParam String category,
//                        @RequestParam String description, @RequestParam String image_src,
//                        @RequestParam Integer price, Map<String, Object> model) {
//        Dish dish = new Dish(name, description, image_src, category, price);
//        dishRepository.save(dish);
//        Iterable<Dish> dishes = dishRepository.findAll();
//        Iterable<Category> categories = categoryRepository.findAll();
//        model.put("categories", categories);
//        model.put("dishes", dishes);
//        return "dishes";
//    }
//    @PostMapping("/submit/{dish_name}")
//    public String updateDish(@PathVariable("dish_name") String dish_name,
//                             @RequestParam(required = false) String param,
//                             @RequestParam String value,
//                             @RequestParam(required = false) Integer price,
//                           Map<String, Object> model) {
//
//        Dish dish = dishRepository.findDistinctByName(dish_name);
//        switch (param) {
//            case "name":
//                dish.setName(value);
//            case "category":
//                dish.setCategory(value);
//            case "image_src":
//                dish.setImage_src(value);
//            case "description":
//                dish.setDescription(value);
//            case "price":
//                dish.setPrice(Integer.valueOf(value));
//        }
//        dishRepository.save(dish);
//        Iterable<Dish> dishes = dishRepository.findAll();
//        Iterable<Category> categories = categoryRepository.findAll();
//        model.put("categories", categories);
//        model.put("dishes", dishes);
//        return "dishes";
//    }
//    @GetMapping("/update/{dish_name}")
//    public String updateDish(@PathVariable("dish_name") String dish_name, Map<String, Object> model) {
//        model.put("name", dish_name);
//        return "updateDish";
//    }
}
