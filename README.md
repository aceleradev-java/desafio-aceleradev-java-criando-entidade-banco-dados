# Criando Entidades de Banco de Dados em Java (ORM Java)


<p>
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/aceleradev-java/desafio-aceleradev-java-criando-entidade-banco-dados">
    <a href="https://github.com/aceleradev-java/desafio-aceleradev-java-criando-entidade-banco-dados">
        <img alt="Made by" src="https://img.shields.io/badge/made%20by-adriano%20avelino-gree">
    </a>
    <img alt="Repository size" src="https://img.shields.io/github/repo-size/aceleradev-java/desafio-aceleradev-java-criando-entidade-banco-dados">
    <a href="https://github.com/EliasGcf/readme-template/commits/master">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/aceleradev-java/desafio-aceleradev-java-criando-entidade-banco-dados">
    </a>
</p>

O Aceleradev é um treinamento da Codenation com duração de 10 semanas de imersão em programação, no meu caso, Java online. Esse é o desafio do - quarto módulo que tem como conteúdo:
- Criação de banco de dados
- Modelagem de banco de dados
- JPA e Hibernate

## Desafio (Criando Entidades de Banco de Dados em Java)

Este desafio contém um projeto Maven pré-configurado com Springboot, Spring-JPA e banco de dados H2.
Abaixo você encontra um Modelo Entidade Relacionamento de um banco de dados utilizado pela Code Nation.

[Clique aqui para visualizar o modelo de entidade relacionamento](https://codenation-challenges.s3-us-west-1.amazonaws.com/java-9/codenation-sample.png)

Você utilizará o package `entity` para criar as entidades JPA para o modelo proposto.

Informações adicionais:
- O projeto deve `buildar` e `iniciar` sem erros
- Verifique os *logs* para ter certeza de que suas tabelas foram criadas corretamente
- Utilize o comando `mvnw spring-boot:run` para iniciar a aplicação

O que será  avaliado:

- Colunas não nulas
- Tamanho das colunas
- Relacionamento entre tabelas (bidirecionalmente)
- Nome de tabelas e colunas
