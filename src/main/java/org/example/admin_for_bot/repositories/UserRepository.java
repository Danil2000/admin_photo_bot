package org.example.admin_for_bot.repositories;

import org.example.admin_for_bot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
