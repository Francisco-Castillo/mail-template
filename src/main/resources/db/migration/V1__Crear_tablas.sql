CREATE TABLE Templates(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    asunto VARCHAR(100) NOT NULL,
    cuerpo TEXT NOT NULL,
    tipo INT NOT NULL
);