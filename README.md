# Employee Payroll App

## Overview

This project is a **Spring Boot REST API application** developed as part of backend learning.
It provides basic REST endpoints to simulate operations in an Employee Payroll system.

The application demonstrates how to:

* Set up a Spring Boot project
* Create REST APIs using Spring Web
* Handle HTTP methods (GET, POST, PUT, DELETE)
* Follow GitFlow for version control

---

## Technologies Used

* Java 17
* Spring Boot
* Spring Web
* Maven
* Git & GitFlow

---

## Project Structure

EmployeePayrollApp
│
├── src/main/java/com/bridgelabz/EmployeePayroll_App
│   ├── EmployeePayrollAppApplication.java
│   └── controller
│       └── EmployeePayrollController.java
│
├── src/main/resources
│   └── application.properties
│
└── pom.xml

---

## Features Implemented

UC1 – Setup

Created Spring Boot project

Added required dependencies

---

UC2 – REST APIs

Implemented basic CRUD operations using REST

Handled HTTP methods (GET, POST, PUT, DELETE)

---

UC3 – Introduce DTO and Model

Created Employee Model class to represent data

Introduced DTO for request and response handling

Separated internal data structure from API layer

---

UC4 – Introduce Service Layer

Added Service Layer to handle business logic

Moved logic from Controller to Service

Followed layered architecture (Controller → Service)

---

UC5 – In-Memory Data Storage

Stored employee data using List

Implemented add, view, update, and delete operations

Simulated database functionality without actual DB

---
