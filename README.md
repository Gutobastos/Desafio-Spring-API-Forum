
Desafio Spring API Fórum
Este projeto é uma API RESTful desenvolvida com Spring Boot, projetada para gerenciar um sistema de fórum online. Ele permite aos usuários criar tópicos, responder a discussões, e gerenciar seus próprios conteúdos, simulando as funcionalidades essenciais de uma plataforma de fórum.

🚀 Tecnologias Utilizadas
Java 17: Linguagem de programação principal.

Spring Boot: Framework para construção da API.

Spring Data JPA: Para persistência de dados e interação com o banco de dados.

MySQL: Banco de dados relacional.

Maven: Ferramenta de automação de build.

Lombok: Para reduzir o código boilerplate.

Flyway: Para migrações de banco de dados.

Spring Security: Para autenticação e autorização (JWT).

Bean Validation: Para validação de dados.

OpenAPI (Swagger UI): Para documentação da API.

💡 Funcionalidades
A API oferece as seguintes funcionalidades principais:

Autenticação de Usuários: Cadastro e login de usuários com JWT.

Gerenciamento de Tópicos:

Criação de novos tópicos.

Listagem de todos os tópicos (com paginação e filtros).

Visualização de um tópico específico.

Atualização de tópicos existentes.

Exclusão de tópicos.

Gerenciamento de Respostas:

Criação de respostas para tópicos.

Listagem de respostas por tópico.

Atualização de respostas.

Exclusão de respostas.

🛠️ Como Rodar o Projeto Localmente
Siga os passos abaixo para configurar e executar a aplicação em seu ambiente local:

Pré-requisitos
Certifique-se de ter as seguintes ferramentas instaladas:

JDK 17

Maven

MySQL

Configuração do Banco de Dados
Crie um banco de dados MySQL chamado forumbd (ou o nome que preferir).

Atualize as configurações de conexão com o banco de dados no arquivo application.properties (ou application.yml se preferir) localizado em src/main/resources:

Properties

spring.datasource.url=jdbc:mysql://localhost:3306/forumbd?createIfNotExist=TRUE&serverTimezone=UTC
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=validate
spring.flyway.enabled=true
Nota: ddl-auto=validate é utilizado com o Flyway para validação do esquema. Se for a primeira vez que você roda o projeto, o Flyway criará as tabelas.

Executando a Aplicação
Clone o repositório:

Bash

git clone https://github.com/Gutobastos/Desafio-Spring-API-Forum.git
cd Desafio-Spring-API-Forum
Compile o projeto com Maven:

Bash

mvn clean install
Execute a aplicação Spring Boot:

Bash

mvn spring-boot:run
A aplicação estará disponível em http://localhost:8080.

📄 Documentação da API (Swagger UI)
Após iniciar a aplicação, você pode acessar a documentação interativa da API através do Swagger UI no seguinte endereço:

http://localhost:8080/swagger-ui.html

✒️ Autor
Gustavo Bastos - GitHub
