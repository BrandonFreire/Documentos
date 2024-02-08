-- database: ../db/Exobot.sqlite
INSERT INTO IABot (Nombre, Observacion)
            VALUES ('IABot', '');

-- Tabla Exobot

INSERT INTO ExaBot (IdIABot, Nombre, Serie)
            VALUES (1, 'Sputnik 1', 'Serie 111');

INSERT INTO PersonaTipo(Descripcion)
            VALUES ('Soldado'),
                    ('Mecatronico'),
                    ('Experto Ingles'),
                    ('Experto Español');

INSERT INTO Persona  
( IdPersonaTipo, Cedula, Nombre) VALUES
( 5,  '11111', 'pepe'),
( 5,  '22222', 'juan'),
( 5,  '33333', 'pedro'),
( 5,  '44444', 'pablo'),
( 6,  '01010', 'mecatro pedro'),
( 6,  '02020', 'mecatro juan'),
( 7,  '03030', 'experto juan'),
( 8,  '04040', 'experto juan');

SELECT * FROM  IABot;
SELECT * FROM  ExaBot;
SELECT * FROM  PersonaTipo;
SELECT * FROM  Persona;

SELECT Descripcion FROM PersonaTipo WHERE Descripcion LIKE "%o%";
SELECT Descripcion FROM PersonaTipo WHERE Descripcion LIKE "%o";
>
