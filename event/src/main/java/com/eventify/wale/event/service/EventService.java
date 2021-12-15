package com.eventify.wale.event.service;

import com.eventify.wale.dto.EventDTO;
import com.eventify.wale.entity.EventEntity;

public interface EventService {
    /**
     * Creates event based on data from eventData
     * @param eventData
     */
    EventEntity createEvent(EventDTO eventData);
}
