# 📝 To-Do List Application

A simple To-Do List web application built using **Spring Boot**, **Spring MVC**, and **Thymeleaf**.  
This app allows users to create, view, toggle, and delete tasks.

---

## 🚀 Features

- Add new tasks
- View all tasks
- Mark tasks as completed / not completed
- Delete tasks
- Clean MVC architecture (Controller → Service → Repository)

---

## 🛠️ Tech Stack

- Java
- Spring Boot
- Spring MVC
- Thymeleaf
- Spring Data JPA
- Hibernate
- MySQL / H2 (depending on configuration)
- Maven

---

## 📂 Project Structure

com.Sanekth.todo
│
├── Controller
│ └── TaskController.java
│
├── Service
│ └── TaskService.java
│
├── Repository
│ └── TaskRepository.java
│
├── model
│ └── Task.java
│
├── resources
│ ├── templates
│ │ └── tasks.html
│ └── application.properties
│
└── TodoApplication.java
