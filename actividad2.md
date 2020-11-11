## Clase 2:

Actividad 2.   

*1. Crear una nueva base de datos de un sistema de streaming de video (ej. Netflix, Flow, Amazon Prime) que permita almacenar movies.*
- use  streamingNetflix

*2. Para cada movie, se debería guardar información como título (String), year (Number), rating (Number, entre 1.0 y 5.0), genre (String), description (String), actors (Array<String>), country (String), income (Number), duration (Number).*
- db.createCollection("movies")

*3. Agregar películas usando insert(), insertOne() & insertMany().*
- db.movies.insert({title:"Titanic", year:"1990", rating:4.7, genre: “love”, description: “American epic romance”, actors: [‘leonardo di caprio’, ‘kate winslet’ ], country: “United States”, income: 5, duration: 48 })  // retorna el status
- db.movies.insertOne({title:"Nemo", year:"1990", rating:4.5, genre: “funny”, description: “American computer-animated adventure”, actors: [‘nemo’, ‘doris’ ], country: “United States”, income: 5, duration: 48 }). // retorna el elemento creado
- db.movies.insertMany([{title:"Titanic", year:"1990", rating:4.7, genre: “love”, description: “American epic romance”, actors: [‘leonardo di caprio’, ‘kate winslet’ ], country: “United States”, income: 5, duration: 48 }, {title:"Titanic", year:"1990", rating:4.7, genre: “love”, description: “American epic romance”, actors: [‘leonardo di caprio’, ‘kate winslet’ ], country: “United States”, income: 5, duration: 48 }, {title:"Titanic", year:"1990", rating:4.7, genre: “love”, description: “American epic romance”, actors: [‘leonardo di caprio’, ‘kate winslet’ ], country: “United States”, income: 5, duration: 48 } ]). // retorna el elemento creado

*4. Actualizar películas agregando el field highlighted=true a aquellas con rating > 4.5.*
- db.movies.updateMany(
    {rating: {$gt: 4.5}},
    {$set: {highlighted: true}}
)
gt = greater than

*5. Actualizar películas cambiando el genre “drama” por “bored”.*
- db.movies.updateMany(
    { genre: "drama" },
    { $set: { genre: "bored"}}
)

*6. Borrar todas las películas que tengan más de 30 años.*
- db.movies.deleteMany({year: {$lt: new Date().getFullYear() - 30}})
lt = less than, getFullYear()= anio actual

*7. Buscar todas las películas argentinas.*
- db.movies.find({country: "Argentina"})

*8. Buscar todas las películas de acción con un buen rating (ej. > 4.0) que hayan salido los últimos 2 años.*
- db.movies.find({
    genre: "Action",
    rating: {$gt: 4.0},
    year: {$gt: new Date().getFullYear() - 2}
})
