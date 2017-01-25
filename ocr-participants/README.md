#ocr-participants

Belajar Spring Cloud

####Running

This is a simple Spring Boot app which can be run easily just by cloning the repo.
```$xslt
$ git clone https://github.com/hendisantika/ocr-participants
$ cd ocr-participants
$ ./mvnw spring-boot:run
```

####Usage

This app provides participant information for various races.
```$xslt
$ curl http://localhost:8181/participants
$ curl http://localhost:8181/participants/raceId
```
