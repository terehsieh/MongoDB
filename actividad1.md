## Clase 1:  
Actividad 1.  

*1. Instalar MongoDB en ambiente local.*
SO: ios. 
a. Terminal poner el comando:
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install.sh)". 

b. Seguir los siguientes pasos https://docs.mongodb.com/manual/tutorial/install-mongodb-on-os-x/. 

*2. Conectarse a MongoDB vía CLI.*    
  $ mongo

*3. Crear una nueva base de datos llamada futbolfifa.*.  
use futbolfifa

*4. Crear una nueva collection llamada players.*.   
db.createCollection("players")

*5. Insertar 5 documentos en la collection players con datos básicos (nombre, apellido, posición, fecha de nacimiento, etc).*.   
- Insertar un jugador:    
db.players.insert({name:"Juan", posicion:"Delantero", numero:5}).   
- Insertar varios jugadores (varios JSON):    
db.players.insert({name:"Nicolas" surname:"Perez", pos:"Central", birthDate:new Date(1997,0,31)},{name:"Eduardo",surname:"Rodruiguez", pos:"defensor", birthDate: new Date(2000,0,31)}).   

*6. Listar todos los documentos de la collection players.*.   
db.players.find()

*7. Crear otras collections con documentos (ej. teams, games, etc).*.   
Repetir pasos 3, 4, 5.
