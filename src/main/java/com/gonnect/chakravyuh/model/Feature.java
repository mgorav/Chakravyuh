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
    // Setup 1:n and 1:1
    @Relationship(type = "REFERENCE_ONE_TO_MANY__FEATURES")
    private List<FeatureSet> featureSets;
    @Relationship(type = "REFERENCE_ONE_TO_ONE__FEATURES")
    private FeatureSet featureSet;
}
