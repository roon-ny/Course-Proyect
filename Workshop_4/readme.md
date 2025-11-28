

```md
# Habit Tracking App – Layered Architecture (Workshop 4)

Este proyecto implementa una aplicación de registro de hábitos usando una arquitectura por capas y una interfaz gráfica JavaFX. El diseño sigue principios SOLID y separa claramente presentación, lógica de negocio y persistencia.

---

## 1. Estructura del Proyecto

```

src/
├─ presentation/
│   └─ MenuLogin.java
│
├─ business/
│   ├─ DailyRegister.java
│   ├─ EmotionRecord.java
│   ├─ FoodRegister.java
│   ├─ SleepRegister.java
│   ├─ User.java
│   └─ Register.java
│
├─ persistence/
│   ├─ AuthLogin.java
│   └─ SystemRegister.java
│
└─ App.java

```

---

## 2. Descripción de Capas

### Presentación (JavaFX)
Incluye `MenuLogin`, el prototipo inicial de la interfaz. Permite registrar usuario, iniciar sesión y cerrar sesión. Faltan vistas FXML y pantallas adicionales.

### Lógica de Negocio
Clases que representan registros diarios, sueño, alimentación, emociones y datos del usuario. La clase `Register` funciona como base abstracta.

### Persistencia
Manejo de almacenamiento con archivos `.txt`.  
`AuthLogin` evita duplicados y valida usuarios.  
`SystemRegister` registra y verifica usuarios.

---

## 3. Requisitos

- Java 17 o superior  
- JavaFX SDK  
- IDE compatible (IntelliJ, Eclipse, VS Code)

---

## 4. Configurar JavaFX

Agregar los módulos necesarios al ejecutar:

```

--module-path "ruta/javafx/lib" --add-modules javafx.controls,javafx.fxml

```

---

## 5. Compilación y Ejecución

### Compilar

```

javac --module-path "ruta/javafx/lib" --add-modules javafx.controls,javafx.fxml -d out src/**/*.java

```

### Ejecutar

```

java --module-path "ruta/javafx/lib" --add-modules javafx.controls,javafx.fxml -cp out App

```

---

## 6. Estado Actual del Proyecto

- Las capas funcionan de forma integrada.  
- El prototipo GUI ya interactúa con la lógica y la persistencia.  
- Faltan las vistas completas y la expansión de la interfaz.

---

## 7. Reflexión

La estructura por capas facilitó la integración del prototipo gráfico con el resto del sistema. El trabajo previo en diseño y separación de responsabilidades permitió avanzar sin complicaciones al conectar GUI, lógica y persistencia.

---
```

---

Si quieres, puedo generarte también la versión con badges, licencia, autores o diagrama de arquitectura.

