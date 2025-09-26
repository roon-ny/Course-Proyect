# Workshop-1  
**Technical Report: TEND - Mental Health Assistant**

## Authors
- Ronaldo Andres Alvarado Doria — 20251020122  
- Juliana Valentina Reyes Moreno — 20251020109  
- David Esteban Ramirez Gordillo — 20242020110  

**Date:** September 26, 2025  
**Course:** Object-Oriented Programming — Universidad Distrital Francisco José de Caldas  

---

## Abstract
This document presents the design and conceptualization process of **TEND**, a mobile application for mental health monitoring. The project was developed following a structured methodology that includes requirements analysis, user stories, interface design, and object-oriented architecture.

---


# TEND The Mental Health Assistant – Project  
TEND emerges as a response to the need for digital tools to manage mental health, offering a safe space for tracking emotional states, daily habits, and personal reflections.
This project compiles the work carried out for the design of the *Mental Health Assistant* application, an app focused on supporting users in managing their emotional well-being and facilitating connections with certified professionals.  

The consolidated document presents, step by step, how the idea evolved — from identifying the problems to be solved to the object-oriented design proposal.  

## Folder Contents  
- **documentacion.pdf** → LaTeX document integrating the four main sections of the project.  
- **README.md** → This explanatory file, describing the purpose and structure of the document, as well as the process followed.  

## Development Process  

The project was developed in four main phases, each corresponding to a section:  

### 1. Requirements  
The project began with defining requirements, separated into two types:  

- **Functional Requirements (FRs):** specify what the app must do. Main features include:  
  - Secure sign-up and login.  
  - Emotional calendar with daily color tracking.  
  - Personal journal for reflections and gratitude notes.  
  - Personalized reminders and notifications.  
  - Graphical statistics and progress reports.  
  - Recommended actions based on user data.  
  - Communication with verified health centers, always under user consent.  

- **Non-Functional Requirements (NFRs):** ensure quality and reliability. Key aspects:  
  - **Security and privacy:** encryption, secure authentication, sensitive data control.  
  - **Usability:** intuitive, calming, and accessible interface.  
  - **Availability and reliability:** stable system, 24/7 uptime, data backup.  
  - **Cross-platform compatibility:** Android, iOS, and scalable to web.  
  - **Performance:** response times under 2 seconds for registrations and queries.  
  - **Ethics and trust:** no automated diagnoses; crisis-support mechanisms included.  

### 2. User Stories  
Based on the requirements, user stories were written to reflect real needs of:  
- **Patients:** seeking support, motivation, and clarity in their habits.  
- **Professionals:** needing access to prior summaries, saving time in first consultations, and reaching the right clients.  

Each story included acceptance criteria, ensuring that functionalities could be validated objectively.  

### 3. Mockups  
Visual prototypes were created to represent the user experience and showcase key screens, such as:  
- User registration.  
- Emotional calendar with color coding.  
- Mood and habit tracking.  
- Visualization of statistics and reports.  

These mockups helped validate the user flow and confirm alignment with identified needs.  

### 4. CRC Cards  
Finally, CRC Cards (Class–Responsibility–Collaboration) were prepared to define:  
- Main system classes (e.g., User, Journal, Statistics, Recommendations, HealthCenter).  
- Their specific responsibilities and collaborators.  

This step translated requirements into a preliminary object-oriented architecture, essential for future technical development.  
# System Architecture

The architecture of TEND was designed following solid software engineering principles and established design patterns. The system adopts a layered architecture that clearly separates responsibilities among presentation, business logic, and data persistence. This separation facilitates maintenance, scalability, and the future evolution of the application.

At the core of the system are eight main classes that encapsulate the essential functionality of the application:  

- **User**: Manages all information related to user profiles, including authentication and personal preferences.  
- **EmotionManager**: Handles the recording and tracking of emotional states, implementing logic for color coding and temporal analysis of emotional patterns.  
- **PersonalJournal**: Manages journal entries, ensuring the privacy and security of sensitive data through encryption and access control mechanisms.  
- **RecommendationEngine**: Encapsulates the intelligent recommendation system, analyzing the user’s historical data to generate personalized suggestions for activities and self-care practices.  
- **StatisticsManager**: Processes collected data to generate reports and visualizations that help users understand their temporal progress.  
- **ProfessionalCommunication**: Manages connections with mental health professionals, implementing protocols to ensure secure and ethical interactions.  

Several design patterns were applied to optimize the system’s structure:  

- **Model–View–Controller (MVC):** Organizes the separation between the user interface and business logic.  
- **Singleton:** Used for configuration classes requiring a single global instance.  
- **Observer:** Facilitates the implementation of the notification system, allowing different components to react to changes in the user’s state.  

The data flow in TEND follows a coherent model where information moves from user interfaces to processing modules, then to storage systems, and finally back to the presentation layer as insights and recommendations. This flow is designed to minimize latency in critical operations while maintaining data integrity and security at all times.
## Document Objective  
The purpose of this work is to consolidate in one file the key elements of the app’s design:  
- Provide a complete overview of the system, from problem definition to the proposed technical solution.  
- Serve as reference material for review, presentation, and future implementation.  
- Demonstrate a structured process of software analysis and design, following best engineering practices.
