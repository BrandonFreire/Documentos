CREATE TABLE Raza(
    IDRaza          INTEGER  PRIMARY KEY AUTOINCREMENT 
    ,Descripcion     TEXT NOT NULL
    ,Observacion     TEXT
    ,FechaCrea       DATE NOT NULL
    ,FechaMod        DATE
);

SELECT * FROM Raza;