# Trip ExpensesManagementApplication

This project is a Spring Boot application for managing trip expenses. It includes user authentication, trip management, and expense management features.

## Requirements

- Java 11 or higher
- Maven
- MySQL
## Functional Requirements

### User Management
- Users should be able to register and log in.
- Users should have roles (e.g., USER, ADMIN).

### Trip Management
- Users should be able to create, view, update, and delete trips.
- Each trip should have a destination, start date, and end date.

### Expense Management
- Users should be able to add, view, update, and delete expenses for a trip.
- Each expense should have a description, amount, and be associated with a trip.

## Non-Functional Requirements

- Security: Secure endpoints using Spring Security with basic authentication.
- Data Persistence: Use Spring Data JPA for database interactions with a MySQL database.
- Code Quality: Use Lombok to reduce boilerplate code and follow clean code principles.

