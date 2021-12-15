package com.eventify.wale.event.converter;

import com.eventify.wale.dto.EventDTO;
import com.eventify.wale.entity.EventEntity;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EventToDtoConverter implements Converter<EventEntity, EventDTO> {
    @Override
    public EventDTO convert(EventEntity event) {
        EventDTO dto = new EventDTO();

        dto.setUid(event.getUid());
        dto.setName(event.getName());
        dto.setDescription(event.getDescription());
        dto.setProviderId(event.getProviderId());
        dto.setPrice(event.getPrice());

        return dto;
    }
}
