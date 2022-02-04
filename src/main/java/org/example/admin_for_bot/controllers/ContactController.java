package org.example.admin_for_bot.controllers;

import org.example.admin_for_bot.entities.Contact;
import org.example.admin_for_bot.repositories.ContactRepo;
import org.example.admin_for_bot.services.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class ContactController {
    @Autowired
    private ContactRepo contactRepo;

    private CheckService checkService = new CheckService();

    @GetMapping("/contacts")
    public String getContacts(Map<String, Object> model) {
        List<Contact> contacts = contactRepo.findAll();
        List<Contact> uniqueContacts = checkService.getUniqueContacts(contacts);
        model.put("contacts", uniqueContacts);
        return "users";
    }
}