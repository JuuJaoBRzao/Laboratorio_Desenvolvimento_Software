CREATE DATABASE clienteservidor;

USE clienteservidor;

CREATE TABLE pessoa (
id INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
sexo VARCHAR(1),
idioma VARCHAR(50)
);
