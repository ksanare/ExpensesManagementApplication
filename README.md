# Trip ExpensesManagementApplication

This project is a Spring Boot application for managing trip expenses. It includes user authentication, trip management, and expense management features.

## Requirements

- Java 11 or higher
- Maven
- MySQL
## Structure 
trip-expenses-management-Application/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── example/
│ │ │ └── tripexpensesmanagement/
│ │ │ ├── controller/
│ │ │ │ ├── UserController.java
│ │ │ │ ├── TripController.java
│ │ │ │ └── ExpenseController.java
│ │ │ ├── model/
│ │ │ │ ├── User.java
│ │ │ │ ├── Trip.java
│ │ │ │ └── Expense.java
│ │ │ ├── repository/
│ │ │ │ ├── UserRepository.java
│ │ │ │ ├── TripRepository.java
│ │ │ │ └── ExpenseRepository.java
│ │ │ ├── service/
│ │ │ │ ├── UserService.java
│ │ │ │ ├── TripService.java
│ │ │ │ └── ExpenseService.java
│ │ │ └── config/
│ │ │ └── SecurityConfig.java
│ │ └── resources/
│ │ ├── application.properties
│ │ └── data.sql
│ └── test/
│ └── java/
│ └── com/
│ └── example/
│ └── tripexpensesmanagement/
│ └── TripExpensesManagementApplicationTests.java
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
