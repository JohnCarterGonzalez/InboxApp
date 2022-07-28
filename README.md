# InboxApp
Simple messaging app designed with Cassandra and Spring Boot

The goal of the app is to build an application that can scale and stay within acceptable performant standards
regardless of one user to millions of users.

The focus will be more on backend functionality than aesthetics, as such only basic but functional features will be implemented. 

Functional Requirements:
    - compose messages
    - send messages
        - reply, reply all
    - view messages
        - a single message
    - folder/label (sent, user folders)
    

Non Functional Requirements:
    - high availability
    - high scalablility
    - security
        - Spring Security (Oauth)

Wireframe:
    - Login/Registration
        - Github Oauth
    Home Page
        - users see, reply to messages
        - users see folders 
    Message Window
        - shows the message and allows for the user to respond 

Tech Stack:
    - Spring Boot
    - ThymeLeaf templating
    - Spring Security
    - Apache Cassandra 
