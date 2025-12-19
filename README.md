
Electricity Billing System
A robust desktop-based management application designed to automate electricity billing, user management, and secure payment processing. This project bridges legacy Java GUI components with a modern RESTful backend.

📋 Features
User Management: Efficiently handles over 1,000 user accounts and billing profiles.

Intuitive GUI: Built with Java AWT and Swing for a responsive desktop experience.

Secure Authentication: RESTful APIs powered by Spring Boot for secure login and session management.

Payment Integration: Integrated payment gateway functionality to facilitate online bill settlements.

Data Persistence: Robust MySQL backend utilizing JDBC for optimized data retrieval and storage.

🛠️ Tech Stack
Frontend: Java Swing, AWT (Desktop GUI)

Backend: Spring Boot (REST APIs), Java Database Connectivity (JDBC)

Database: MySQL

Tools: Maven/Gradle, Postman (API Testing)

🏗️ Architecture
The system follows the MVC (Model-View-Controller) design pattern to ensure a clean separation of concerns:

View (AWT/Swing): The user interface where customers view bills and admins manage data.

Controller (Spring Boot): Handles the business logic, API routing, and authentication.

Model (JDBC/MySQL): Manages data structures and database interactions.



🚀 Getting Started
Prerequisites
JDK 17 or higher

MySQL Server

An IDE (IntelliJ IDEA, Eclipse, or VS Code)

Database Setup
Create a database named electricity_db.

Execute the provided SQL scripts in /database/schema.sql to create the necessary tables.

Installation
Clone the repository:

Bash

git clone [https://github.com/your-username/electricity-billing-system.git](https://vk2sh.github.io/booking-system/)
Configure Backend: Update src/main/resources/application.properties with your MySQL credentials:

Properties

spring.datasource.url=jdbc:mysql://localhost:3306/electricity_db
spring.datasource.username=your_username
spring.datasource.password=your_password
Run the Application:

Start the Spring Boot backend service.

Run the Main.java file in the GUI package to launch the desktop interface.

📊 Database Schema
The system manages complex relationships between users, meter readings, and transaction history.

💡 Key Accomplishments
Successfully implemented a hybrid architecture connecting a Java desktop client to a Spring Boot REST API.

Optimized SQL queries via JDBC to maintain high performance while managing 1,000+ active records.

Streamlined the billing cycle from meter reading entry to digital receipt generation.

Would you like me to add a specific section for "API Endpoints" listing the routes you created for the payment gateway?
