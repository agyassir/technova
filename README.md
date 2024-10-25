## SPRING FRAMEWORK
## Project Name: Technova

This application is a basic User Management System
built using Spring Core without Spring Boot,
Spring MVC, and Spring Data JPA. It allows users to perform CRUD operations
such as creating, viewing, updating, and deleting users through a web interface.

## Table of Contents
- [Project Structure](#project-structure)
- [Dependency Injection (DI)](#dependency-injection-di)
- [Inversion of Control (IoC)](#inversion-of-control-ioc)
- [Spring Beans](#spring-beans)
- [Bean Scopes](#bean-scopes)
- [ApplicationContext](#applicationcontext)
- [Component Scanning and Stereotype Annotations](#component-scanning-and-stereotype-annotations)
- [Spring Data JPA](#spring-data-jpa)
- [Spring MVC](#spring-mvc)
- [Installation and Setup](#installation-and-setup)

### Project Structure
```
spring-core-project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   └── example/
│   │   │   │       └── project/
│   │   │   │           ├── config/
│   │   │   │           │   └── AppConfig.java              
│   │   │   │           ├── controller/
│   │   │   │           │   └── UserController.java                        
│   │   │   │           ├── model/
│   │   │   │           │   └── User.java                    
│   │   │   │           ├── repository/
│   │   │   │           │   └── UserRepository.java (interface)              
│   │   │   │           └── service/
│   │   │   │               └── UserService.java (interface)         
│   │   │   │               └── UserServiceImpl.java         
│   │   └── resources/
│   │       └── applicationContext.xml                                
└── pom.xml                                                  
```

### Dependency Injection (DI)
Dependency Injection (DI) is a design pattern used in software development to implement Inversion of Control (IoC), where dependencies (objects or components that a class needs to function) are provided from an external source rather than created by the class itself. This approach makes applications easier to maintain, test, and scale because components are loosely coupled and can be easily replaced or modified.

### Inversion of Control (IoC)
Inversion of Control (IoC) is a programming principle that shifts control of object creation and dependency management from the class itself to an external framework or container, such as the Spring Framework.
### Spring Beans
In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC container are called beans. A bean is an object that is instantiated, assembled, and managed by a Spring IoC container. Otherwise, a bean is simply one of many objects in your application. Beans, and the dependencies among them, are reflected in the configuration metadata used by a container.
### Bean Scopes
When you create a bean definition, you create a recipe for creating actual instances of the class defined by that bean definition. The idea that a bean definition is a recipe is important, because it means that, as with a class, you can create many object instances from a single recipe.
```
| Scope       | Description                                                                                                                                                  |
|-------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------|
| singleton   | (Default) Scopes a single bean definition to a single object instance for each Spring IoC container.                                                        |
| prototype   | Scopes a single bean definition to any number of object instances.                                                                                           |
| request     | Scopes a single bean definition to the lifecycle of a single HTTP request. Each HTTP request has its own instance of the bean. Only valid in a web-aware `ApplicationContext`. |
| session     | Scopes a single bean definition to the lifecycle of an HTTP `Session`. Only valid in a web-aware `ApplicationContext`.                                       |
| application | Scopes a single bean definition to the lifecycle of a `ServletContext`. Only valid in a web-aware `ApplicationContext`.                                     |
| websocket   | Scopes a single bean definition to the lifecycle of a `WebSocket`. Only valid in a web-aware `ApplicationContext`.                                          |
```
### ApplicationContext
The ApplicationContext is the thing that understands the user's wishes in terms of where and what should be injected (as well as other things such as AOP pointcuts and such) based on the configuration a user provides, either through an xml file or annotations.

### Component Scanning and Stereotype Annotations
Stereotype Annotations help us to get the roles of types or methods at conceptual level. Stereotype annotations are @Component, @Service, @Repository and @Controller annotations. These annotations are used for auto-detection of beans using @ComponentScan and component-scan.
### Spring Data JPA
Spring Data JPA, part of the larger Spring Data family, makes it easy to easily implement JPA-based (Java Persistence API) repositories. It makes it easier to build Spring-powered applications that use data access technologies.
### Spring MVC
Spring MVC is a web framework for building Java web applications, focusing on handling web requests and responses.
### Installation and Setup
#### 1-create your project
first of all you need to create the jave maven project with the settings of your like the jdk that you use and the name of the artifact and group id
#### 2-add necessary dependecies
in your spring core project you need for sure the spring core dependency, spring data dependency, spring webmvc, spring orm, and the other necessary dependencies.
#### 3-configure your database in the application context
add the configuration of the database you are using to establish a connexion
#### 4-configure your server
after you run mvn clean install you should be able to have your artifact in the deployement of the project server interface and you proceed with the config to run it . 
#### 5-proceed with the rest of the project
after all that it's your time time to shine with writing the code that you have in your imagination.
# From the author
no matter what you do trust in yourself and thank god , because only god can stop 