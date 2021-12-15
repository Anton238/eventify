package com.eventify.wale.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@Document("event-location")
public class EventLocationEntity {
    @Id
    private String uid;

    @Field("name")
    private String name;

    @Field("city")
    private String city;

    @Field("address")
    private String address;

    @Field("date")
    private LocalDateTime date;

    @Field("virtual")
    private boolean virtual;
}
