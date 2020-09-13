package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
@Data
public class FeatureSet {
    @Id
    @GeneratedValue
    @EndNode
    private Long id;
    @Index
    private String name;
    @Relationship(type = "CONTAINER_OF_FEATURES")
    private List<Feature> features;
    @Relationship(type = "CONNECTED_TO_DATASET")
    private DataSet dataSet;
    private Long ovn;
}
