## LABORATORIO 3 - PBT - 2022-1
## LUISA DE LA HOZ

### COMPILAR Y EJECUTAR
Ejecute los comandos necesarios de Maven, para compilar el proyecto y verificar que el proyecto se creó correctamente y los cambios realizados al archivo pom no generan inconvenientes.

![image](https://user-images.githubusercontent.com/104604359/188336803-390d5520-1fcc-46c4-831a-bfac4cdfe6b8.png)
![image](https://user-images.githubusercontent.com/104604359/188336814-962577bf-6bcd-45a8-a0b5-240852c61b79.png)

Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo sobre el proyecto. Se debe ejecutar la claseAppTest con resultado exitoso.

![image](https://user-images.githubusercontent.com/104604359/188336829-12c9cf14-7ecf-46d5-a591-de1888686d77.png)
![image](https://user-images.githubusercontent.com/104604359/188336832-9346dea2-dfa3-4c7d-b5da-a125b7fd3681.png)

### EJECUTAR LAS PRUEBAS
$ mvn package

![image](https://user-images.githubusercontent.com/104604359/188336846-efa3f2ff-e321-494c-8148-c4da783920e8.png)
![image](https://user-images.githubusercontent.com/104604359/188336850-192e1a80-653d-439d-aee9-960f6c916571.png)


$ mvn test

![image](https://user-images.githubusercontent.com/104604359/188336858-e9429212-5505-4a85-8cbe-9aee98a0b21f.png)
![image](https://user-images.githubusercontent.com/104604359/188336873-18868628-bf4a-4379-8e82-45f2b50cfed2.png)

### FINALIZAR EL EJERCICIO - Diseño de casos de prueba

Input: n

Valid: 18 <= n <= 99

Dead: n >= 100

Underage: 1 <= n <= 17

Invalid_age: 0 <= n

![image](https://user-images.githubusercontent.com/104604359/188336953-2642c69f-ce4b-443e-862d-a0a18ab41d46.png)

### EJERCICIO "DESCUENTO DE TARIFAS"
IMPLEMENTACIÓN DE LAS PRUEBAS

![image](https://user-images.githubusercontent.com/104604359/188336969-5d8a7f35-5eef-4562-9a01-981dba172073.png)

1. Casos de prueba y límites de equivalencia

![image](https://user-images.githubusercontent.com/104604359/188337062-6db5b214-aed8-414a-b74e-0afa929a45a7.png)

2.	Diseño casos de prueba 
   	Edad:
    
    ![image](https://user-images.githubusercontent.com/104604359/188337103-a3211246-1876-4ca9-8e9f-011e7371e358.png)

    Días Antelación
    
    ![image](https://user-images.githubusercontent.com/104604359/188337138-fa64ce17-1573-4634-9dd8-8431461de72c.png)

3.	Casos de prueba especificos 

![image](https://user-images.githubusercontent.com/104604359/188337182-366c16ff-6dbc-4631-ae52-3bbb64870703.png)


    


