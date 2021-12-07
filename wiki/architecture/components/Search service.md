# Search service

## Description

Search service is a component which provides API for fast search operations by specified keywords.  
It consumes events from Kafka and update stored data based on that events. Then, when it receives requests for search it reads data from storage.

### Component structure
- API layer: **Search service**  
  Tech stack: Java, Spring Boot, Project Reactor.
- Storage layer: **ElasticSearch**

### Non-functional requirements:
- High Availability
- High Scalability
- High Throughput

### Integrations:
- **Synchronous API**  
  HTTP REST requests should be used for read operations (for searching)
- **Asynchronous API**  
  Consumed Kafka events should be used for updating ElasticSearch data

### Security
//TODO ... something about JWT