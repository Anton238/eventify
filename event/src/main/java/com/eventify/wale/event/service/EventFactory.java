package com.eventify.wale.event.service;

import com.eventify.wale.dto.EventDTO;
import com.eventify.wale.entity.EventEntity;

public interface EventFactory {
    EventEntity createEventFromDTO(EventDTO dto);
}
