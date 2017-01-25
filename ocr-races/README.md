#ocr-races

####Running
```$xslt
$ git clone https://github.com/hendisantika/belajar-spring-cloud/ocr-races
$ cd ocr-races
$ ./mvnw spring-boot:run
```

####Using

This service has 2 API endpoints

####Race Data

To return race data hit the root of the application, for example
```$xslt
$ curl http://localhost:8282
```

In addition you can get race data including participant information for each race. To use this endpoint you must also have Eureka and the OCR Participants service running.
```$xslt
$ curl http://localhost:8282/participants
```
