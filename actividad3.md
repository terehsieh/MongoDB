## Clase 3:

Actividad 3
*1. Utilizar la misma base de datos de películas e insertar varias películas con distinto contenido.*
- simil al ejercicio de actividad 2

*2. Listar todas las películas del año 2018.*
- db.movies.find({year: 2018})

*3. Listar las 10 primeras películas de Hollywood.*
- db.movies.find({country: "USA"}).limit(10).sort({year: 1}).  
el ordena por anio ascendente(1), para que sea descendente es .sort({year: -1}) 

*4. Listar las 5 películas más taquilleras.*
- db.movies.find().limit(5).sort({income: -1}). 
ordena descendentemente 

*5. Listar el 2do conjunto de 5 películas más taquilleras.*
- db.movies.find()
.skip(5)
.limit(5)
.sort({income: -1}). 
lo mismo que el anterior pero se salta 5 (skip(n))

*6. Repetir query 3 y 4 pero retornando sólo el título y genre.*
- db.movies.find({country: "USA"}, {titulo: 1, genre:1, _id:0})
.limit(10)
.sort({year: 1})

- db.movies.find({}, {titulo: 1, genre: 1, _id: 0})
.limit(5)
.sort({income: -1})

*7. Mostrar los distintos países que existen en la base de datos.*
- db.movies.distinct("country")
