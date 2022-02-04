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
    private UserRepository userRepository;

    private final CheckService checkService = new CheckService();

    @GetMapping("/photos")
    public String getPhotos(Map<String, Object> model) {
        List<User> users = userRepository.findAll();
        model.put("users_src", checkService.srcToList(users));
        return "photos";
    }
    @GetMapping("/users")
    public String getOrders(Map<String, Object> model) {
        List<User> users = userRepository.findAll();
        model.put("usersList", users);
        return "orders";
    }

}
