# 💸 Finance App

A full-stack personal finance tracker built to master the **Spring Boot + React** ecosystem. This application allows users to manage their cash flow, track expenses, and visualize their financial habits through a modern web interface.

---

## 🛠 Tech Stack & Learning Goals

This project is a dedicated sandbox for practicing enterprise-level development patterns:

### **Backend (Spring Boot)**
* **Spring Data JPA:** Mastering entity relationships ($OneToMany$ for Users to Transactions).
* **Spring Security:** Implementing JWT-based authentication for stateless sessions.
* **Validation:** Using Hibernate Validator to ensure data integrity.
* **REST API Design:** Building clean, controller-based endpoints.

### **Frontend (React JS)**
* **State Management:** Using the `Context API` or `Redux Toolkit`.
* **Data Visualization:** Transforming JSON data into interactive charts using `Recharts`.
* **Axios:** Managing interceptors for attaching JWT tokens to outgoing requests.

---

## 🚀 Key Features

* **User Accounts:** Secure sign-up/login functionality.
* **Transaction Ledger:** Log income and expenses with date, category, and description.
* **Dashboard Analytics:** A visual breakdown of spending by category.
* **Budget Tracking:** Set monthly targets and track progress in real-time.

---

## 📐 System Architecture

The application uses a decoupled architecture, allowing the frontend and backend to communicate over HTTP:



---

## 📂 Project Structure

```text
finance-app/
├── finance-backend/   # Spring Boot Application
│   ├── src/main/java  # Controllers, Security, and Models
│   └── pom.xml        # Dependency management
└── finance-frontend/  # React Application
    ├── src/components # UI Components
    ├── src/services   # API Call Logic
    └── package.json   # Frontend scripts

```
---

## 🚦 Getting Started

### 1. Backend Setup

1. Navigate to `/finance-backend`.
2. Configure your database in `src/main/resources/application.properties`.
3. Run the application:
```bash
./mvnw spring-boot:run

```



### 2. Frontend Setup

1. Navigate to `/finance-frontend`.
2. Install dependencies:
```bash
npm install

```


3. Start the development server:
```bash
npm start

```
