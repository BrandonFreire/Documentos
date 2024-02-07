/*
CopyRight
autor:
fecha:
*/
DROP TABLE IF EXISTS IABot;
DROP TABLE IF EXISTS ExaBot;
DROP TABLE IF EXISTS Persona;
DROP TABLE IF EXISTS PersonaTipo;

CREATE TABLE IABot(
    IdIABot         INTEGER PRIMARY KEY  AUTOINCREMENT
    ,Nombre         TEXT NOT NULL
    ,Observacion    TEXT
    ,FechaCrea      DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE ExaBot (
    idExaBot    INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdIABot    INTEGER NOT NULL
    ,Nombre     TEXT NOT NULL
    ,Serie      TEXT NOT NULL
    ,CONSTRAINT fk_IABot FOREIGN KEY (IdIABot) REFERENCES IABot(IdIABot) 
);

CREATE TABLE PersonaTipo (
    idPersonaTipo   INTEGER PRIMARY KEY AUTOINCREMENT
    ,Descripcion    TEXT NOT NULL
    ,FechaCrea      DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Persona (
    idPersona         INTEGER PRIMARY KEY AUTOINCREMENT
    ,idPersonaTipo    INTEGER NOT NULL 
    ,Descripcion      TEXT NOT NULL
    ,FechaCrea        DATETIME DEFAULT CURRENT_TIMESTAMP
    ,CONSTRAINT fk_PersonaTipo FOREIGN KEY (idPersonaTipo) REFERENCES PersonaTipo(idPersonaTipo) 

);



