# Aplicación Backend Java con Spring Boot arquitectura microservicios 

Aplicación Backend construida usando el ecosistema de los mircroservicios, los cuales funcionan independientente. Está construida en alrededor de un proyecto maven, cuya única dependencia es lombok, para que esta sea compartida por todos los microservicios. Este proyecto hereda de spring boot y cada microservicio es un modulo de este, a la vez es padre de todos los microservicios. Los microservicios incluídos son; un servidor de configuracion que contiene configuraciones de cada uno de los microservicios, otro microservicio eureka que se encarga de que el ecosistema se comunique entre sí y alberga las intancias de los microservicios. A continuación tenemos dos microservicios que simulan un sistema de gestón de un restaurante, uno se encarga de los empleados y otro de sus tareas, ambo se comunican entre si gracias a un Feign Client que permite que uno consuma al otro. Cada uno de estos microservicios utiliza un SGBD (MySQL y PostegrSQL respectivamente) y puertos diferentes. Finalmente cuenta con un microservicio gateway que se encarga del enrutamiento bajo un mismo puerto de los servicios del restaurante.

## Tecnología usada:
- Maven y lombok.
- Spring boot.
- Eureka Client y Server
- Server Config
- Spring Cloud (Gateway)
- MySQL y PostgresSQL
- JPA e hibernate
- Spring Actuator

### Aplicación creada por Israel Fernández Agudo.
