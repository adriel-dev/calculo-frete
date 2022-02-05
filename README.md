# Consulta Cálculo Frete - API

![](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

## 💻 Sobre o Projeto

**•**  Projeto realizado seguindo todas as especificações do desafio, e assim concluindo o mesmo. 

## Rotas da aplicação

### GET `/frete`

• A rota tem quatro parâmetros obrigatórios: cepDestino, cepOrigem, peso e nomeDestinatario.

• Em caso de sucesso retorna o status code `200` e um *JSON* contendo o valor total do frete e a data prevista da entrega.
```
  {
    "dataPrevistaEntrega": "dd/MM/yyyy",
    "vlTotalFrete": 0
  }
```

• Em caso de erro, que pode ocorrer devido a ausência de algum parâmetro, por exemplo, retorna status code `400`.
