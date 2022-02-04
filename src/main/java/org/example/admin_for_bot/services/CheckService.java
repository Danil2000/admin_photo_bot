package org.example.admin_for_bot.services;

import org.example.admin_for_bot.entities.User;
import org.example.admin_for_bot.entities.Contact;
import org.example.admin_for_bot.entities.UserSrc;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

public class CheckService {
    public List<UserSrc> srcToList(List<User> users) {
        List<UserSrc> result = new ArrayList<>();
        for (User user : users) {
            String[] splited = user.getPhoto_src().split(",");
            for(String src : splited) {
                result.add(new UserSrc(user.getFio(), src));
            }
        }
        return result;
    }
    public List<Contact> getUniqueContacts(List<Contact> contacts) {
        List<String> names = new ArrayList<>();
        List<Contact> result = new ArrayList<>();
        for (Contact contact: contacts) {
            if (!result.contains(contact.getName())) {
                names.add(contact.getName());
                result.add(contact);
            }
        }
        return result;
    }
}
