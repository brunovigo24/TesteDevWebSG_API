package com.sgsistemas.demo.Supplier;

import com.sgsistemas.demo.Helpers.EntityId;
import com.sgsistemas.demo.Product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;


@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity(name = "supplier")
public class Supplier extends EntityId {

    @Column(name = "name")
    private String name;

    // Não precisa colocar o lado inverso do relacionamento aqui, mas pode ser útil
    // para navegar de Supplier para seus Products
    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;
}
