**GET** `/hello-world`
```bash
  curl "http://localhost:3000/hello-world"
```

**POST** `/hello-world/:id`
```bash
  curl -X POST "http://localhost:3000/hello-world/12345678?filter=idade" \
  -H "Content-Type: application/json" \
  -d '{"name":"Luana Leal Teixeira","email":"lealteixeira.luana@gmail.com"}'

  # Path param
  # id → Identificador enviado na rota
  # Exemplo: /hello-world/12345678

  # Query param 
  # filter → Filtro opcional enviado na URL
  # Exemplo: ?filter=idade
```
