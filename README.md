# Favorites App

Uma Api para sistema de avaliações de estabelecimentos

## Endpoints

- [Usuarios](#usuarios)

  - [alterar-avatar](#alterar-avatar)
  - [Listar todos](#listar-todos-usuarios)
  - [Listar por id](#listar-por-id-usuarios)
  - [cadastrar](#cadastrar-usuarios)
  - [alterar](#alterar-usuarios)
  - [apagar](#apagar-usuarios)

- [Avaliacoes](#avaliacoes)

  - [Listar todos](#listar-todas-avaliacoes)
  - [Listar por id](#listar-por-id-avaliacoes)
  - [cadastrar](#cadastrar-avaliacoes)
  - [alterar](#alterar-avaliacoes)
  - [apagar](#apagar-avaliacoes)

- [Categorias](#categorias)

  - [Listar todos](#listar-todas-categorias)
  - [cadastrar](#cadastrar-categorias)
  - [alterar](#alterar-categorias)
  - [apagar](#apagar-categorias)

- [Estabelecimentos](#estabelecimentos)

  - [Listar todos](#listar-todos-estabelecimentos)
  - [Listar por id](#listar-por-id-estabelecimentos)
  - [cadastrar](#cadastrar-estabelecimentos)
  - [alterar](#alterar-estabelecimentos)
  - [apagar](#apagar-estabelecimentos)

## Usuarios

### Alterar Avatar

`PUT` /favoriteapp/api/usuarios/{id}/avatar

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Avatar do usuário atualizado com sucesso                  |
| 400    | Campo inválido                                            |
| 404    | O usuário não foi localizado                              |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
  avatar: "path/arquivo.png";
}
```

**Campos da Requisição**

| campo  | tipo  | obrigatório | descrição         |
| ------ | ----- | :---------: | ----------------- |
| avatar | texto |     sim     | Caminho da imagem |

### Listar todos usuarios

`GET` /favoriteapp/api/usuarios

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Retorna uma lista de todos usuários                       |
| 404    | A lista de usuários não foi localizada                    |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
 nome: "Paulo Henrique",
 email: "ph23.alves@gmail.com"
}
```

### Listar por id usuarios

`GET` /favoriteapp/api/usuarios/{id}

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Retorna um usuário pelo id informado                      |
| 404    | O usuário não foi localizado                              |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
 nome: "Paulo Henrique",
 email: "ph23.alves@gmail.com"
}
```

### Cadastrar usuarios

`POST` /favoriteapp/api/usuarios

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 201    | Usuário criado com sucesso                                |
| 404    | Campos inválidos                                          |
| 409    | Conflict - Já existe um usuário com o mesmo email         |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
 nome: "Paulo Henrique",
 email: "ph23.alves@gmail.com",
 senha: "123",
 avatar:"path/arquivo.png"
}
```

**Campos da Requisição**

| campo | tipo  | obrigatório | descrição                            |
| ----- | ----- | :---------: | ------------------------------------ |
| nome  | texto |     sim     | Nome completo                        |
| email | text  |     sim     | validação de e-mail                  |
| senha | texto |     sim     | o valor deve ter no minimo 6 digitos |

### Alterar usuarios

`PUT` /favoriteapp/api/usuarios/{id}

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Usuário atualizado com sucesso                            |
| 404    | O usuário não foi localizado                              |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
 nome: "Paulo Henrique",
 senha: "123"
}
```

**Campos da Requisição**

| campo | tipo  | obrigatório | descrição                            |
| ----- | ----- | :---------: | ------------------------------------ |
| nome  | texto |     sim     | Nome completo                        |
| email | texto |     sim     | validação de e-mail                  |
| senha | texto |     sim     | o valor deve ter no minimo 6 digitos |

### Apagar usuarios

`DELETE` /favoriteapp/api/usuarios/{id}

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Usuário removido com sucesso                              |
| 404    | O usuário não foi localizado                              |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

## Avaliacoes

### Listar todas avaliacoes

`GET` /favoriteapp/api/avaliacoes

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Retorna uma lista de todas avaliações                     |
| 404    | A lista de avaliações não foi localizada                  |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
 id: 1,
 nota: 4.0,
 comentarios: "Esse é o comentário"
}
```

### Listar por id avaliacoes

`GET` /favoriteapp/api/avaliacoes/{id}

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Retorna uma avaliação pelo id informado                   |
| 404    | A avaliação não foi localizado                            |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
 id: 1,
 nota: 4.0,
 comentarios: "Esse é o comentário"
}
```

### Cadastrar avaliacoes

`POST` /favoriteapp/api/avaliacoes

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 201    | Avaliação criado com sucesso                              |
| 404    | Campos inválidos                                          |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
 nota: 4.0,
 comentarios: "Esse é o comentário"
}
```

**Campos da Requisição**

| campo      | tipo  | obrigatório | descrição                     |
| ---------- | ----- | :---------: | ----------------------------- |
| nota       | float |     sim     | maior que 0 e menor igual a 5 |
| comentario | texto |     sim     | comentario                    |

### Alterar avaliacoes

`PUT` /favoriteapp/api/avaliacoes/{id}

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Avaliação atualizado com sucesso                          |
| 404    | A avaliação não foi localizada                            |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
 nota: 4.0,
 comentarios: "Esse é o comentário"
}
```

**Campos da Requisição**

| campo      | tipo  | obrigatório | descrição                     |
| ---------- | ----- | :---------: | ----------------------------- |
| nota       | float |     sim     | maior que 0 e menor igual a 5 |
| comentario | texto |     sim     | comentario                    |

### Apagar avaliacoes

`DELETE` /favoriteapp/api/avaliacoes/{id}

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Avaliação removida com sucesso                            |
| 404    | A avaliação não foi localizada                            |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

## Categorias

### Listar todas categorias

`GET` /favoriteapp/api/categorias

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Retorna uma lista de todas categorias                     |
| 404    | A lista de categorias não foi localizada                  |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
  nome_categoria: "Restaurante";
}
```

### Cadastrar categorias

`POST` /favoriteapp/api/categorias

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 201    | Categoria criada com sucesso                              |
| 404    | Campos inválidos                                          |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
  nome_categoria: "Restaurante";
}
```

**Campos da Requisição**

| campo          | tipo  | obrigatório | descrição      |
| -------------- | ----- | :---------: | -------------- |
| nome_categoria | texto |     sim     | Nome categoria |

### Alterar categorias

`PUT` /favoriteapp/api/categorias/{id}

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Categoria atualizada com sucesso                          |
| 404    | A categoria não foi localizada                            |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
  nome_categoria: "Restaurante";
}
```

**Campos da Requisição**

| campo          | tipo  | obrigatório | descrição      |
| -------------- | ----- | :---------: | -------------- |
| nome_categoria | texto |     sim     | Nome categoria |

### Apagar categorias

`DELETE` /favoriteapp/api/categorias/{id}

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Categoria removida com sucesso                            |
| 404    | A categoria não foi localizada                            |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

## Estabelecimentos

### Listar todos estabelecimentos

`GET` /favoriteapp/api/estabelecimentos

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Retorna uma lista de todos estabelecimentos               |
| 404    | A lista de estabelecimentos não foi localizada            |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
 nome_estabelecimento: "Restaurante Kitchenet",
 data_entrada: "01/01/2023",
 data_saida: "01/01/2023",
 imagem: "path/imagem.png",
 nota: 4.0,
 comentarios: "Esse é o comentário"
}
```

### Listar por id estabelecimentos

`GET` /favoriteapp/api/estabelecimentos/{id}

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Retorna um estabelecimento pelo id informado              |
| 404    | O estabelecimento não foi localizado                      |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
 nome_estabelecimento: "Restaurante Kitchenet",
 data_entrada: "01/01/2023",
 data_saida: "01/01/2023",
 imagem: "path/imagem.png",
 nota: 4.0,
 comentarios: "Esse é o comentário"
}
```

### Cadastrar estabelecimentos

`POST` /favoriteapp/api/estabelecimentos

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 201    | Estabelecimento criado com sucesso                        |
| 404    | Campos inválidos                                          |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
 nome_estabelecimento: "Restaurante Kitchenet",
 data_entrada: "01/01/2023",
 data_saida: "01/01/2023",
 imagem: "path/imagem.png",
 nota: 4.0,
 comentarios: "Esse é o comentário"
}
```

**Campos da Requisição**

| campo                | tipo  | obrigatório | descrição                     |
| -------------------- | ----- | :---------: | ----------------------------- |
| nome_estabelecimento | texto |     sim     | Nome Estabelecimento          |
| data_entrada         | data  |     sim     | data de entrada               |
| data_saida           | data  |     sim     | data de saida                 |
| imagem               | texto |     sim     | Caminho da imagem             |
| nota                 | float |     sim     | maior que 0 e menor igual a 5 |
| comentario           | texto |     sim     | comentario                    |

### Alterar estabelecimentos

`PUT` /favoriteapp/api/estabelecimentos/{id}

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Estabelecimento atualizado com sucesso                    |
| 404    | O estabelecimento não foi localizado                      |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
 nome_estabelecimento: "Restaurante Kitchenet",
 data_entrada: "01/01/2023",
 data_saida: "01/01/2023",
 imagem: "path/imagem.png",
 nota: 4.0,
 comentarios: "Esse é o comentário"
}
```

**Campos da Requisição**

| campo                | tipo  | obrigatório | descrição                     |
| -------------------- | ----- | :---------: | ----------------------------- |
| nome_estabelecimento | texto |     sim     | Nome Estabelecimento          |
| data_entrada         | data  |     sim     | data de entrada               |
| data_saida           | data  |     sim     | data de saida                 |
| imagem               | texto |     sim     | Caminho da imagem             |
| nota                 | float |     sim     | maior que 0 e menor igual a 5 |
| comentario           | texto |     sim     | comentario                    |

### Apagar estabelecimentos

`DELETE` /favoriteapp/api/estabelecimentos/{id}

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Estabelecimento removida com sucesso                      |
| 404    | O estabelecimento não foi localizado                      |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

<!-- ## Sobre nos

### Listar sobre nos

`GET` /favoriteapp/api/usuarios/sobreNos

**Códigos de Respostas**

| código | descrição                                                 |
| ------ | --------------------------------------------------------- |
| 200    | Retorna o sobre nos                                       |
| 404    | O sobre nos não foi localizado                            |
| 500    | Ocorreu um erro interno enquanto processava a solicitação |

**Exemplo corpo requisição**

```js
{
  title: "",
  description: ""
}
``` -->
