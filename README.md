# Spring_demo4

**Spring_demo4** is a Spring Boot project by **Siddharth Somal** (Meerut, UP, India).  
It demonstrates a clean architecture with REST APIs, entity relationships, database integration, and best practices.

## 🧱 Project Structure
```
Spring_demo4/
 ├── src/
 │    └── main/
 │         ├── java/com/pixel0/Ex8/
 │         │     ├── controller/
 │         │     ├── model/
 │         │     ├── service/
 │         │     └── repository/
 │         └── resources/
 │               ├── application.properties
 │               └── static/ (if any)
 ├── pom.xml
 ├── docs/ (documentation files – optional)
 └── README.md
```

## 🎯 Features
- REST controller endpoints for basic CRUD (e.g., `/api/order`).  
- JPA entity modelling showing a `Customer` ↔ `Order` relationship (Many‑to‑One / One‑to‑Many).  
- MySQL database integration with Spring Data JPA + Hibernate.  
- Configuration for environment variable support to hide sensitive credentials.  
- Ready for deployment with `spring.jpa.hibernate.ddl‑auto=update` (for development usage).  

## 🛠 Tech Stack
- Java, Spring Boot  
- Spring Web (REST APIs)  
- Spring Data JPA & Hibernate  
- MySQL (or compatible RDBMS)  
- Maven for build and dependency management  
- (Optional) docsify for project documentation  
- Git + GitHub for version control and collaboration  

## 🚀 Getting Started

### Prerequisites
- JDK 17 (or compatible version)  
- MySQL database (or any MySQL‑compatible server)  
- Maven 3.x  
- Git

### Setup & Run Locally
1. Clone the repository:
   ```bash
   git clone https://github.com/SiddharthSomal/Spring_demo4.git
   cd Spring_demo4
   ```
2. Create a `.env` file in the project root:
   ```bash
   DB_URL=jdbc:mysql://<host>:<port>/<database>?useSSL=false&allowPublicKeyRetrieval=true
   DB_USERNAME=<your‑db‑user>
   DB_PASSWORD=<your‑db‑password>
   ```
3. Configure `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=${DB_URL}
   spring.datasource.username=${DB_USERNAME}
   spring.datasource.password=${DB_PASSWORD}

   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
   ```
4. Build and run the project:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
5. Access the API at: `http://localhost:8080/api/order`

## 📦 API Endpoints

### `GET /api/order`
Returns a list of all orders

Sample response:
```json
[
  {
    "id": 1,
    "orderName": "Mobile Purchase",
    "customer": {
      "id": 3,
      "name": "Siddharth",
      "email": "sid@example.com"
    }
  }
]
```

### `POST /api/order`
Creates a new order  

Sample request:
```json
{
  "orderName": "Laptop Order",
  "customer": {
    "id": 3
  }
}
```

## 📌 Entity Overview
### Customer
- `id`  
- `name`  
- `email`  
- One-to-Many: A customer may have multiple orders  

### Order
- `id`  
- `orderName`  
- Many-to-One: An order belongs to one customer  

## 🧩 Security Best Practices
- Use environment variables for DB credentials  
- Avoid reserved SQL keywords as table names  
- Use DTOs for production APIs  

## 🚧 Future Enhancements
- Add CRUD for customers  
- Add products & order items  
- Add Swagger  
- Add unit tests  
- Deploy to cloud  

## 🔗 Author
**Siddharth Somal**  
GitHub: https://github.com/SiddharthSomal

