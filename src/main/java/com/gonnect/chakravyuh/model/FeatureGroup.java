package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
@Data
public class FeatureGroup {
    @Id
    @GeneratedValue
    private Long id;
    @Index
    private String name;
    @Relationship(type = "COMPOSE_OF_FEATURE_SET")
    private List<FeatureSet> featureSets;
    private Long ovn;
}
