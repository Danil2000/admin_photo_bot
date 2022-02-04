package org.example.admin_for_bot.repositories;

import org.example.admin_for_bot.entities.Prices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricesRepo extends JpaRepository<Prices, Integer> {

}
