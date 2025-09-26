# Workshop-1  
**Informe Técnico: TEND - Asistente de Salud Mental**

## Autores
- Ronaldo Andres Alvarado Doria — 20251020122  
- Juliana Valentina Reyes Moreno — 20251020109  
- David Esteban Ramirez Gordillo — 20242020110  

**Fecha:** 26 de septiembre de 2025  
**Curso:** Programación Orientada a Objetos — Universidad Distrital Francisco José de Caldas  

---

## Resumen
Este documento presenta el proceso de diseño y conceptualización de **TEND**, una aplicación móvil para el seguimiento de la salud mental. El proyecto se desarrolló siguiendo una metodología estructurada que incluye análisis de requerimientos, historias de usuario, diseño de interfaz y arquitectura orientada a objetos.

---

## Introducción al Proyecto
### Contexto y Justificación
TEND surge como respuesta a la necesidad de herramientas digitales para el manejo de la salud mental, ofreciendo un espacio seguro para el seguimiento de estados emocionales, hábitos diarios y reflexiones.

### Objetivos del Proyecto
- Diseñar una aplicación móvil intuitiva para el registro emocional.  
- Implementar un sistema de recomendaciones basado en patrones de comportamiento.  
- Facilitar la conexión con profesionales de salud mental certificados.  
- Garantizar la privacidad y seguridad de los datos sensibles.  

---

## Metodología de Desarrollo
El proyecto se organizó en cuatro fases principales:

### Fase 1: Análisis de Requerimientos
- **Funcionales:** 8 categorías, desde el registro de usuarios hasta la comunicación con profesionales.  
- **No Funcionales:** seguridad, usabilidad y rendimiento (ej. tiempo de respuesta menor a 2 segundos).  

### Fase 2: Historias de Usuario
Se desarrollaron 6 historias, incluyendo: registro seguro, recordatorios personalizados, diario personal, seguimiento de emociones, comunicación con profesionales y personalización de la experiencia. Cada historia tuvo criterios de aceptación verificables.  

### Fase 3: Diseño de Interfaz de Usuario
Se elaboraron mockups de:  
- Pantalla de autenticación (login/registro).  
- Interfaz principal con calendario y colores para estados emocionales.  
- Módulos de registro de emociones, sueño y alimentación.  
- Panel de análisis con tendencias y recomendaciones.  

### Fase 4: Diseño Orientado a Objetos
Con tarjetas CRC se definieron clases principales:  
- **Usuario:** gestión de autenticación y perfil.  
- **GestorEmociones:** registro de emociones.  
- **DiarioPersonal:** administración de entradas del diario.  
- **MotorRecomendaciones:** sugerencias personalizadas.  
- **GestorEstadísticas:** análisis y reportes.  
- **ComunicacionProfesionales:** conexión con especialistas.  

---

## Arquitectura del Sistema
- **Patrones aplicados:** MVC, Singleton, Observer.  
- **Flujo de datos:** arquitectura en capas (presentación, lógica de negocio, persistencia).  

---

## Resultados y Entregables
- Documento de requerimientos funcionales y no funcionales.  
- Historias de usuario con criterios de aceptación.  
- Prototipos de interfaz (mockups).  
- Tarjetas CRC.  
- Presentación final del proyecto.  

**Innovaciones del Proyecto:**  
- Sistema de codificación emocional por colores.  
- Motor de recomendaciones basado en comportamiento.  
- Manejo ético de datos sensibles.  
- Integración con profesionales certificados.  

---

## Conclusiones y Trabajo Futuro
### Logros Alcanzados
- Análisis exhaustivo de requerimientos.  
- Interfaz centrada en la usabilidad.  
- Arquitectura escalable y orientada a objetos.  
- Consideraciones éticas y de seguridad.  

### Próximos Pasos
1. Implementar backend y bases de datos.  
2. Desarrollar interfaces móviles nativas.  
3. Realizar pruebas de usabilidad.  
4. Integrar APIs de profesionales de salud.  
5. Gestionar certificaciones y cumplimiento normativo.  
