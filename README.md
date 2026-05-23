1. This is a Springboot backend application that can manage tasks by accessing the API via Postman. This shows that data doesn't have to be stored in the backend and can be reached with a database by fetching, creating, updating and deleting data there.
--------------------------------------------
2. The application can be ran by running the "CampusTaskboardApplication.java" within the [campus-taskboard\src\main\java\edu\brooklyn\cisc3130\campus_taskboard] directory, that will then open up a compatiable IDE to which you can run the applcation.
--------------------------------------------
3. API Documentation:
--------------------------------------------
  * // Get All Task.
  * GET http://localhost:8080/api/tasks
--------------------------------------------
  * // Search Keywords.
  * GET http://localhost:8080/api/tasks/search?keyword=(Value)
--------------------------------------------
  * // Pagination to filter out sections of the database.
  * GET http://localhost:8080/api/tasks/paginated?page=(Value)&size=(Value)&sortBy=(Value)
     *  Page Value = (1 - 20)
     *  Size Value = (1 - 20)
     *  Sortby Value = (id, title, createdAt)
--------------------------------------------
  * // Search for Completed Tasks.
  * GET http://localhost:8080/api/tasks/completed
--------------------------------------------
  * // Search for Incompleted Tasks.
  * GET http://localhost:8080/api/tasks/incompleted
--------------------------------------------
  * // Search for High Priority Tasks.
  * GET http://localhost:8080/api/tasks/priority/HIGH

Get All Tasks
<img width="1920" height="1080" alt="All Tasks" src="https://github.com/user-attachments/assets/de267972-f4d1-44f9-b8c3-95e8aa49c3b6" />

All Tasks within the H2 Console
<img width="1920" height="1080" alt="All Tasks in H2 Console" src="https://github.com/user-attachments/assets/84ec1789-70e0-40c2-b1bd-7badc00f4a94" />

Search Keywords.
(Homework)
<img width="1920" height="1080" alt="Search keyword Homework" src="https://github.com/user-attachments/assets/ec312c33-a9b6-458b-9702-f2053f4e92e0" />
(book tickets)
<img width="1920" height="1080" alt="Search keyword book tickets" src="https://github.com/user-attachments/assets/2db60e22-c448-4854-a011-e54e897d60e7" />
(Pay utility bills)
<img width="1920" height="1080" alt="Search keyword Pay utility bills" src="https://github.com/user-attachments/assets/0758b6f6-2d26-4dd4-b2f1-32cdb7b24c0b" />

Pagination to filter out sections of the database.
<img width="1920" height="1080" alt="Testing Pagination" src="https://github.com/user-attachments/assets/a8266700-bc19-433e-8f6a-264c6ed67d1f" />

Search for Completed Tasks.
<img width="1920" height="1080" alt="Filtering Complete tasks" src="https://github.com/user-attachments/assets/c7d51b4b-a033-4343-b732-b06afa49bd98" />

Search for Incompleted Tasks.
<img width="1920" height="1080" alt="Filtering Incomplete tasks" src="https://github.com/user-attachments/assets/8511862d-89b1-4491-bb4d-8de7f4ecd9b7" />

Search for High Priority Tasks.
<img width="1920" height="1080" alt="Filtering High priority tasks" src="https://github.com/user-attachments/assets/08178094-c5df-4bb7-b4ac-dea9bff9993d" />
