CREATE TABLE Raza(
    IDRaza          INTEGER  PRIMARY KEY AUTOINCREMENT 
    ,Descripcion     TEXT NOT NULL
    ,Observacion     TEXT
    ,FechaCrea       DATE NOT NULL
    ,FechaMod        DATE
);

CREATE TABLE Sexo(
    IDSexo          INTEGER  PRIMARY KEY AUTOINCREMENT 
    ,Descripcion     TEXT NOT NULL
    ,Observacion     TEXT
    ,FechaCrea       DATE NOT NULL
    ,FechaMod        DATE
);

CREATE TABLE TipoMascota(
    IDTipoMascota          INTEGER  PRIMARY KEY AUTOINCREMENT 
    ,Descripcion     TEXT NOT NULL
    ,Observacion     TEXT
    ,FechaCrea       DATE NOT NULL
    ,FechaMod        DATE
);

CREATE TABLE Mascota(
    IDMascota          INTEGER  PRIMARY KEY AUTOINCREMENT 
    ,Descripcion     TEXT NOT NULL
    ,Observacion     TEXT
    ,FechaCrea       DATE NOT NULL
    ,FechaMod        DATE
);


INSERT  INTO Sexo (Descripcion, Observacion, FechaCrea, FechaMod)
VALUES ("Macho", "sin/obs","06/02/2024",""), 
("Hembra", "sin/obs","06/02/2024","");

INSERT  INTO Raza (Descripcion, Observacion, FechaCrea, FechaMod)
VALUES ("Pug", "sin/obs","06/02/2024",""), 
("Bulldog", "sin/obs","06/02/2024",""),
("Delmer", "sin/obs","06/02/2024",""),
("French Poodle", "sin/obs","06/02/2024","");

INSERT  INTO TipoMascota (Descripcion, Observacion, FechaCrea, FechaMod)
VALUES ("Perro", "sin/obs","06/02/2024",""), 
("Gato", "sin/obs","06/02/2024","");

INSERT  INTO Mascota (Descripcion, Observacion, FechaCrea, FechaMod)
VALUES ("Focha", "sin/obs","06/02/2024",""), 
("Gordo", "sin/obs","06/02/2024",""),
("Tadeo", "sin/obs","06/02/2024",""),
("Firulais", "sin/obs","06/02/2024","");


SELECT * FROM Sexo;
SELECT * FROM TipoMascota;
SELECT * FROM Mascota;
SELECT * FROM Raza;
