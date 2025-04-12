OBJ2100

Gruppe 21

Adrian Lafjell Ed, Esteban Javier Villacorta Sanchez, Jonas Ambaya,

📖 Prosjektbeskrivelse
En enkel mailserver bygget med Spring Boot, Spring Data JPA og PostgreSQL. Applikasjonen tilbyr REST API-endepunkter for å administrere brukere og sende e-postmeldinger.

📦 Teknologi
Java 20+

Spring Boot

Spring Web

Spring Data JPA (Java Persistence API)

PostgreSQL

Maven

Lombok

Swagger (for API-dokumentasjon)

📋 Oppgaveoversikt
📁 Prosjektoppsett
Opprettet med Spring Initializr

Inkluderte funkjsoner:

Spring Web

Spring Data JPA 

PostgreSQL Driver

Lombok

🗄️ Databaseoppsett
Installer PostgreSQL

https://www.postgresql.org/

Opprett en database: mail_server_db

Konfigurer src/main/resources/application.properties:

properties

spring.datasource.url=jdbc:postgresql://localhost:5432/mail_server_db
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


📝 Modeller
User

id

username

email

password

Email

id

fromEmail

toEmail

subject

body

timestamp

→ Bruker JPA-anmerkninger

▶️ Kom i gang
Åpne prosjektet i IntelliJ IDEA

Sørg for at Lombok-plugin er installert (den er vanligvis aktivert automatisk)

Kjør Application.java direkte via Run-knappen i IDE-en

Applikasjonen starter, og API-et er klart på http://localhost:8080


📑 API-dokumentasjon
Genereres automatisk med Swagger

Tilgjengelig på http://localhost:8080/swagger-ui/ når applikasjonen kjører



English version

OBJ2100

Group 21

Adrian Lafjell Ed, Esteban Javier Villacorta Sanchez, Jonas Ambaya,

📖 Project description
An easy mailserver built with Spring Boot, Spring Data JPA and PostgreSQL. The application offers REST API-endmpoints to administrate users and send e-mail messages.

📦 Technology
Java 20+

Spring Boot

Spring Web

Spring Data JPA(Java Persistence API)

PostgreSQL

Maven

Lombok

Swagger (for API-dokumentation)

📋 projecttitle
📁 project settup
Established with Spring Initializr

Included functions:

Spring Web

Spring Data JPA 

PostgreSQL Driver

Lombok

🗄️ Database setup
Install PostgreSQL

https://www.postgresql.org/

Create the database: mail_server_db

Configure src/main/resources/application.properties:

properties

spring.datasource.url=jdbc:postgresql://localhost:5432/mail_server_db
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


📝 Models

User

id

username

email

password

Email

id

fromEmail

toEmail

subject

body

timestamp

→ Using JPA-annotations

▶️ Get Started
Open the project in IntelliJ IDEA

Be sure that Lombok-plugin is installed (it is usually installed automatically)

Run Application.java directly via the Run-button in the IDE

The application starts, and the API is ready on http://localhost:8080


📑 API-dokumentation
Generates automatically with Swagger

Avaliable on http://localhost:8080/swagger-ui/ when the application is running
