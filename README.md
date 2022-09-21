## LABORATORIO 3 - PBT - 2022-1
## LUISA DE LA HOZ

### Actualizar y crear dependencias en el proyecto
1. Busque en internet el repositorio central de maven.
2. Busque el artefacto JUnit y entre a la versión más nueva
3. Ingrese a la pestaña de Maven y haga click en el texto de la dependencia para copiarlo al portapapeles.
4. Edite el archivo pom.xml y realice las siguientes actualizaciones:
4.1. Agregue la dependencia copiada a la sección de dependencias.

![image](https://user-images.githubusercontent.com/104604359/191515766-18566d27-7178-47e1-aef5-bc3aa692f72c.png)

4.2.Hay que cambiar la versión del compilador de Java a la versión 8, para ello, agregue la sección properties antes de la sección de dependencias:

![image](https://user-images.githubusercontent.com/104604359/191516007-80d3fe13-c587-49c0-b66b-2e630a9f86a6.png)

* * *
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

#### Diferencias entre mvn package / mvn test
**mvn package:** Toma el código compilado y lo empaqueta en un formato distribuible como un JAR.

**mvn test:** Corre las pruebas usando una suite de pruebas de un framework de pruebas (En este caso JUnit). Estas pruebas no requieren que el código sea empaquetado. Es decir, compila los test y los ejecuta.

* * *
### FINALIZAR EL EJERCICIO

1. Diseño de casos de prueba

Input: n

Valid: 18 <= n <= 99

Dead: n >= 100

Underage: 1 <= n <= 17

Invalid_age: 0 <= n

Si n es igual a un input anteriormente ingresado entonces retorna DUPLICATE

![image](https://user-images.githubusercontent.com/104604359/188336953-2642c69f-ce4b-443e-862d-a0a18ab41d46.png)

2. Complete la implementación de la clase RegistryTest.java con (al menos) un método por cada clase de equivalencia, creandodiferentes personas y validando que el resultado sea el esperado.

![image](https://user-images.githubusercontent.com/104604359/191517381-5b7b6746-51f3-4dbe-bca4-f1cbdee3f62e.png)

![image](https://user-images.githubusercontent.com/104604359/191517528-33c74c86-b7c0-4662-9411-f2c743aefe96.png)

![image](https://user-images.githubusercontent.com/104604359/191517618-f00f6717-5b64-41e7-acf3-39f7eba3d9d0.png)

3. Complete la implementación del método registerVoter en la clase Registry.java para retornar el resultado esperado según la entrada.

![image](https://user-images.githubusercontent.com/104604359/191518457-e83cb37f-d2fe-4e5e-83b0-43ac6ba4af22.png)

![image](https://user-images.githubusercontent.com/104604359/191518560-af8836b0-c54b-4a66-9492-5b2d36c9f782.png)

![image](https://user-images.githubusercontent.com/104604359/191390013-6116f7f8-3a0b-4bb5-938c-185bdcbbadde.png)

* * *
* * *

### EJERCICIO "DESCUENTO DE TARIFAS"
IMPLEMENTACIÓN DE LAS PRUEBAS

Descargue el archivo aerodescuentos.jar y adicione esta nueva dependencia en el archivo pom.xml de su proyecto.
Para adicionar una librería personalizada al repositorio local de maven puede ejecutar el siguiente comando.

![image](https://user-images.githubusercontent.com/104604359/191516898-45191d52-1549-4dee-8657-a11ecfc1393e.png)

![image](https://user-images.githubusercontent.com/104604359/188336969-5d8a7f35-5eef-4562-9a01-981dba172073.png)

1. Casos de prueba y límites de equivalencia

![image](https://user-images.githubusercontent.com/104604359/188337062-6db5b214-aed8-414a-b74e-0afa929a45a7.png)

2.	Diseño casos de prueba 
   	Edad:
    
    ![image](https://user-images.githubusercontent.com/104604359/188337103-a3211246-1876-4ca9-8e9f-011e7371e358.png)

    Días Antelación
    
    ![image](https://user-images.githubusercontent.com/104604359/188337138-fa64ce17-1573-4634-9dd8-8431461de72c.png)

3.	Casos de prueba especificos 

![image](https://user-images.githubusercontent.com/104604359/189512527-d41b57f0-ba40-4659-ab5b-c888ef1efc81.png)

4. Implementación de TarifasTest

![image](https://user-images.githubusercontent.com/104604359/191519844-26a2a1db-c513-45ae-83c8-e21d0e623c14.png)

![image](https://user-images.githubusercontent.com/104604359/191519969-9fb659a5-4734-4a0c-ac31-f16733e144a0.png)

![image](https://user-images.githubusercontent.com/104604359/191520034-1e991ea0-1063-4f3b-8c30-e7566e4d9b19.png)


![image](https://user-images.githubusercontent.com/104604359/191520172-3ab338fe-b778-4d0e-ada3-ef7444cc34de.png)


