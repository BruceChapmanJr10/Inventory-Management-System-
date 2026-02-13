# Inventory Management Web Application

A full-stack Spring Boot web application built with Java 17 that manages inventory data using a layered MVC architecture. The application demonstrates backend development, database integration, server-side rendering, and form validation using modern Spring technologies.

---

## 🛠 Tech Stack

- **Backend:** Spring Boot 2.6.6
- **Language:** Java 17
- **Database:** H2 In-Memory Database
- **Persistence:** Spring Data JPA (Hibernate)
- **Frontend:** Thymeleaf (Server-Side Rendering)
- **Validation:** Spring Boot Validation (JSR-380)
- **Build Tool:** Maven
- **Testing:** JUnit

---

## 📋 Features

- CRUD operations for inventory entities
- Server-side rendered dynamic web pages using Thymeleaf
- Form validation with error handling
- JPA entity relationships
- In-memory H2 database for rapid development
- Layered architecture (Controller → Service → Repository)
- Clean separation of concerns following MVC principles

---

## 🏗 Architecture Overview

This project follows standard Spring Boot MVC architecture:

Controller  
→ Handles HTTP requests and user interaction  

Service  
→ Contains business logic  

Repository  
→ Interfaces with the database using Spring Data JPA  

Entity  
→ Represents persistent domain models  

---

## ▶️ How to Run Locally

### 1. Clone the repository

```bash
git clone https://github.com/yourusername/d287-project.git
cd d287-project
