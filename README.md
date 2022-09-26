# Getting Started

This is a fullstack example where integration between spring and angular is done.
Angular UI Location: https://github.com/senapatirupen/superheroes-ui
Spring Backend Location:https://github.com/senapatirupen/superheroes

Steps To Run:
Clone the spring application and use java 11 to run the application.
MySQL is user for DB, create 'angular' schema on DB.(DB connection details are provided in application.properties file)

Clone the angular ui application to VSCode tool.
run 'npm install' command to download all the dependencies.
run 'ng serve' command to run the application on 4200 port.
Configure the spring application url as apiURL and authURL on environment.ts file.

Hit the localhost:4200 to open the login page. 
Register a first time user with admin/test.
Then login as admin/test to login the application.

Then you will be able to see all the backend communication happening through spring.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#using-boot-devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-redis)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)



