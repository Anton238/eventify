package com.eventify.wale.event.facades;

import com.eventify.wale.dto.EventDTO;

import java.util.Optional;

public interface EventFacade {
    /**
     * Creates event based on data from EventDTO
     */
    EventDTO createEvent(EventDTO dto);

    /**
     * Find event by uid
     * @param uid
     * @return
     */
    Optional<EventDTO> getEvent(String uid);
}
