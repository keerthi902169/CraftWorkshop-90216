package com.klef.soa.docker.dto;

import lombok.Data;

@Data
public class CraftWorkshopRequest {

    private String className;
    private Double materialCost;
    private int participantCount;
    private Boolean completed;
}