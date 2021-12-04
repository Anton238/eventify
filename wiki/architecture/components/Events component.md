# Events component

## Description

Events component is the main component of the system.   
Responsible for creating, storing, changing events.

### Component structure
- API layer: **Events service**
- Storage layer: **MongoDB**

## Events service
Events service provides API for CRUD operations with events.  
Tech stack: Java, Spring Boot, Project Reactor.

### Non-functional requirements:
- High Availability
- High Scalability
- High Throughput
- Eventual consistency

### Integrations:
- CRUD Synchronous API  
  HTTP REST requests
- CRUD Async API  
  Consuming events from Kafka topic
- Async Notifications  
  Produce events to Kafka topic every time any Event was changed

### Security
//TODO ... something about JWT

The correctness of the request will be checked based on the specified rights.  
For example, if request is sent to delete an event on behalf of a customer, it won't be processed and will return an error.
