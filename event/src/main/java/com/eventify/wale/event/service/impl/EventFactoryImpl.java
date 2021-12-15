package com.eventify.wale.event.service.impl;

import com.eventify.wale.dto.EventDTO;
import com.eventify.wale.entity.EventEntity;
import com.eventify.wale.event.service.EventFactory;
import org.springframework.stereotype.Component;

@Component
public class EventFactoryImpl implements EventFactory {

    @Override
    public EventEntity createEventFromDTO(EventDTO dto) {
        EventEntity event = new EventEntity();

        event.setUid("22222222222");
        event.setName(dto.getName());
        event.setDescription(dto.getDescription());
        event.setProviderId(dto.getProviderId());
        event.setPrice(dto.getPrice());

        return event;
    }
}
