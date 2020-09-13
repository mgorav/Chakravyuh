package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
@Data
public class Model {
    @Id
    @GeneratedValue
    private Long id;
    @Index
    private String name;
    private Rank rank;
    @Relationship(type = "CONSIST_OF_FEATURE_GROUP")
    private List<FeatureGroup> featureGroups;
    private Long ovn;
}
