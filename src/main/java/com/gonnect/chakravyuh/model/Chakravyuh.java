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
    @Relationship(type = "MODEL_USER")
    private User user;
    @Relationship(type = "CURRENT_MODEL")
    private Model model;
    @Relationship(type = "MODEL_REGISTRY")
    private ModelRegistry modelRegistry;
    @Relationship(type = "CONSIST_OF_FEATURE_GROUP")
    private List<Execution> executions;
    private Long ovn;
}
