package com.eventify.wale.event.service;

import com.eventify.wale.dto.EventDTO;
import com.eventify.wale.entity.EventEntity;

import java.util.Optional;

public interface EventService {
    /**
     * Creates event based on data from eventData
     * @param eventData
     */
    EventEntity createEvent(EventDTO eventData);

    /**
     * Find event by uid
     * @return
     */
    Optional<EventEntity> getEvent(String uid);
}
