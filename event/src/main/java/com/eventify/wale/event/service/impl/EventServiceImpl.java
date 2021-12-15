package com.eventify.wale.event.service.impl;

import com.eventify.wale.dto.EventDTO;
import com.eventify.wale.entity.EventEntity;
import com.eventify.wale.event.repository.EventRepository;
import com.eventify.wale.event.service.EventFactory;
import com.eventify.wale.event.service.EventService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class EventServiceImpl implements EventService {

    private EventRepository eventRepository;
    private EventFactory eventFactory;

    @Override
    public EventEntity createEvent(EventDTO eventData) {
        EventEntity event = eventFactory.createEventFromDTO(eventData);
        eventRepository.save(event);

        log.info("Created new event with uid {}", event.getUid());

        return event;
    }
}
