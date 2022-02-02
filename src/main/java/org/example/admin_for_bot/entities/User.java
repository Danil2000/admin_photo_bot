package org.example.admin_for_bot.entities;

import lombok.Getter;
import lombok.Setter;
import org.example.admin_for_bot.consts.TypeOfPost;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Component
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String chatId;
    private String mobile_phone;
    private String fio;
    private String number_of_post;
    private String size_of_photo;
    private Integer count_of_photo;
    private Integer price;
    private String photo_src;

    @Enumerated(EnumType.STRING)
    private TypeOfPost typeOfPost;

    public User(String chatId, String mobile_phone, String fio, String number_of_post, String size_of_photo, Integer count_of_photo, Integer price, String photo_src, TypeOfPost typeOfPost) {
        this.chatId = chatId;
        this.mobile_phone = mobile_phone;
        this.fio = fio;
        this.number_of_post = number_of_post;
        this.size_of_photo = size_of_photo;
        this.count_of_photo = count_of_photo;
        this.price = price;
        this.photo_src = photo_src;
        this.typeOfPost = typeOfPost;
    }
    public User() {

    }
}
