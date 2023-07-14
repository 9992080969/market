package com.voronov.market.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author Alexey Voronov on 11.07.2023
 */
@Entity
@Table(name = "market_user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username")
    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 100, message = "Имя должно быть от 2 до 100 символов длиной")
    private String username;

    @Column(name = "birthday")
    @NotEmpty
    private Date birthday;

    @Column(name = "email")
    @NotEmpty
    @Email
    @Size(max = 100, message = "Слишком длинный email")
    private String email;

    @Column(name = "password")
    @NotEmpty
    @Size(min = 7, max = 100, message = "Пароль должен быть от 7 до 100 символов длиной")
    private String password;

    @Column(name = "role")
    @Size(max = 100, message = "Неверная роль")
    private String role;

    @OneToMany(mappedBy = "customer")
    private List<Order> orderList;

    @Override
    public String toString() {
        return "Id: " + id + ". Role: " + role + ". " + username + ", " + birthday + ", " + email;
    }
}