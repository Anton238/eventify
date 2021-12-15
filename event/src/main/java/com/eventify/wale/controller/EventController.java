package com.eventify.wale.controller;

import com.eventify.wale.dto.EventDTO;
import com.eventify.wale.event.facades.EventFacade;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/event")
@AllArgsConstructor
public class EventController {

    private EventFacade eventFacade;

    @PostMapping("/create")
    public EventDTO createEvent(@RequestBody EventDTO dto) {
        return eventFacade.createEvent(dto);
    }
}
