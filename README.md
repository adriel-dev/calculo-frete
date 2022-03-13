# Consulta Cálculo Frete - API

![](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

## 💻 Sobre o Projeto

**•**  O objetivo é a realização do seguinte desafio:

Implementar para empresa de transporte de cargas SigaBem o endpoint para o cálculo do preço do frete:

Você deve calcular o valor total do frete e a data prevista da entrega.

Considerar regras para calcular o valor do frete:

CEPs com DDDs iguais tem 50% de desconto no valor do frete e entrega prevista de 1 dia
CEPs de estados iguais tem 75% de desconto no valor do frete e entrega prevista de 3 dias
CEPs de estados diferentes não deve ser aplicado o desconto no valor do frete e entrega prevista de 10 dias
O valor do frete é cobrado pelo peso da encomenda, o valor para cada KG é R$1,00
Seu input de entrada deve ser “peso”, “cepOrigem”, “cepDestino” e “nomeDestinatario“

Você utilizará a API gratuita de consulta de CEP abaixo: Documentação da API: https://viacep.com.br/ Exemplo do GET: https://viacep.com.br/ws/<CEP_A_CONSULTAR>/json/

Endpoint pode ser público Response/Output deve possuir: “vlTotalFrete” e “dataPrevistaEntrega”, “cepOrigem” e “cepDestino” Deve ser persistido no banco os valores da cotação os valores consultados: “peso”, “cepOrigem”, “cepDestino”, “nomeDestinatario”, “vlTotalFrete”, “dataPrevistaEntrega” e “dataConsulta”

## Rota da aplicação

### GET `/frete`

• A rota tem quatro parâmetros **obrigatórios**: **cepDestino**, **cepOrigem**, **peso** e **nomeDestinatario**.

• Em caso de sucesso retorna o status code `200` e um **JSON** contendo o valor total do frete e a data prevista da entrega.
```
  {
    "dataPrevistaEntrega": "dd/MM/yyyy",
    "vlTotalFrete": 0
  }
```

• Em caso de erro, que pode ocorrer devido a ausência de algum parâmetro, por exemplo, retorna status code `400`.
