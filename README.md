# poc-mensageria
Projeto simples de Spring Boot para estudo que recebe mensagens de um ActiveMQ standalone.


Criar imagem Docker do ActiveMQ 

docker pull rmohr/activemq
docker run -p 61616:61616 -p 8161:8161 rmohr/activemq

Acessar a url: http://localhost:8161/admin/queues.jsp

![ActiveMQ 1](https://user-images.githubusercontent.com/47223292/154821221-3a4c9298-58a2-4be9-a5f1-182db65395d6.png)

Startar a aplicação


![aplicação](https://user-images.githubusercontent.com/47223292/154821261-3bcc8f1a-b68d-40ca-96ff-4f970fe71e3b.png)


Enviando a mensagem

![Screenshot_1](https://user-images.githubusercontent.com/47223292/154821362-59d89eb8-4ad2-4fc3-8506-356f373814f6.png)


![Screenshot_2](https://user-images.githubusercontent.com/47223292/154821443-5a245b60-3d48-4486-b8e7-da715ad4524b.png)


![Screenshot_3](https://user-images.githubusercontent.com/47223292/154821460-42ccf67c-71b5-4b0a-afdb-957dcc52e6d6.png)
