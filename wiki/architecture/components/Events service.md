# Events service

## Description

Events service is the major component of the system.   
Responsible for creating, storing, changing Events and provides API for CRUD operations.

### Component structure
- API layer: **Events service**  
  Tech stack: Java, Spring Boot, Project Reactor.
- Storage layer: **MongoDB**
- Cache layer: **Redis**

### Non-functional requirements:
- High Availability
- High Scalability
- High Throughput
- Eventual consistency

These characteristics are achieved in the following way:
1. **Stateless app**  
   Each request can be processed by any instance of the application, so we can evenly distribute the load and scale the application.  
   Also, the application can be deployed in several regions to ensure availability.

2. **Asynchronous communications**  
   By using asynchronous events in Kafka, we can achieve high throughput with eventual consistency.
 
3. **Project Reactor**  
   Project Reactor is a part of Spring Framework which allows for better resource utilization and higher throughput.

### Integrations:
- **Synchronous API**  
  HTTP REST requests should be used for read operations
- **Asynchronous API**  
  Kafka events should be used for create/update/delete operations
- **Async Notifications**  
  Produce events to Kafka topic every time any Event was changed

### Security
//TODO ... something about JWT

The correctness of the request will be checked based on the specified rights.  
For example, if request is sent to delete an Event on behalf of a customer, it won't be processed and will return an error.

### Caching  
We predict that the most frequent operation is viewing events. The most viewed Events should be cached for faster access.