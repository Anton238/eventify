# User service

## Description
This service responsible for storing credentials and rights, providing topics.

### Component structure
- API layer: **Auth service**  
  Tech stack: Java, Spring Boot.
- Storage layer: **PostgreSQL**

### Non-functional requirements:
- High Availability
- High Scalability
- High Elasticity

### Integrations:
- **Synchronous API**  
  Consumes HTTP REST requests for read operations
- **Asynchronous API**  
  Consumes Kafka events for create/update/delete operations