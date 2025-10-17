# TEND – Mental Health Application

**Object-Oriented Programming – Workshop 2**
**Semester 2025-III**

## Authors

* **Ronaldo Andres Alvarado Doria** – 20251020122
* **Juliana Valentina Reyes Moreno** – 20251020109
* **David Esteban Ramirez Gordillo** – 20242024110
  **Date:** October 17, 2025

---

## Project Overview

**TEND** is a mental health and emotional well-being application.
Its purpose is to provide an accessible, empathetic, and reliable digital tool that allows users to record their emotions, habits, and daily reflections, visualize their progress through graphs, and receive personalized recommendations to improve their well-being.

The project promotes **emotional self-management** and encourages healthy habits through a simple, secure, and motivating interface.

---

## Main Objectives

* Promote **emotional self-awareness** through daily mood and thought tracking.
* Encourage **healthy habits** related to rest, nutrition, and relaxation.
* Design a **clear and motivating interface** that promotes consistent use.
* Provide **visual feedback** on the user’s emotional evolution over time.

---

## Development of Activities

### Conceptual Design

Functional and non-functional requirements were reviewed and refined according to project scope and available resources.
User stories were corrected and structured properly.
Mockups were updated based on class feedback, improving color palette, layout, and user interaction.
The logo was replaced with a **mascot** to make the interface more friendly and approachable.

**Main functional requirements:**

* User registration and login.
* Emotion, habit, and personal journal recording.
* Reminders and notifications.
* Visual statistics and wellness suggestions.

**Non-functional requirements:**

* Basic security through password protection.
* Simple and intuitive interface.
* Modular and maintainable code.
* Ethical restrictions (no clinical or psychological advice).

---

### Technical Design (UML)

CRC cards, class diagrams, and a sequence diagram were developed to model the main interactions of the system.
The design applies the **Object-Oriented Programming (OOP) principles**:

* **Encapsulation:** Private attributes accessed through getters and setters.
* **Abstraction:** Classes like *Analizer* and *Statistics* simplify complex operations through clear methods.
* **Inheritance:** *Emotions*, *Sleep*, *Food*, and *Journal* inherit from *Registers*, sharing methods such as `edit()`, `cancel()`, and `addRegister()`.
* **Polymorphism:** Subclasses override methods like `evaluateEmotion()` or `evaluateSleep()` to adapt them to their own behavior.

---

### Implementation Plan for OOP Concepts

A plan was defined to apply OOP principles during coding:

* Create separated controllers, models, and views for each module.
* Maintain a modular and scalable directory structure.
* Protect data with getters and setters, and use method overriding for specific evaluations.

**Preliminary directory structure:**

```
mental-health-app/
│
├── controller/
├── model/
├── view/
└── Main.java
```

---

## Reflections

This workshop strengthened the team’s understanding of **object-oriented concepts** and their practical use in class design and UML modeling.
The process helped identify which system elements were essential and how to represent relationships between objects clearly.
Although designing diagrams and visuals was challenging, it clarified how the logic of the system will work before coding.
Additionally, the visual identity of the project was renewed with a **new mascot and color palette**, making the interface more appealing and user-friendly.


Would you like me to adapt this README slightly to follow the **typical GitHub formatting style** (e.g., badges, short description, setup instructions section)?
