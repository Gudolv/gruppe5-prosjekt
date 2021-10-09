# Docker commands

After installing and starting/enabling docker, run

``` docker pull mariadb:latest ```

then

```docker run -p 127.0.0.1:3306:3306 --name mariadb -e MARIADB_ROOT_PASSWORD=voteapp -d mariadb:latest ```

Mariadb can also be installed locally

To enter the docker container:

```docker exec -it mariadb bash   ``` 

To connect to the database (while inside the docker container) or localy

```mariadb --host 127.0.0.1 -P 3306 --user root -p ```

create a database with ```create database testDB;```, user "root", password "voteapp"



For swagger:

http://localhost:8080/swagger-ui/


https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
