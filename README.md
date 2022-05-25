# aula05 Exercício extraclasse

Abrir o POSTMAN e Executar as seguintes ROTAS.

> **_URI:_** http://localhost:7000/cliente

`METODOS`

```shell script
GET: 

Reponse:

{
    "email": "email@teste.com",
    "id": 1,
    "nome": "John Doe",
    "telefone": 1198844499
}

```

```shell script
POST: 

Request:

{
    "email": "email@teste.com",
    "id": 1,
    "nome": "John Doe",
    "telefone": 1198844499
}

Response: 204 No Content

```

```shell script
PUT: 

Request:

{
    "email": "email@teste.com",
    "id": 1,
    "nome": "John Maria",
    "telefone": 1198844499
}

Response:

{
    "email": "email@teste.com",
    "id": 1,
    "nome": "John Maria",
    "telefone": 1198844499
}

```

```shell script
DELETE: 

Response: 204 No Content

```


Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)
