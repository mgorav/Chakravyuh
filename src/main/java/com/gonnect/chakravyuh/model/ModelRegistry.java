package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity("node-registry")
@Data
public class ModelRegistry {
    @Id
    @GeneratedValue
    private Long id;
    @Index
    private String name;
    @Relationship(type = "REGISTERED_MODELS")
    private List<Model> models;
    private Long ovn;
}
