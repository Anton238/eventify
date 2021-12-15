package com.eventify.wale.dto;

import lombok.Data;

@Data
public class EventDTO {
    private String uid;

    private String name;

    private String providerId;

    private String description;

    private double price;
}
