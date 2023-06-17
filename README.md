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

![1](https://github.com/Furkan-Boncuk/Spring-Boot-H2-Database/assets/114020260/2b5d8447-39cb-46b5-a09e-2c292656503b)


_**localhost:2000/h2-console**_

![2](https://github.com/Furkan-Boncuk/Spring-Boot-H2-Database/assets/114020260/22aa58bb-6594-42dc-9ef8-8fcfd62a335b)


_**Enter "User Name: h2" and  "Password: h2" after that click "Connect" button**_

>**2. Go to Postman and test "POST" method**

| HTTP Method | URL or API PATH                    | Action                           |
|-------------|------------------------------------|----------------------------------|
| POST        | localhost:2000/college/save        | create new college in database   |

![3](https://github.com/Furkan-Boncuk/Spring-Boot-H2-Database/assets/114020260/b829bfdd-a10d-42cf-a1d9-309e2dbd749b)


_**Fill in the information and click "Send" button**_

>**3. Go to H2 Database and see own data**

![4](https://github.com/Furkan-Boncuk/Spring-Boot-H2-Database/assets/114020260/e77d904c-1a17-420a-8a32-9a8ed67f747d)


_**Write "SELECT * FROM college" query and test it**_

>**4. Go to Postman and test "GET" method**

| HTTP Method | URL or API PATH                    | Action                       |
|-------------|------------------------------------|------------------------------|
| GET         | localhost:2000/college/get         | retrieve all college         |

![5](https://github.com/Furkan-Boncuk/Spring-Boot-H2-Database/assets/114020260/bbd286e4-cb6b-48f4-87d2-504c27b96c3c)


>**5. Go to Postman and test "PUT" method**

| HTTP Method | URL or API PATH                    | Action                           |
|-------------|------------------------------------|----------------------------------|
| PUT         | localhost:2000/college/update/{id} |                                  |

![6](https://github.com/Furkan-Boncuk/Spring-Boot-H2-Database/assets/114020260/1b8a3dea-0c9d-4063-b2aa-1e3af7aaed21)

_**Fill in the information with another thing and click "Send" button**_

_**And also you can see the difference in the H2 Database**_

![7](https://github.com/Furkan-Boncuk/Spring-Boot-H2-Database/assets/114020260/bad35eda-431a-4167-bf7b-5124a2c66a46)

>**6. Go to Postman and test "DELETE" method**

| HTTP Methods | URL or API PATH                    | Action                           |
|--------------|------------------------------------|----------------------------------|
| DELETE       | localhost:2000/college/delete/{id} | delete college by id information |

![8](https://github.com/Furkan-Boncuk/Spring-Boot-H2-Database/assets/114020260/c8110583-4f07-4863-a241-65973eeb3f2b)

_**In H2 Database**_

![9](https://github.com/Furkan-Boncuk/Spring-Boot-H2-Database/assets/114020260/3cd027c6-bbc9-4c71-ab6a-08036c2e9a48)


