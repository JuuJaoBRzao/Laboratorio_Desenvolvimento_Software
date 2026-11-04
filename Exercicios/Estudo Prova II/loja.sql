CREATE DATABASE loja;

USE loja;

CREATE TABLE Categorias (
id_categoria INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL
);

CREATE TABLE Produtos (
id_produto INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
preco DECIMAL(10,2),
quantidade INT,
fk_id_categoria INT,
FOREIGN KEY (fk_id_categoria) REFERENCES Categorias(id_categoria)
);
 
INSERT INTO Categorias (nome)
VALUES
('Eletrônicos'),
('Alimentos'),
('Bebidas'),
('Acessórios');