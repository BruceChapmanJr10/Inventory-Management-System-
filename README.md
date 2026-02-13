# Inventory Management System (Spring Boot)

A full-stack Inventory Management web application built with Spring Boot and Java 17.  
The system allows users to manage products and associated parts, including both in-house and outsourced components, while enforcing business validation rules.

This project demonstrates backend architecture, object-oriented design, validation logic, and database integration using modern Spring technologies.

---

## 🛠 Tech Stack

- Backend: Spring Boot 2.6.6  
- Language: Java 17  
- Database: H2 In-Memory Database  
- Persistence: Spring Data JPA (Hibernate)  
- Frontend: Thymeleaf  
- Validation: Custom Validators + JSR-380  
- Build Tool: Maven  
- Architecture: MVC (Controller → Service → Repository)

---

## 📋 Core Features

### 🔧 Part Management
- Add, update, and delete parts
- Separate part types:
  - In-House Parts
  - Outsourced Parts
- Inventory tracking per part
- Business rule validation before deletion

### 📦 Product Management
- Add, update, and delete products
- Associate multiple parts with a product
- Inventory validation to prevent invalid product configurations
- Custom product price validation logic

### 🛡 Business Rule Validation
Includes custom validation logic for:
- Inventory constraints
- Minimum and maximum inventory enforcement
- Product price validation
- Delete protection rules

### 🌱 Bootstrap Data
- Preloaded sample inventory data for testing and demonstration

---

## 🏗 Architecture Overview

This application follows a clean layered architecture:

Controller Layer  
Handles HTTP requests and user interaction.

Service Layer  
Contains business logic and validation coordination.

Repository Layer  
Uses Spring Data JPA for database operations.

Domain Layer  
Entity classes:
- Part (base class)
- InhousePart
- OutsourcedPart
- Product

Validator Layer  
Custom business rule validation classes.

---

## ▶️ Running the Application

### 1. Clone the repository

git clone https://github.com/yourusername/d287-project.git  
cd d287-project  

### 2. Build the project

mvn clean install  

### 3. Run the application

mvn spring-boot:run  

### 4. Open in browser

http://localhost:8080  

### H2 Console (Optional)

http://localhost:8080/h2-console  

---

## 📂 Project Structure

com.example.demo  
├── bootstrap  
├── controllers  
├── domain  
├── repositories  
├── service  
├── validators  
└── DemoApplication  

---

## 🎯 What This Project Demonstrates

- Spring Boot MVC architecture  
- Object-oriented design with inheritance (Part → InhousePart / OutsourcedPart)  
- Custom validation logic and business rule enforcement  
- Service layer abstraction  
- JPA entity relationships  
- Database integration using Hibernate  
- Clean separation of concerns  

---

## 👨‍💻 Author

Bruce Chapman  
B.S. Software Engineering  
Java • Spring Boot • Backend Development
