package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
@Data
public class Chakravyuh {
    @Id
    @GeneratedValue
    @StartNode
    private Long id;
    @Index
    private String name;
    @Relationship(type = "ENROLL_AND_CREATE_FEATURE_GROUP")
    private List<FeatureGroup> featureGroups;
    @Relationship(type = "CHAKRAVYUH_EXECUTIONS")
    private List<Execution> executions;
    private Long ovn;
}
