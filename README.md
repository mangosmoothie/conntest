# Simple connection test for Oracle Database 12c

Test the connection to an Oracle Database

## To compile and run

1. [download ojdbc7 driver]("http://www.oracle.com/technetwork/database/features/jdbc/jdbc-drivers-12c-download-1958347.html") from Oracle and place in project root
1. [optional] add connection details to conntest.java
1. compile the class

    ```
    javac conntest.java
    ```
2. create the jar

    ```
    jar cvfm conntest.jar ./MANIFEST.MF ./conntest.class ./ojdbc7.jar
    ```
3. run the connection test

    ```
    java -jar conntest.jar
    ```
    or
    ```
    java -jar conntest.jar <url> <user> <password>
    ```
