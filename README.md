This project is to understand the Java message service using ActiveMQ.

Steps to setup and start application

1. Download the ActiveMQ zip from https://activemq.apache.org/components/classic/download/
2. Unzip it and navigate to bin folder
3. Open CMD from that location and type command "activemq start", this will start the MQ server
4. Now clone this repo and import the projects in Eclipse/STS
5. Start both the JMS server and JMSReceiver application as Springboot application
6. Once both applications are started without error then open postman.
7. Select GET request in postman and enter following URL - "http://localhost:8080/send/{message}"
8. In place of {message} give the required message to send and hit the send button
9. Now go to JMSReceiver Application console the message will be printed
10. This can be done vice-versa as both application has sender and receiver functionality with different topic name.

