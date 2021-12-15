package com.eventify.wale.event.repository;

import com.eventify.wale.entity.EventEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends MongoRepository<EventEntity, String> {
}
