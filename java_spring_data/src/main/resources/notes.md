docker run --detach --name=test-mysql --env="MYSQL_ROOT_PASSWORD=mypassword" --publish 6603:3306 mysql

docker run --name=mysql_dckr -p3306:3306 -e MYSQL_USER=varun -e MYSQL_PASSWORD=vprod -e MYSQL_ROOT_PASSWORD=test mysql

docker exec -it mysql_dckr mysql -uvarun -p