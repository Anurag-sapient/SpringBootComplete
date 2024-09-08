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

![image](https://github.com/user-attachments/assets/688a0033-63a6-43f9-b99e-ad67aeddb5bf)


## RestController and @Controller
- controller used when we want to send as html pages
- rest controller when we want to return json or xml pages---> controller+response body

## Sending responses
- @RequestMapping (global url)- like user/name or user/age
- @GetMapping -for get Request
- @PathVariable

## @Entity 
- for making the class as entity class which will interact with dbs

## Most Used Annotations Springboot
| Annotation               | Use/Description                                                                                      |
|--------------------------|------------------------------------------------------------------------------------------------------|
| `@SpringBootApplication`  | Marks the main class of a Spring Boot application, combining `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`. |
| `@RestController`         | Indicates that the class is a Spring MVC controller where `@ResponseBody` is automatically applied to all methods. |
| `@RequestMapping`         | Maps HTTP requests to handler methods of MVC and REST controllers, supporting multiple HTTP methods.  |
| `@GetMapping`             | Shortcut for `@RequestMapping(method = RequestMethod.GET)`, maps GET requests to the handler method. |
| `@PostMapping`            | Shortcut for `@RequestMapping(method = RequestMethod.POST)`, maps POST requests to the handler method.|
| `@PutMapping`             | Shortcut for `@RequestMapping(method = RequestMethod.PUT)`, maps PUT requests to the handler method.  |
| `@DeleteMapping`          | Shortcut for `@RequestMapping(method = RequestMethod.DELETE)`, maps DELETE requests to the handler method. |
| `@PathVariable`           | Binds a method parameter to a URI template variable.                                                 |
| `@RequestParam`           | Binds a method parameter to a web request parameter (query parameter).                               |
| `@Autowired`              | Marks a field or constructor for dependency injection.                                               |
| `@Service`                | Indicates that a class is a service, which holds business logic. Automatically detected by Spring for dependency injection. |
| `@Repository`             | Marks the class as a Data Access Object (DAO), responsible for database operations.                  |
| `@Entity`                 | Specifies that the class is an entity and is mapped to a database table.                             |
| `@Table`                  | Specifies the table name in the database that the entity is mapped to (used with `@Entity`).         |
| `@Component`              | Indicates that a class is a Spring-managed component, eligible for auto-detection and dependency injection. |
| `@Configuration`          | Indicates that a class declares one or more `@Bean` methods, used for defining Spring beans.         |
| `@Bean`                   | Denotes a method that will return a Spring bean to be managed by the Spring container.               |
| `@EnableAutoConfiguration`| Tells Spring Boot to automatically configure your application based on the dependencies you have added. |
| `@Transactional`          | Marks a method or class as transactional, providing transaction management for database operations.   |
| `@ConditionalOnProperty`  | Configures beans to be loaded conditionally based on the value of a property in `application.properties`. |
| `@Value`                  | Injects a value from `application.properties` or `application.yml` into a variable.                  |
| `@Slf4j`                  | Lombok annotation that simplifies logging by providing a `Logger` field in the class.                |
