package com.eventify.wale.event.facades;

import com.eventify.wale.dto.EventDTO;

public interface EventFacade {
    /**
     *
     * @return
     */
    EventDTO createEvent(EventDTO dto);
}
