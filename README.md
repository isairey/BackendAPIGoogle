<div align="center">

<img width="220" src="https://cdn-icons-png.flaticon.com/512/300/300221.png" />

# 🔐 Google Login Backend

### API de Autenticación con Google OAuth2, JWT y Spring Boot 🚀

<p align="center">
  <b>Google Login Backend</b> es una API REST desarrollada con Spring Boot que permite autenticar usuarios mediante Google OAuth2, almacenar información en MySQL y generar tokens JWT para proteger aplicaciones web y móviles.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/SpringBoot-Backend-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
  <img src="https://img.shields.io/badge/Google-OAuth2-4285F4?style=for-the-badge&logo=google&logoColor=white">
  <img src="https://img.shields.io/badge/JWT-Authentication-black?style=for-the-badge">
  <img src="https://img.shields.io/badge/MySQL-Database-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
</p>

<p align="center">
  <a href="#-acerca-del-proyecto">Acerca</a> •
  <a href="#-módulos-del-sistema">Módulos</a> •
  <a href="#-tecnologías-utilizadas">Tecnologías</a> •
  <a href="#-instalación">Instalación</a> •
  <a href="#-api-rest">API</a>
</p>

</div>

---

# 🌌 Acerca del proyecto

**Google Login Backend** es una solución de autenticación moderna que permite iniciar sesión utilizando cuentas de Google.

La API valida los tokens generados por Google OAuth2, registra automáticamente usuarios nuevos en la base de datos y genera tokens JWT para controlar el acceso a recursos protegidos.

El sistema permite:

* 🔐 Login con Google
* 👤 Registro automático de usuarios
* 🎟️ Generación de JWT
* 🗄️ Persistencia en MySQL
* 🛡️ Seguridad mediante Spring Security
* 🌐 Integración con aplicaciones React, Angular, Vue o móviles

---

# ✨ Características

## 🔐 Autenticación Google

* Login con Google OAuth2
* Verificación de credenciales
* Validación de identidad
* Integración sencilla con frontend

---

## 👤 Gestión de usuarios

* Registro automático
* Actualización de datos
* Consulta de perfiles
* Gestión de sesiones

---

## 🎟️ Seguridad JWT

* Generación de tokens
* Autenticación segura
* Protección de endpoints
* Control de acceso

---

## 🌐 Integración multiplataforma

* React
* Angular
* Vue
* Flutter
* Android
* iOS

---

# 👨‍💼 Módulos del sistema

## 🔐 Authentication Module

Encargado del proceso de autenticación.

### Funcionalidades

* Login con Google
* Verificación de credenciales
* Generación de JWT
* Control de sesiones

---

## 👤 User Module

Administración de usuarios registrados.

### Funcionalidades

* Crear usuario
* Buscar usuario
* Actualizar perfil
* Consultar información

---

## 🎟️ JWT Module

Sistema de generación y validación de tokens.

### Funcionalidades

* Crear JWT
* Validar JWT
* Controlar expiración
* Seguridad de acceso

---

## 🛡️ Security Module

Módulo de protección del sistema.

### Funcionalidades

* Spring Security
* Rutas protegidas
* Autorización
* Seguridad de API

---

# 🛠️ Tecnologías utilizadas

## ☕ Backend

<p>
  <img src="https://skillicons.dev/icons?i=java,spring,maven" />
</p>

* Java 21
* Spring Boot
* Spring Security
* Spring Data JPA
* Maven

---

## 🗄️ Base de datos

<p>
  <img src="https://skillicons.dev/icons?i=mysql" />
</p>

* MySQL
* Hibernate
* JPA
* SQL

---

## 🔐 Seguridad

<p>
  <img src="https://skillicons.dev/icons?i=postman" />
</p>

* JWT
* OAuth2
* Google Authentication
* Spring Security

---

## 🧰 Herramientas

<p>
  <img src="https://skillicons.dev/icons?i=git,github,vscode" />
</p>

* Git
* GitHub
* VS Code
* Postman

---

# 📂 Estructura del proyecto

```bash
GoogleLoginBackend/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controller/
│   │   │   ├── service/
│   │   │   ├── repository/
│   │   │   ├── entity/
│   │   │   ├── security/
│   │   │   ├── dto/
│   │   │   └── config/
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │
├── pom.xml
├── mvnw
├── README.md
└── .gitignore
```

---

# 🗄️ Modelo de Base de Datos

## 👤 Usuario

### Campos

