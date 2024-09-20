package com.sgsistemas.demo.Product;

import com.sgsistemas.demo.Helpers.EntityId;
import com.sgsistemas.demo.Supplier.Supplier;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity(name = "product")
public class Product extends EntityId {
    @Column(name = "name")
    @NotBlank(message = "O nome do produto não pode estar em branco")  // Validação
    private String name;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "quantity")
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "supplier_id", nullable = false)//Chave estrangeira
    private Supplier supplier;
}
