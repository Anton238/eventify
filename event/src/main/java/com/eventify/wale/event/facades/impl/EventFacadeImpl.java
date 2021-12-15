package com.eventify.wale.event.facades.impl;

import com.eventify.wale.dto.EventDTO;
import com.eventify.wale.entity.EventEntity;
import com.eventify.wale.event.facades.EventFacade;
import com.eventify.wale.event.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EventFacadeImpl implements EventFacade {

    private EventService eventService;
    private Converter<EventEntity, EventDTO> eventToDtoConverter;

    @Override
    public EventDTO createEvent(EventDTO dto) {
        EventEntity event = eventService.createEvent(dto);

        return eventToDtoConverter.convert(event);
    }
}
