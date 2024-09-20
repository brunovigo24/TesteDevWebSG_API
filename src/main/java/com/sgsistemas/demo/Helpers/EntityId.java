package com.sgsistemas.demo.Helpers;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class EntityId {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entity_seq")
    @SequenceGenerator(name = "entity_seq", sequenceName = "entity_seq", allocationSize = 1)//Adicionado após visualizar que hibernate não estava seguindo ordem de id
    private Long id;
}
