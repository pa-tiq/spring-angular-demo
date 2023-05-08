# spring-angular-demo

Install MySQL and create a database named springangular

```bash
sudo apt install mysql-server
sudo systemctl start mysql.service
sudo mysql
mysql > ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
mysql > exit
mysql -uroot -ppassword
mysql > CREATE DATABASE springangular;
mysql > exit
```

Backend (Spring):
```bash
./mvnw spring-boot:run
```
Open [http://localhost:8080](http://localhost:8080) to view it in your browser.


Frontend (Angular):
```bash
ng serve -o
```
Open [http://localhost:4200](http://localhost:4200) to view it in your browser.
