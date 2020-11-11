## Clase 4:  
Actividad 4.  

*1. Utilizar la misma base de datos de películas e insertar varias películas (al menos 30) con distinto contenido.*
Simil a actividad 2

*2. Crear índice en field rating y luego hacer búsquedas usando este campo.*

- db.movies.createIndex({rating: 1})
- db.movies.find({rating: {$gt: 4, $lt: 5}}).  
entre 4 y 5. 

*3. Crear índice en title y description, y después hacer búsquedas de texto en estos campos.*
- db.movies.createIndex({title: "text", description: "text"})
- db.movies.find(
    {$text: { $search: "mulan" }}
  )
