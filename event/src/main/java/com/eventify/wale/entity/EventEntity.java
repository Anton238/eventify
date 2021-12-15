package com.eventify.wale.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("event")
@Data
public class EventEntity {
    @Id
    private String uid;

    @Field("name")
    private String name;

    @Field("providerId")
    private String providerId;

    @Field("description")
    private String description;

    @Field("locationId")
    @DBRef(db = "event-location")
    private EventLocationEntity location;

    @Field("price")
    private double price;
}
