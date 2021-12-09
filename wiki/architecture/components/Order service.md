# Orders service

## Description

Orders service is a service responsible for purchasing tickets, managing order processes. 
It provides API for creating an order and uses workflow pattern to manage order process.

### Component structure
- API layer: **Orders service**  
  Tech stack: Java, Spring Boot.
- Storage layer: **MongoDB**, **Cassandra**

Service:
1. Creates order
2. Reserves event capacity
3. Performs payments
4. Updates order data
5. Updates order history
6. Launch some other integrations

### Non-functional requirements:
- High Availability
- High Scalability
- Eventual consistency

### Integrations:
- **Synchronous API**  
  Provides HTTP REST API for creating order, fetching order data and other operations
- **Async Notifications**  
  Produce events to Kafka topic for performed operations (f.e order was created)

### Workflow:
A workflow is a sequence of certain actions, including rollbacks. For example, if the payment wasn't successful, rollback action will restore stocks and set special status for the order.    
Thus, workflow allows us to achieve eventual consistency for our application.

All workflow steps and additional meta information should be stored in Cassandra-db. This allows us to start running processes on other nodes if one node crashes.
If one node doesn't send a heartbeat, its processes will be launched on the other node.
