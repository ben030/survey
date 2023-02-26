# Mini Survey Tool

This was created by playing around with the spring.io tutorials.

Votes are collected with a web frontend (SurveyWebAPI), send via RabbitMQ to SurveyDBSaver. 
SuveyDBSaver saves the result in a MySQL Database and provides it collected votes with an API to the web frontend.

### Technologies:
- Web API: Spring Boot
- Database: MySQL
- Message Broker: RabbitMQ
- Reverse Proxy: Nginx

### Endpoints:
| HTTP Verbs | Endpoints            | Action                          |
|------------|----------------------|---------------------------------|
| GET        | /interimresult       | Request all votes from database |
| POST       | /vote                | Cast a vote (id = [1, 2, 3])    |

#### Endpoints behind Nginx:
- Web Frontend: localhost:8080/
- Results from: SurveyDB localhost:8081/


### Build:
TODO

### Deployment:
```
docker-compose up -d
``` 

Web Frontend is available on http://localhost:80/