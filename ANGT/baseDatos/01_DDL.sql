CREATE TABLE Departamento (
    cod_departamento SERIAL PRIMARY KEY,
    nombre VARCHAR(50) UNIQUE
);

CREATE TABLE Ciudad (
    nombre VARCHAR(100) PRIMARY KEY,
    poblacion INT,
    area FLOAT,
    departamento VARCHAR(50),
    FOREIGN KEY (departamento) REFERENCES Departamento(nombre)
);

