Requirements:
------------
Java21

----------------------------------------------------------------------------------
NOTE:- First we have to hit this api to store data in h2b & then perform other task.
http://localhost:8081/v1/

-------------------------------------------------------------------
Swagger url: http://localhost:8081/swagger-ui.html
-------------------------------------------------------------------
Api Endpoints:
--------------
External Api data will store in h2b database by hitting this api.
http://localhost:8081/v1/

Data will filter based on role.
http://localhost:8081/v1/role/{admin}

Data will filter based on ID.
http://localhost:8081/v1/{id}

Data will be sort in ascending order based on age
http://localhost:8081/v1/sortByAgeAsc

----------------------------------------------------------------------