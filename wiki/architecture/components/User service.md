# User service

## Description
This service responsible for storing user information, such as personal data or order history.
It provides API for creating and updating user data.

### Component structure
- API layer: **User service**  
  Tech stack: Java, Spring Boot.
- Storage layer: **PostgreSQL**
- Cache layer: **Redis**

### Non-functional requirements:
- High Availability
- High Scalability

### Integrations:
- **Synchronous API**  
  Consumes HTTP REST requests for read operations
- **Asynchronous API**  
  Consumes Kafka events for create/update/delete operations