# Simple connection test for Oracle Database 12c

Test the connection to an Oracle Database

## To compile and run

1. if you do not have the jdbc driver in your local repo, [download & install ojdbc7 driver](https://www.mkyong.com/maven/how-to-add-oracle-jdbc-driver-in-your-maven-local-repository/) from Oracle and place in project root
1. *[optional]* add connection details to conntest.java
1. create the uberjar
    ```
    mvn package
    ```
2. grab the jar at `target/conntest.jar`
3. run the connection test

    ```
    java -jar conntest.jar
    ```
    or
    ```
    java -jar conntest.jar <url> <user> <password>
    ```
    or (to keep retying for n seconds)
    ```
    java -jar conntest.jar <url> <user> <password> <retry # of seconds>
    ```
