# Person-Search
Person search by name or date from MySQL database. 

## Working with:
- FRONT-END: Thymeleaf, HTML;
- BACK-END: Spring Boot gradle (Java 8, packaging: jar);
- Database: MySQL.

## Search form

![List of search Person](https://user-images.githubusercontent.com/56863735/76952811-56856080-6916-11ea-9990-7d1a3346dbe9.PNG)


## Dependencies:
```
dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	implementation 'org.springframework.cloud:spring-cloud-starter'
	runtimeOnly 'mysql:mysql-connector-java'
}
```
