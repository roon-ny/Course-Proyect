# README – Workshop 3: Application of SOLID Principles

## Description
This workshop focused on **refactoring the previous project** by applying the **SOLID principles** to improve its structure, organization, and scalability.  
The goal was to create a cleaner, modular, and easier-to-maintain system while following good object-oriented programming practices.

---

## Workshop Objective
The main objective was to **integrate the SOLID principles** into the system design to:
- Separate responsibilities between classes.  
- Extend the system without modifying existing code.  
- Reduce unnecessary dependencies between modules.  
- Make the data and transaction flow clearer and more efficient.

---

## What Was Done
- The **functional and non-functional requirements** were reviewed and updated.  
- **UML diagrams** were improved by adding interfaces and abstract classes.  
- Large classes were divided into smaller, single-responsibility ones (e.g., `User`, `UserAuth`, `UserProfile`).  
- **Interfaces and abstract classes** such as `IAnalyzer`, `SuggestionStrategy`, `NotificationService`, and `Statistics` were created.  
- The **program flow** was reorganized so each module (records, analysis, suggestions, notifications) has its own specific task.

---

## Document Structure and Explanation

### 1. Introduction
Presents the purpose of Workshop 3: improving the project by applying SOLID.  
It briefly explains how the codebase was reorganized, UML diagrams updated, and how these changes improved maintainability and scalability.

---

### 2. Conceptual Design Updates
Describes the updates made to the **functional and non-functional requirements**:
- **Functional Requirements:** Explain the app’s main features—mood tracking, reminders, suggestions, and statistics—and how SOLID improved each one.  
- **Non-Functional Requirements:** Detail how the system became more maintainable, secure, and reliable after refactoring.

---

### 3. Enhanced UML Diagrams
Explains the new **interfaces, abstract classes, and inheritance structure** added to ensure SOLID compliance.  
It introduces key components like:
- `IAnalyzer` for analyzing habits.  
- `SuggestionStrategy` for dynamic recommendations.  
- `NotificationService` and `Statistics` as abstract bases for notifications and reports.  
This section also shows how these abstractions improved the **flow of transactions** within the system.

---

### 4. SOLID-Focused Implementation
Goes through each SOLID principle individually, explaining:
- What each principle means.  
- How it was implemented in the project.  
- The result or improvement it brought.  

Each principle includes examples of code changes and the reasoning behind them:
1. **Single Responsibility (SRP)** – Classes were split to focus on one task.  
2. **Open/Closed (OCP)** – System extended through new classes without modifying existing ones.  
3. **Liskov Substitution (LSP)** – Subclasses can replace their parents without breaking functionality.  
4. **Interface Segregation (ISP)** – Interfaces were specialized so classes only implement what they need.  
5. **Dependency Inversion (DIP)** – High-level modules depend on abstractions, not concrete implementations.

---

### 5. Summary of SOLID Principles in the Final Design
Provides a **table summarizing** how each SOLID principle was applied and which classes demonstrate it.  
This section gives a quick overview of the final architecture.

---

### 6. Work in Progress Code & Documentation
Shows **short code snippets** that represent how SOLID was applied.  
Each example explains:
- The class role.  
- Its position in the hierarchy.  
- The SOLID principle demonstrated.  

Examples include:
- `Registers` as a base class.  
- `Sleep` and `Journal` implementing `IAnalyzer`.  
- `DailyRecord` managing collections.  
- Integration showing how abstractions connect the modules.

---

### 7. Reflection
A short personal reflection describing the challenges and learning outcomes.  
It explains the difficulties of refactoring and deciding when to abstract or use interfaces, and how these changes made the code cleaner and more professional.

---

### 8. Sequence Diagram
Includes a **sequence diagram** showing how information flows through the system (recording emotions, food, and sleep).  
It visually represents the improved transaction process after applying SOLID.

---

## Results
- The final code became **modular, clear, and maintainable**.  
- New habits or features can be added without altering existing logic.  
- Each class has a well-defined purpose, reducing repetition and coupling.  
- The flow of data is organized and easy to follow.  
- The system is now **stable, extensible, and scalable**.

---

## Conclusion
The workshop successfully demonstrated how applying the SOLID principles improves the design and structure of an object-oriented system.  
The refactoring process made the application more flexible and understandable, strengthening both its architecture and maintainability.

---

## Authors
- **Ronaldo Andres Alvarado Doria** – 20251020122  
- **Juliana Valentina Reyes Moreno** – 20251020109
