# Employee Management REST API

A RESTful API built using Java 21, Spring Boot, Spring Data JPA, Hibernate, and MySQL.

## Features

- Create employee records
- Retrieve all employees
- Retrieve an employee by ID
- Update employee details
- Delete employee records
- Search employees by name
- Store data using MySQL

## Technologies Used

- Java 21
- Spring Boot
- Spring Web MVC
- Spring Data JPA
- Hibernate
- MySQL
- Maven

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/employees` | Retrieve all employees |
| GET | `/api/employees/{id}` | Retrieve an employee by ID |
| GET | `/api/employees/search?name=John` | Search employees by name |
| POST | `/api/employees` | Create an employee |
| PUT | `/api/employees/{id}` | Update an employee |
| DELETE | `/api/employees/{id}` | Delete an employee |

## Setup

1. Clone the repository:

   `git clone https://github.com/Rathipriya-G/employee-management-api.git`

2. Create the MySQL database:

   `CREATE DATABASE employee_management;`

3. Configure your local database credentials in `src/main/resources/application.properties`, using `application-example.properties` as a reference.

4. Run the application on Windows:

   `.\mvnw.cmd spring-boot:run`

5. The API runs at `http://localhost:8080` by default.

## Author

Rathipriya G
