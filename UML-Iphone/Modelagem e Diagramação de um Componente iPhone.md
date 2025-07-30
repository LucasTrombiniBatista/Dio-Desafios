# 📱 Modelagem UML - Lançamento do iPhone (2007)

Este projeto tem como objetivo aplicar conceitos de Programação Orientada a Objetos (POO) e modelagem UML com base nas funcionalidades apresentadas no vídeo de lançamento do primeiro iPhone em 2007.

## 🎯 Objetivo

A atividade consiste em representar, por meio de um diagrama UML de classes e interfaces, as principais funcionalidades que o iPhone oferecia em seu lançamento:

- Reprodutor Musical  
- Aparelho Telefônico  
- Navegador de Internet  

---

## 📸 Diagrama UML

![Diagrama UML](.\Untitled diagram _ Mermaid Chart-2025-07-30-121504.png)

---

## 📚 Funcionalidades Modeladas

### 🔊 Reprodutor Musical (`ReprodutorMusical`)
Interface responsável pelas funções de mídia:

- `tocar()`: Inicia a reprodução da música.
- `pausar()`: Pausa a música atual.
- `selecionarMusica(String musica)`: Seleciona uma música específica para reprodução.

---

### 📞 Aparelho Telefônico (`AparelhoTelefonico`)
Interface que representa as funções de chamadas:

- `ligar(String numero)`: Realiza uma chamada para o número informado.
- `atender()`: Atende uma chamada recebida.
- `iniciarCorreioVoz()`: Inicia o sistema de correio de voz.

---

### 🌐 Navegador de Internet (`NavegadorInternet`)
Interface com funções básicas de navegação:

- `exibirPagina(String url)`: Exibe uma página da web.
- `adicionarNovaAba()`: Abre uma nova aba no navegador.
- `atualizarPagina()`: Recarrega a página atual.

---

### 📱 Classe Principal (`Iphone`)
A classe `Iphone` **implementa as três interfaces acima**, centralizando as funcionalidades do dispositivo em um único objeto.

