# utf8tolatin
A small utf8 to latin parser 

In case you're working with a utf8 application and a legacy db with latin-swedish encoding.
I digged a lot but couldn't come with a solution to work properly with uppercase string. 

Maven dependencies used:
<!-- https://mvnrepository.com/artifact/io.vavr/vavr -->
<dependency>
    <groupId>io.vavr</groupId>
    <artifactId>vavr</artifactId>
    <version>0.10.2</version>
</dependency>

<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-core</artifactId>
    <version>2.9.8</version>
</dependency>
