package org.example.admin_for_bot.repositories;

import org.example.admin_for_bot.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
