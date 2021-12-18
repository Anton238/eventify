package com.eventify.wale.controller;

import com.eventify.wale.dto.EventDTO;
import com.eventify.wale.event.facades.EventFacade;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/event")
@AllArgsConstructor
public class EventController {

    private EventFacade eventFacade;

    @PostMapping("/create")
    public EventDTO createEvent(@RequestBody EventDTO dto) {
        return eventFacade.createEvent(dto);
    }

    @GetMapping("/get/{uid}")
    public ResponseEntity<EventDTO> getEvent(@PathVariable String uid) {
        return ResponseEntity.of(eventFacade.getEvent(uid));
    }
}
