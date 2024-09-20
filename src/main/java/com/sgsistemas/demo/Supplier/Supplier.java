package com.sgsistemas.demo.Supplier;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sgsistemas.demo.Helpers.EntityId;
import com.sgsistemas.demo.Product.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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
    @NotBlank(message = "O nome do fornecedor não pode estar em branco")  // Validação
    @Size(min = 2, max = 100, message = "O nome do fornecedor deve ter entre 2 e 100 caracteres")  // Limites de tamanho
    private String name;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore // Adicionador para ignora a serialização do campo "products" após testar GET e ver que estava retornando BODY com tudo.
    private List<Product> products;
}
