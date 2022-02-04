package org.example.admin_for_bot.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String photo_size;
    private Integer price;

    public Prices(String photo_size, Integer price) {
        this.photo_size = photo_size;
        this.price = price;
    }

    public Prices() {
    }
}
