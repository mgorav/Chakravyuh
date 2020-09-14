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
    @Relationship(type = "REGISTER_OR_USES_MODEL")
    private Model model;
    @Relationship(type = "DISCOVER_MODELS")
    private ModelRegistry modelRegistry;
    @Relationship(type = "ENROLLED_USER")
    private User user;
    @Relationship(type = "TRAINING_EXECUTIONS")
    private List<Execution> executions;
    private Long ovn;
}
