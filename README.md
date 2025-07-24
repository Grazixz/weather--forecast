# 🌦️ Weather Forecast

Aplicação Java que consome uma API de previsão do tempo e exibe as principais informações climáticas com base na cidade informada pelo usuário.

Desenvolvido como parte dos meus estudos sobre consumo de APIs REST com Java 21.

---

## 🔧 Tecnologias

- Java 21
- Gson (para parse de JSON)
- API de clima: [WeatherAPI](https://www.weatherapi.com/)


---

## ⚙️ Funcionalidades

- Entrada da cidade via console
- Consulta de clima atual via API
- Exibição das seguintes informações:
  - Temperatura atual
  - Umidade
  - Velocidade do vento
  - Descrição do tempo (ex: "parcialmente nublado")

---

---

## ▹ Como executar

1. Clone o repositório:
   
   ```bash
   git clone https://github.com/Grazixz/weather--forecast

⚠️OBS:
- Precisa modificar a classe **ExchangenerateApi**, pegue uma key no [**site da API**](https://www.weatherapi.com/) e altera o atributo **key** da classe;
- Precisa implementar a dependência do gson, que está na pasta **dependences**;

---
