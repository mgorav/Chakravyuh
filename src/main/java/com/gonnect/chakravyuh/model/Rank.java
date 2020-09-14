package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

@NodeEntity
@Data
public class Rank {
    @Id
    @GeneratedValue
    private Long id;
    private Integer rank;
    private Long ovn;
}
