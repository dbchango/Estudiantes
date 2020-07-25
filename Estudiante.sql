CREATE DATABASE Trabajo
USE Trabajo
SHOW DATABASES

CREATE TABLE Estudiante(
 codigo INT PRIMARY KEY NOT NULL,
 nombre VARCHAR(20),
 edad INT,
 direccion VARCHAR(20)

)

DROP Table Estudiante