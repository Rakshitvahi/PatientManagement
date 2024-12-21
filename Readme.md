# Patient Management System

## Basic CRUD operations

### Endpoints

- GET /patient/all --> Retrieves a list of all patients.
- GET /patient/{id} --> Retrieves the details of a specific patient by ID.
- GET /patient/count --> Retrieves the total count of patients.
- POST /patient --> Adds a new patient to the database.
- DELETE /patient/{id} --> Deletes a specific patient by ID.
- PUT /patient --> Updates the details of an existing patient.

### Database Configuration
This project uses an in-memory H2 database for development. Below are the key configurations used in the application.properties file and their purposes:

- <b>spring.datasource.url=jdbc:h2:mem:patients_data</b>
  Configures the application to use an in-memory H2 database named patients_data. The database is temporary and resets every time the application restarts. Ideal for testing or development.
- <b>spring.datasource.driverClassName=org.h2.Driver</b>
  Specifies the H2 database driver (org.h2.Driver) to establish a connection. Although Spring Boot can auto-detect it, it's explicitly defined for clarity and compatibility.
- <b>spring.datasource.username=r</b>
  Sets the database username as r for authentication.
- <b>spring.datasource.password=r</b>
  Configures the database password as r to secure the connection.
- <b>spring.jpa.database-platform=org.hibernate.dialect.H2Dialect</b>
  Tells Hibernate to generate SQL commands optimized for the H2 database. This ensures compatibility with the H2 database's SQL syntax and features.
- <b>spring.h2.console.enabled=true</b>
  Enables the H2 web console for debugging and database inspection. The console can be accessed at /h2-console when the application is running.
