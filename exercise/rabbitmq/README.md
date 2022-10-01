To Run the container for the first time:
- docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management
	Subsequent times:
- Docker start some-rabbit
- docker ps
- Once running rabbitmq console should be visible at localhost:15672/
- RabbitMQ default username/password: guest/guest

