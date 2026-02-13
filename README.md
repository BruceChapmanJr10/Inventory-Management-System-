# Inventory Management System (Spring Boot)

A full-stack Inventory Management web application built with Spring Boot and Java 17.  
The system allows users to manage products and associated parts, including both in-house and outsourced components, while enforcing business validation rules.

This project demonstrates backend architecture, object-oriented design, validation logic, and database integration using modern Spring technologies.

---

## 🛠 Tech Stack

- **Backend:** Spring Boot 2.6.6
- **Language:** Java 17
- **Database:** H2 In-Memory Database
- **Persistence:** Spring Data JPA (Hibernate)
- **Frontend:** Thymeleaf
- **Validation:** Custom Validators + JSR-380
- **Build Tool:** Maven
- **Architecture:** MVC (Controller → Service → Repository)

---

## 📋 Core Features

### 🔧 Part Management
- Add, update, delete parts
- Separate part types:
  - In-House Parts
  - Outsourced Parts
- Inventory tracking per part
- Business rule validation before deletion

### 📦 Product Management
- Add, update, delete products
- Associate multiple parts with a product
- Inventory validation to prevent invalid product configurations
- Custom product price validation logic

### 🛡 Business Rule Validation
Custom validation logic including:
- Inventory constraints
- Minimum/maximum inventory enforcement
- Product price validation
- Delete protection rules

### 🌱 Bootstrap Data
- Preloaded sample inventory data for testing

---

## 🏗 Architecture Overview

This application follows a clean layered architecture:

Controller Layer  
Handles HTTP requests and UI interactions.

Service Layer  
Contains business logic and validation coordination.

Repository Layer  
Spring Data JPA repositories for persistence.

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

```bash
git clone https://github.com/yourusername/d287-project.git
cd d287-project
