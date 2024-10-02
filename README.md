# LAB5_AREP
## Property Management CRUD System

A web-based CRUD (Create, Read, Update, Delete) system for managing real estate properties. This project allows users to perform basic operations on property listings through a RESTful API.

## Table of Contents
1. [Project Summary](#project-summary)
2. [System Architecture](#system-architecture)
3. [Class Design](#class-design)
4. [Getting Started](#getting-started)
   - [Prerequisites](#prerequisites)
   - [Installing](#installing)
5. [Deployment](#deployment)
6. [Running the Tests](#running-the-tests)
7. [Built With](#built-with)
8. [Authors](#authors)
9. [License](#license)

## Project Summary

This Property Management System is a web application that enables users to:
- Create new property listings
- View a list of all properties and individual property details
- Update existing property information
- Delete property listings

The system consists of a backend REST API developed using Spring Boot and JPA, with a simple frontend served by Spring MVC.

## System Architecture

The system follows a typical Spring Boot architecture:

1. **Frontend**: Simple HTML page served by Spring MVC
   - Runs in the client's browser
   - Communicates with the backend API using AJAX or Fetch API

2. **Backend**: Spring Boot REST API
   - Exposes RESTful endpoints for CRUD operations
   - Handles business logic and data validation
   - Interacts with the database using JPA/Hibernate

3. **Database**: H2 or MySQL (configurable)
   - Stores property data in a `property` table
  
  
![image](https://github.com/user-attachments/assets/8290ccf1-1986-41d5-83cf-b8fa70d4d871)

## Class Design

Key classes in the system include:

1. `AccessingDataJpaApplication`: The main Spring Boot application class.
2. `AllController`: Serves the index page.
3. `Property`: Represents a real estate property with attributes such as ID, address, price, size, and description.
4. `PropertyController`: Exposes REST endpoints for property operations.
5. `PropertyRepository`: Interfaces with the database for data persistence using JPA.

## Getting Started

These instructions will help you set up the project on your local machine for development and testing purposes.

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Maven
- Git

### Installing

1. Clone the repository:
   ```
   git clone https://github.com/N1CKZ3B/LAB5_AREP
   ```

2. Navigate to the project directory:
   ```
   cd LAB5_AREP
   ```

3. Build and run the application:
   ```
   mvn spring-boot:run
   ```

4. Access the application at `http://localhost:8080/index.html`

## Deployment
Once run the mvn spring-boot:run command you will be able to see the application working properly, in this case, it is asked to us to connect the project through AWS and EC2 instances, the following video previews how it is seen properly

https://github.com/user-attachments/assets/69db243e-70b1-45ca-b385-a57ff921af80


For production environments, consider using a proper database like MySQL instead of H2, and configure your `application.properties` accordingly.

![image](https://github.com/user-attachments/assets/dbdc829a-5c0c-4d61-831c-13502fabe3e0)


## Running the Tests

To run the automated tests for this system:

```
mvn test
```

![image](https://github.com/user-attachments/assets/6a5d435d-b0ac-4b60-a1f0-f4efad1631c1)

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - The backend framework
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - Data persistence
* [H2 Database](https://www.h2database.com/) - In-memory database for development
* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

Nicolas Sebastian Achuri Macias

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details





