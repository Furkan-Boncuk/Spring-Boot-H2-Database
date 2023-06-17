# Spring Boot H2 Database

---

## Project Structure 

**_application.properties_ => provides H2 database connection**

**_entity\College.java_ => entity class**

**_repository\CollegeRepository.java_ => CRUD methods**

**_controller\CollegeController.java_ => REST APIs**

---

## Project Detail

>**1. Go to H2 Database**

![1.png](..%2F..%2F1.png)

_**localhost:2000/h2-console**_

![2.png](..%2F..%2F2.png)

_**Enter "User Name: h2" and  "Password: h2" after that click "Connect" button**_

>**2. Go to Postman and test "POST" method**

| HTTP Method | URL or API PATH                    | Action                           |
|-------------|------------------------------------|----------------------------------|
| POST        | localhost:2000/college/save        | create new college in database   |

![3.png](..%2F..%2F3.png)

_**Fill in the information and click "Send" button**_

>**3. Go to H2 Database and see own data**

![4.png](..%2F..%2F4.png)

_**Write "SELECT * FROM college" query and test it**_

>**4. Go to Postman and test "GET" method**

| HTTP Method | URL or API PATH                    | Action                       |
|-------------|------------------------------------|------------------------------|
| GET         | localhost:2000/college/get         | retrieve all college         |

![5.png](..%2F..%2F5.png)

>**5. Go to Postman and test "PUT" method**

| HTTP Method | URL or API PATH                    | Action                           |
|-------------|------------------------------------|----------------------------------|
| PUT         | localhost:2000/college/update/{id} |                                  |

![6.png](..%2F..%2F6.png)

_**Fill in the information with another thing and click "Send" button**_

_**And also you can see the difference in the H2 Database**_

![7.png](..%2F..%2F7.png)

>**6. Go to Postman and test "DELETE" method**

| HTTP Methods | URL or API PATH                    | Action                           |
|--------------|------------------------------------|----------------------------------|
| DELETE       | localhost:2000/college/delete/{id} | delete college by id information |

![8.png](..%2F..%2F8.png)

_**In H2 Database**_

![9.png](..%2F..%2F9.png)


