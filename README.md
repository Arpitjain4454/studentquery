# Spring Boot JPA Example
This is a simple example of a Spring Boot application using JPA and MySQL. The application defines a Student entity with basic attributes such as first name, last name, age, active status, and admission date. The application provides a REST API for performing CRUD (create, read, update, delete) operations on Student entities, and also includes custom query methods using the @Query annotation.

# Frameworks Used
#### The following frameworks and technologies were used in this project:

- Spring Boot 2.5.4 - for creating standalone Spring applications
- Spring Data JPA - for providing easy integration with JPA and Hibernate
- MySQL 8.0.26 - for storing data in a relational database
- Maven 3.8.3 - for managing dependencies and building the project
- Java 11 - for writing the code

# Getting Started
### To build and run the application, follow these steps:

1. Clone this repository to your local machine.
2. Create a MySQL database called spring_boot_jpa_example.
3. Update the application.properties file with the correct MySQL connection settings.
4. Open a terminal in the project directory and run mvn spring-boot:run.
5. The application should now be running at http://localhost:8080.

# Data Structure Used
### The `Student` entity has the following attributes:

- `id` - a unique identifier for the student
- `firstName` - the first name of the student
- `lastName` - the last name of the student
- `age` - the age of the student
- `active` - a boolean flag indicating whether the student is active or not
- `admissionDate` - the date when the student was admitted

#### The following endpoints are available:



| Method    | Endpoint      | Description  |
| :------ |   :---       | :-------- |
| `GET`        |  `/students`           | Get all students   |
| `GET`         | `/students/{id}`	         | Get student by ID   |
| `POST`        |  `/students`           | Create a new student   |
| `PUT`         | `/students/{id}`	         | Update an existing student by ID  |
| `DELETE`        |  `/students/{id}`         | 	Delete a student by ID   |


####  The following custom query methods are also available:

| Method    | Description      |
| :------ |   :---       | 
| `GET /students/search?age=xx`        |  Get all students with age greater than or equal to xx    |
| `GET /students/search?firstName=xx&lastName=xx`         | Get all students with first name and last name starting with xx|

# Project Summary
#####  This project is a simple example of a Spring Boot application using JPA and MySQL to perform CRUD operations on a Student entity with basic attributes such as first name, last name, age, active status, and admission date. The application also includes custom query methods using the @Query annotation. The API provides endpoints for getting all students, getting a student by ID, creating a new student, updating an existing student by ID, and deleting a student by ID. The application also provides custom endpoints for querying students by age, first name, and last name.
