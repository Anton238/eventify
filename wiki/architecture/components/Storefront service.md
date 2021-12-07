# Storefront service

## Description

Storefront service is a BFF for site view.  
It receives requests from front-end, send requests to another services, aggregate results and sends them back.

### Component structure
- API layer: **Storefront service**  
  Tech stack: Java, Spring Boot, Project Reactor.
- Cache layer: **Redis**

### Non-functional requirements:
- High Availability
- High Scalability
- High Throughput

### Integrations:
- **Synchronous API**  
  HTTP REST requests should be used for integration with front-end.
- **Requests to other services**  
  HTTP REST requests or Kafka events should be used for integration with other services.
  
### Security
//TODO ... something about JWT

### Caching  
...