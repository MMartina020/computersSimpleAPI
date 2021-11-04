# computersSimpleAPI

>Első Web Service

A web Service szolgáltatásai

1. Minden számítógép:
    -Method: GET 
   - url: http://localhost:8080/computers

2. Egy számítógép serial number alapján
   -Method: GET
   -url: http://localhost:8080/computers/{id}

3. Számítógép egy gyártótól
   -Method: GET
   -url: http://localhost:8080/computers/{manufacture}

4. Új számítógép felvétele
   -Method: POST
   -url: http://localhost:8080/computers

5. Számítógép törlése serial number alapján
   -Method: DELETE
   -url: http://localhost:8080/computers/{id}

6. Számítógép módosítása ( update )
   -Method: PATCH
   -url: http://localhost:8080/computers/{id}/{ram

7. Számítógép módosítása ( replace )
   -Method: PUT
   -url: http://localhost:8080/computers/{id}


Entity

| serial | manufacture | RAM | madein |
|:----|:----:|----:|:----:| 
|100|IBM|2|Taiwan|

Postman indítása: chorome://apps/


*Minden jog fenntartva!*

