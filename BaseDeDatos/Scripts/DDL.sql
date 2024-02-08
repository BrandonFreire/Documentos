/*
CopyRight
autor:
fecha:
*/

DROP TABLE IF EXISTS ExaBot;
DROP TABLE IF EXISTS IABot;

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
    IdPersonaTipo   INTEGER PRIMARY KEY AUTOINCREMENT
    ,Descripcion    TEXT NOT NULL UNIQUE
    ,FechaCrea      DATETIME DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Persona (
    IdPersona         INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdPersonaTipo    INTEGER NOT NULL REFERENCES PersonaTipo(IdPersonaTipo)
    ,Cedula           TEXT NOT NULL UNIQUE
    ,Nombre           TEXT NOT NULL
    ,FechaCrea        DATETIME DEFAULT CURRENT_TIMESTAMP
    --,CONSTRAINT fk_PersonaTipo FOREIGN KEY (idPersonaTipo) REFERENCES PersonaTipo(idPersonaTipo) 
);


--sentencia para mostrar solo un capo
-- SELECT *  FROM PersonaTipo WHERE IdPersonaTipo = 2;
 

-- Verificar si la tabla IABot existe
--SELECT name FROM sqlite_master WHERE type='table' AND name='IABot';

-- Si la tabla existe, ejecutar la consulta
--SELECT * FROM IABot;



