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
    private Long ovn;
}
