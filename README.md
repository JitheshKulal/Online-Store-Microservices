# Online Store


## Overview

This repository contains the backend implementation of an **Online Store Application** built using the **Microservice Architecture** paradigm with **Spring Boot**. The system is composed of various microservices, each serving a specific purpose to ensure modularity and scalability.

## Microservices

1.  **Product Service:**
    
    -   Manages product information, including details, pricing, and availability.
2.  **Order Service:**
    
    -   Handles the processing of customer orders, including order creation, payment processing, and order fulfillment.
3.  **Inventory Service:**
    
    -   Manages inventory levels and ensures accurate stock information across the system.
4.  **Notification Service:**
    
    -   Responsible for sending notifications to users, such as order confirmations, shipping updates, and promotional messages.
5.  **Authentication Service:**
    
    -   Manages user authentication and authorization, ensuring secure access to the application.

## Technologies Used

-   **Spring Boot:**
    
    -   The microservices are implemented using the Spring Boot framework, providing a robust and scalable foundation.

-   **WebClient**

    -  WebClient used for synchronous communication between the microservices.
 
-   **Kafka and RabbitMQ:**
    
    -   Utilized for asynchronous communication between microservices, ensuring real-time updates and decoupling of services.

-   **MongoDB and Postgres:**
    
    -   MongoDB is used for storing non-relational data, while MySQL is employed for relational data storage.
