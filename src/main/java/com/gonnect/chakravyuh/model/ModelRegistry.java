package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
@Data
public class ModelRegistry {
    @Id
    @GeneratedValue
    private Long id;
    @Index
    @EndNode
    private String name;
    private Long ovn;
    @Relationship(type = "REGISTERED_MODELS")
    private List<Model> models;
}