```sql
id
nombre
email
foto
proveedor
fecha_registro
```

---

# ⚡ Instalación

## 📋 Requisitos

* Java 21
* Maven
* MySQL
* Google Cloud Console
* VS Code o IntelliJ IDEA

---

# 🚀 Configuración del proyecto

## 1️⃣ Clonar repositorio

```bash
git clone https://github.com/isairey/GoogleLoginBackend.git
```

---

## 2️⃣ Entrar al proyecto

```bash
cd GoogleLoginBackend
```

---

## 3️⃣ Crear base de datos

```sql
CREATE DATABASE google_login_db;
```

---

## 4️⃣ Configurar application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/google_login_db
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

jwt.secret=MiSuperSecretJWT2026
jwt.expiration=86400000

google.client-id=TU_CLIENT_ID_DE_GOOGLE
```

---

## 5️⃣ Ejecutar aplicación

```bash
mvn spring-boot:run
```

---

# 📡 API REST

## 🔐 Login con Google

### Endpoint

```http
POST /api/auth/google
```

### Request

```json
{
  "credential": "GOOGLE_ID_TOKEN"
}
```

---

### Response

```json
{
  "token": "eyJhbGciOiJIUzI1NiJ9...",
  "nombre": "Isai Reyes",
  "email": "usuario@gmail.com",
  "foto": "https://lh3.googleusercontent.com/..."
}
```

---

## 👤 Usuarios

### Obtener usuario

```http
GET /api/users/{id}
```

### Obtener todos los usuarios

```http
GET /api/users
```

### Actualizar usuario

```http
PUT /api/users/{id}
```

### Eliminar usuario

```http
DELETE /api/users/{id}
```

---

# 🔄 Flujo de autenticación

## 1️⃣ Frontend

El usuario selecciona "Iniciar sesión con Google".

---

## 2️⃣ Google OAuth

Google genera un ID Token válido.

---

## 3️⃣ Backend

La API recibe el token y verifica su autenticidad.

---

## 4️⃣ Base de datos

Si el usuario no existe:

* Se registra automáticamente.

Si existe:

* Se recupera la información.

---

## 5️⃣ JWT

El sistema genera un JWT propio para futuras solicitudes.

---

## 6️⃣ Acceso autorizado

El frontend almacena el token y accede a rutas protegidas.

---

# 📊 Funcionalidades principales

## 🔐 Autenticación moderna

* Google OAuth2
* JWT
* Seguridad avanzada

---

## 👤 Gestión de usuarios

* Registro automático
* Persistencia de datos
* Gestión de perfiles

---

## 🌐 Integración completa

* Aplicaciones Web
* Aplicaciones móviles
* APIs REST

---

# 🧠 Objetivos del proyecto

## 🎯 Aprendizaje y desarrollo

* Spring Boot
* OAuth2
* JWT Authentication
* APIs REST
* Seguridad Web
* Integración Frontend/Backend
* Arquitecturas modernas

---

# 🚧 Roadmap

## 🔮 Próximas mejoras

* 🔑 Login con Facebook
* 🍎 Login con Apple
* 📱 Login con Microsoft
* 📧 Verificación por correo
* 🔄 Refresh Tokens
* 🛡️ Roles y permisos
* ☁️ Despliegue en AWS

---

# 🤝 Contribuciones

Las contribuciones son bienvenidas ❤️

## Cómo contribuir

1. Fork del proyecto

```bash
git checkout -b feature/nueva-funcionalidad
```

2. Commit

```bash
git commit -m "✨ Nueva funcionalidad"
```

3. Push

```bash
git push origin feature/nueva-funcionalidad
```

4. Crear Pull Request 🚀

---

# 👨‍💻 Desarrollador

<div align="center">

## Isai Reyes — Backend Developer

Desarrollador especializado en Spring Boot, seguridad web, autenticación OAuth2 y arquitecturas backend modernas 🚀

</div>

---

# 🌟 Apoya el proyecto

⭐ Dale una estrella

🍴 Haz Fork

📢 Comparte el proyecto

🔐 Contribuye al desarrollo de soluciones seguras de autenticación

---

# 📜 Licencia

Proyecto Open Source orientado al aprendizaje y desarrollo de sistemas de autenticación modernos utilizando Google OAuth2, JWT y Spring Boot.

---

<div align="center">

### 🔐 Google Login Backend — Autenticación segura, moderna y escalable con Spring Boot 🚀

</div>
