package com.voronov.market.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @author Alexey Voronov on 12.07.2023
 */
@Entity
@Table(name = "goods")
@AllArgsConstructor
@NoArgsConstructor
public class Good {
    @Id
    @Column (name = "good_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "goodname")
    @NotEmpty
    @Size(min = 2, max = 100, message = "Наименование товара должно быть от 2 до 100 символов")
    private String goodName;

    @Column(name = "price")
    @NotEmpty
    private double price;

    @Column(name = "weight_good")
    @NotEmpty
    private boolean weightGood;

    @Column(name = "quantity")
    @NotEmpty
    private double quantity;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private Order order;


/*    @Column(name = "brand")
    @Size (max = 100, message = "Название бренда/производителя должно быть менее 100 символов")
    private String brand;*/

/*    @Column(name = "good_type")
    @NotEmpty
    private String goodType;*/

/*    @Column(name = "supplier")
    private String supplier;*/

/*    @Column(name = "description")
    private String description;*/



}