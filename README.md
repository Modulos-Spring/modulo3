# **Lambda Consumer Kafka – Spring Boot**

Este projeto consiste em uma função desenvolvida com **Spring Cloud Function** que consome mensagens de um **tópico Kafka** e imprime no console o conteúdo recebido.  
Além disso, o projeto gera uma **imagem Docker** da aplicação e possui um pipeline automatizado com **GitHub Actions** para publicar a imagem no DockerHub e realizar análise de qualidade com **SonarCloud**.

---

# 🚀 **Funcionalidades**

### **✔️ Consumo de mensagens Kafka**

A função `menssageConsumer` é automaticamente invocada sempre que novas mensagens chegam no tópico configurado via Spring Cloud Stream.

Cada mensagem recebida é exibida no console no formato:

`A mensagem chegou: <mensagem>`

---

# 🛠️ **Tecnologias Utilizadas**

- **Java 17**
- **Spring Boot**
- **Spring Cloud Stream + Kafka**
- **Docker**
- **DockerHub**
- **GitHub Actions**
- **SonarCloud**
- **Apache Kafka**

# 📦 **Docker**

### ➤ **Construir a imagem**

`docker build -t meu-usuario/modulo3:latest .`

### ➤ **Executar localmente**

`docker run --rm meu-usuario/modulo3:latest`

A aplicação iniciará e aguardará mensagens no tópico Kafka configurado.

---

# 🐳 **Publicação no DockerHub via GitHub Actions**

A pipeline localizada em:

`.github/workflows/docker-publish.yml`

Executa automaticamente:
1. Login no DockerHub
2. Build da imagem
3. Push para o DockerHub (`latest`)

# 🔍 **Pipeline de Qualidade – SonarCloud**

O arquivo:
`.github/workflows/build.yml`

faz:
- Build com Maven
- Verificação do código
- Análise no SonarCloud
- Quality Gate

---

## 🔍 Análise de Código com SonarQube

Relatório do módulo disponível aqui:
👉 https://sonarcloud.io/organizations/modulos-spring/projects
