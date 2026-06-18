# 🗳️ Votezy - Online Voting System

![Java](https://img.shields.io/badge/Java-17-orange?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-Framework-brightgreen?logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?logo=mysql)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-yellow?logo=hibernate)
![Maven](https://img.shields.io/badge/Maven-Build-red?logo=apachemaven)
![REST API](https://img.shields.io/badge/API-RESTful-green)
![Status](https://img.shields.io/badge/Status-Active-success)

---

> 🚀 A secure and scalable **Online Voting System** built using **Spring Boot & MySQL**

---

## 📌 Overview

**Votezy** is a full-stack backend-driven Online Voting System that allows users to:

* Register as voters
* View candidates
* Cast votes securely
* View election results

It follows a **clean layered architecture**:

> Controller → Service → Repository → Database

---

## 🌟 Key Features

* 🗳️ One Person One Vote System
* 🔐 Secure Voting Logic
* 👤 Voter Management
* 🧑‍💼 Candidate Management
* 📊 Real-time Result Calculation
* ⚠️ Global Exception Handling
* 🔄 RESTful API Design
* 🌐 Basic Frontend Support

---

## 🛠️ Tech Stack

### Backend

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate

### Database

* MySQL

### Frontend

* HTML, CSS

### Tools

* Maven
* Postman
* IntelliJ / Eclipse

---

## 📂 Project Structure

```
Votezy/
│── controller/        # REST Controllers
│── service/           # Business Logic
│── repository/        # Database Layer
│── entity/            # JPA Entities
│── dto/               # Data Transfer Objects
│── exception/         # Exception Handling
│── resources/
│    ├── static/       # HTML Pages
│    └── application.properties
│── pom.xml
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/votezy.git
cd votezy
```

---

### 2️⃣ Setup Database

```sql
CREATE DATABASE votezy_db;
```

Import SQL file:

```bash
mysql -u root -p votezy_db < votezy.sql
```

---

### 3️⃣ Configure Application

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/votezy_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 4️⃣ Run Project

```bash
mvn spring-boot:run
```

Or run:

```
VotezyApplication.java
```

---

## 🔗 API Endpoints

### 👤 Voter APIs

* `POST /voters` → Register voter
* `GET /voters` → Get all voters

### 🧑‍💼 Candidate APIs

* `POST /candidates` → Add candidate
* `GET /candidates` → Get all candidates

### 🗳️ Voting API

* `POST /vote` → Cast vote

### 📊 Result API

* `GET /results` → View results

---

## 🔒 Business Rules

* ✔️ One voter can vote only once
* ✔️ Each vote is linked to a candidate
* ✔️ Duplicate voting is prevented
* ✔️ Results are dynamically calculated

---

## ⚠️ Exception Handling

Handled using:

* `ResourceNotFoundException`
* `DuplicateResourceException`
* `VoteNotAllowedException`
* `GlobalExceptionHandler`

---

## 📦 DTOs Used

* VoteRequestDTO
* VoteResponseDTO
* ElectionResultRequestDTO
* ElectionResultResponseDTO

---

## 📸 Frontend Pages

* 🏠 `index.html` → Home Page
* 🧑‍💼 `candidates.html` → Candidate List

---

## 🧠 Learning Outcomes

* Spring Boot Architecture
* REST API Development
* DTO Pattern
* Exception Handling
* JPA & Hibernate
* Real-world Backend System Design

---

## 🔮 Future Improvements

* 🔐 JWT Authentication
* 📊 Admin Dashboard
* ⚛️ React Frontend
* 📱 Mobile Responsive UI
* 🧾 Audit Logs

---

## 👨‍💻 Author

**Rayees Ali**
🎓 B.Tech CSE (2026 Graduate)
💻 Java Developer & Gen Ai 




