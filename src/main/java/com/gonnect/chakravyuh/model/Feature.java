package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
@Data
public class Feature {
    @Id
    @GeneratedValue
    private Long id;
    @Index
    private String name;
    @Index
    private String value;
    private String type;
    private Long ovn;

    @Relationship(type = "RELATED_FEATURES")
    private List<Feature> features;
}
