# Nimbus API

## Overview

Nimbus API is a Spring Cloud Gateway application that serves as the central entry point for all client requests to the backend microservices. Acting as an API Gateway, it provides routing, filtering, and cross-cutting concerns like security, monitoring, and resilience for the entire microservice architecture.

## Features

- **Centralized Routing**: Directs requests to appropriate microservices
- **Service Discovery**: Integration with Eureka for dynamic service registration and discovery
- **Load Balancing**: Distributes traffic across multiple service instances

## Installation

### Prerequisites

- Java JDK 17 or higher
- Maven 3.6+
- Eureka Server running on port 8761

### Steps

1. Clone the repository:

   ```sh
   git clone https://github.com/the-leaky-cauldron/nimbus-api
   cd nimbusapi
   ```


2. Build the application:

   ```sh
   # If using Maven
   mvn clean install
   
   # If using Gradle
   ./gradlew build
   ```

3. Run the application:

   ```sh
   # If using Maven
   mvn spring-boot:run
   
   # If using Gradle
   ./gradlew bootRun
   ```

## Technologies Used

- **Backend**: Java 21, Spring Boot 3.4, Spring Cloud Gateway
- **Service Discovery**: Eureka Client
- **Documentation**: SpringDoc OpenAPI
- **Build Tool**: Maven
- **Deployment**: Docker (optional)


## Acknowledgments

- Inspired by J.K. Rowling's Harry Potter series
- Special thanks to all contributors
- Scaler Academy for project guidance
- Spring Boot and related open-source communities

## Contact

- Project Maintainer: [Vijaysurya Mandala](mailto:mandala.vijay.surya@gamil.com)
- Project Repository: [GitHub](https://github.com/the-leaky-cauldron/nimbus-api)
- Issue Tracker: [GitHub Issues](https://github.com/the-leaky-cauldron/nimbus-api/issues)