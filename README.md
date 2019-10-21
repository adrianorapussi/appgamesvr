# App Games VR
Projeto responsável por expor APIs RESTFul para monitoramento e gerenciamento de gameterapia.

## Motivação
Terapeutas que utilizam jogos VR em tratamento de pessoas com problema de mobilidade, precisam definir rotinas e ordens para o pacientes executarem os jogos, logo este projeto foi proposto como uma solução para auxiliar os terapeutas a propor ordem de execução dos jogos e analisar o desenvolvimento dos mesmos em um determinado tempo. 

## Code Style
Para este projeto usamos a formatação proposta pela Google, disponível em: [https://google.github.io/styleguide/javaguide.html](https://google.github.io/styleguide/javaguide.html)

## Stack

| Tecnologia  | Versão |
| ---         | ---    |
| Java        | 11     |
| Maven       | 3.6.2      |
| Spring-boot | 2.1.9.RELEASE  |
| Spring-data | 2.1.9.RELEASE  |
| Spring-web  | 2.1.9.RELEASE  |
| MySQL       | 14.14       |

## Features
Projeto back-for-front feito em spring boot, o qual fornece APIs RESTful para gerenciamento de monitoramento de gameterapias, com uso de banco de dados MySQL, gereciamento de projetos com maven

## Instalação
1. Instalar java 11
2. Instalar postman
3. Instalar ultima versao disponivel do Eclipse IDE
6. Instalar Mysql 
7. Criar database gamesvr no mysql
8. Mudar senha do usuario root do mysql para root
9. Instalar maven
10. Configurar maven
11. Acessar pasta raiz do projeto e rodar mvn clean install

## API Reference
As APIs públicas ficam expostas e acessadas pelo URL: http://localhost:8080/swagger-ui.html

## How to use?
Para rodar o projeto é possível de 2 maneiras:
- Pelo terminal: mvn spring-boot:run
- Pela aplicação rodando o arquivo AppgamesvrApplication.java

## Contribuição
Para contrbuir com o projeto é possível entrar em contato com os autores do projeto ou abrir uma discussão no github apontando o problema com imagem.

## Autores 
- Adriano Rapussi
- Felipe Monteiro Costa

## License
Universidade Presbiteriana Mackenzie ©
