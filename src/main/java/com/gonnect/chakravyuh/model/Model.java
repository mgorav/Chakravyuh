package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
@Data
public class Model {
    @Id
    @GeneratedValue
    @EndNode
    private Long id;
    @Index
    private String name;
    @Relationship(type = "MODEL_RANKING")
    private Rank rank;
    @Relationship(type = "MODEL_OWNER")
    private User user;
    @Relationship(type = "CONSIST_OF_FEATURE_GROUP")
    private List<FeatureGroup> featureGroups;
    @Relationship(type = "MODEL_HEALTH")
    private List<Health> healthStats;
    private Long ovn;
}
