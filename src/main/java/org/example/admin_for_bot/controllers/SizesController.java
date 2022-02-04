package org.example.admin_for_bot.controllers;

import org.example.admin_for_bot.entities.Prices;
import org.example.admin_for_bot.repositories.PricesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class SizesController {
    @Autowired
    PricesRepo pricesRepo;

    @GetMapping("/sizes")
    public String getSizes(Map<String, Object> model){
        Iterable<Prices> prices = pricesRepo.findAll();
        model.put("prices", prices);
        return "sizes";
    }
    @PostMapping("/sizes/add")
    public String addSize(@RequestParam String size, @RequestParam Integer price, Map<String, Object> model) {
        Prices prices = new Prices(size, price);
        pricesRepo.save(prices);
        Iterable<Prices> prices_list = pricesRepo.findAll();
        model.put("prices", prices_list);
        return "sizes";
    }
}
