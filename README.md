# jdbc-named-parameters

Provides a NamedParameterPreparedStatement class which implements PreparedStatement and
allows the use of named parameters in JDBC prepared SQL statements.

Credit to Adam Crume for his implementation of the SQL query parser:

http://www.javaworld.com/article/2077706/core-java/named-parameters-for-preparedstatement.html

## Query test parsing

Usually this library should be used internally by applications to parse queries
containing named parameters. The jar is also executable and can be used to view
the parsed results of a query containing named parameters.

Execute the jar and pass the path to a query file as the only argument:

```
java -jar jdbc-named-parameters.jar /home/you/test_query.sql
```
