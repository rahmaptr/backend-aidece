# backend-aidece

Backend application for AIDece technical test, built with Spring Boot and PostgreSQL.

## Technologies

- **Java 21**
- **Spring Boot 3.2.0**
- **PostgreSQL** - Production database
- **H2** - In-memory database for testing
- **Maven** - Build and dependency management

## Dependencies

- **Spring Boot Web** - For building REST APIs
- **Spring Boot Data JPA** - For database operations and ORM
- **PostgreSQL Driver** - For PostgreSQL database connectivity
- **Spring Boot Test** - For testing support
- **H2 Database** - For in-memory testing

## Project Structure

```
backend-aidece/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/aidece/backend/
│   │   │       ├── BackendAideceApplication.java  # Main application class
│   │   │       └── controller/
│   │   │           └── HealthController.java      # Sample REST controller
│   │   └── resources/
│   │       └── application.properties             # Application configuration
│   └── test/
│       ├── java/
│       │   └── com/aidece/backend/
│       │       ├── BackendAideceApplicationTests.java
│       │       └── controller/
│       │           └── HealthControllerTest.java  # Controller tests
│       └── resources/
│           └── application.properties             # Test configuration (H2)
└── pom.xml                                        # Maven configuration

```

## Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6 or higher
- PostgreSQL 12 or higher (for production)

### Configuration

The application is configured to connect to PostgreSQL by default. Update the following properties in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/aidece_db
spring.datasource.username=postgres
spring.datasource.password=postgres
```

### Building the Application

```bash
# Clean and compile
mvn clean compile

# Run tests
mvn test

# Package as JAR
mvn clean package
```

### Running the Application

```bash
# Run with Maven
mvn spring-boot:run

# Or run the JAR file
java -jar target/backend-aidece-0.0.1-SNAPSHOT.jar
```

The application will start on `http://localhost:8080`

### Testing the API

Once the application is running, you can test the health endpoint:

```bash
curl http://localhost:8080/api/health
```

Expected response: `OK`

## Development

### Running Tests

The project uses H2 in-memory database for testing, so you don't need PostgreSQL running to execute tests:

```bash
mvn test
```

### Database Setup

For production, create a PostgreSQL database:

```sql
CREATE DATABASE aidece_db;
```

The application will automatically create tables on startup using Hibernate's `ddl-auto=update` setting.

## API Endpoints

| Method | Endpoint        | Description        |
|--------|----------------|--------------------|
| GET    | /api/health    | Health check       |

## License

This project is for technical test purposes.

