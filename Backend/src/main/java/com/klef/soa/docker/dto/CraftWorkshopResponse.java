package com.klef.soa.docker.dto;

import lombok.Data;

@Data
public class CraftWorkshopResponse {

    private Long id;
    private String className;
    private Double materialCost;
    private int participantCount;
    private Boolean completed;
}