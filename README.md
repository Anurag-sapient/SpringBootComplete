# SpringBoot

- Maven or Gradle are build tools for spring- package file, dependency checker, test cases
- Using maven you can download dependency
- IntelliJ free do not support spring framework but supports springboot

- application.properties -> port or any other configuration and using @Value we can get the variables and also connect to database
- pom.xml- similar to package.json where we add dependencies like Lombok, spring web, etc
- SpringbootApplication - makes use of tomcat server and runs on default 
- Spring uses server like tomcat, for data base connection JDBC, Spring security

## Dependency Injection -(IOC)= spring is responsible for creating object by mentioning class=@Component and using getBean to create object
@Autowired - inject the dependency without manual configuration 
- Without using new keyword by creating bean of object in bean pool we can inject the dependency using dependency  injection
- And autowiring helps in creating the object without new keyword and makes loose coupling
  -   in configuration defining the object to be returned through bean and we can return multiple types based on requirement which we can set in application properties making it loosely coupled

## Lombok
@Data -for getter, setter and @AllArgsCons-
