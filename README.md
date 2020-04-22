# utf8tolatin
A small utf8 to latin parser 

In case you're working with a utf8 application and a legacy db with latin-swedish encoding.
I digged a lot but couldn't come with a solution to work properly with uppercase.

Maven dependencies used:
```
<dependency>
    <groupId>io.vavr</groupId>
    <artifactId>vavr</artifactId>
    <version>0.10.2</version>
</dependency>
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-core</artifactId>
    <version>2.9.8</version>
</dependency>
```

Use the UtfToLatinSerializer to convert a utf8 string Latin-swedish compatible string before saving in the db.
You can use the Utf8Serialize class as annotation on your entity model, assuming you're working with JSON. e.g:

```
public class Foo {
    @JsonSerialize(using = Utf8DecodeSerializer.Utf8Serialize.class)
    private String name;
}
```
