package com.voronov.market.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author Alexey Voronov on 12.07.2023
 */
@Entity
@Table(name = "market_order")
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "total_amount")
    private int totalAmount;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User customer;

    @OneToMany(mappedBy = "order")
    private List<Good> goodList;

}