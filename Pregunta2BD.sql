CREATE DATABASE Pregunta2EFDAW;
USE Pregunta2EFDAW;

CREATE TABLE estudiante (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    ciclo INT NOT NULL
);

CREATE TABLE profesor (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    departamento VARCHAR(255) NOT NULL
);

CREATE TABLE curso (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    vacantes INT NOT NULL,
    ciclo_requerido INT NOT NULL,
    profesor_id BIGINT,
    FOREIGN KEY (profesor_id) REFERENCES profesor(id)
);

CREATE TABLE matricula (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    estudiante_id BIGINT,
    curso_id BIGINT,
    matriculado_en TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (estudiante_id) REFERENCES estudiante(id),
    FOREIGN KEY (curso_id) REFERENCES curso(id)
);
