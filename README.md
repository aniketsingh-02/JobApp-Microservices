# JobApp Microservices

A distributed Job Application platform built with **Java Spring Boot 3** and **Microservices Architecture**.

## 🚀 Tech Stack
* **Java 17** & **Spring Boot 3**
* **Microservices:** Job Service, Company Service, Review Service
* **Database:** PostgreSQL (Dockerized)
* **Containerization:** Docker & Docker Compose
* **Tools:** Maven, Postman, Git

## 📂 Architecture
The application is split into distinct microservices:
1.  **Job Service:** Manages job postings.
2.  **Company Service:** Manages company profiles.
3.  **Review Service:** Handles user reviews for companies.

## 🛠️ How to Run
1.  Ensure Docker is running.
2.  Run `docker-compose up` to start PostgreSQL and pgAdmin.
3.  Start each microservice application individually via IntelliJ/Maven.