# Docker commands

After installing and starting/enabeling docker, run

``` docker pull mariadb:latest ```

then

``` docker run --name mariadb -e MYSQL_ROOT_PASSWORD=voteapp -p 3306:3306 -d docker.io/library/mariadb:latestt ```

To connect to the database

```mariadb --host 127.0.0.1 -P 3306 --user root -p voteapp ```

For swagger:

https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
