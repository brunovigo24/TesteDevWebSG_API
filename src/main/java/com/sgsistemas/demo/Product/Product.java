package com.sgsistemas.demo.Product;

import com.sgsistemas.demo.Helpers.EntityId;
import com.sgsistemas.demo.Supplier.Supplier;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity(name = "product")
public class Product extends EntityId {
    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "registrationDate")
    private Data registrationDate;

    @ManyToOne
    @JoinColumn(name = "supplier_id", nullable = false)
    private Supplier supplier;
}
