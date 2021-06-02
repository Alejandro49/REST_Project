# REST_Project
Gestión de una Liga de Equipos con servicios RESTful

## Configuración Apache Tomcat 9 en eclipse:
Pagina web para descargar Tomcat 9: https://tomcat.apache.org/download-90.cgi 

	1.	En la barra superior de herramientas pinchamos en “Window”
		1.1.	Pinchamos en “Preferences”
	2.	Dentro de la opción “Preferences”:
		2.1.	Seleccionamos la opción “> Server” e inmediatamente la opción “Runtime Environment”
		2.2.	Añadimos el servidor Apache Tomcat pinchando en “Add”
			2.2.1.	Dentro de la opción “New Server Runtime Environment”:
				•	Seleccionamos “Apache Tomcat v9.0” y pinchamos en “Next”
				•	En la parte donde pone “Tomcat installation directory” hay que poner la dirección donde se encuentra el directorio del apache-tomcat.
				•	Y finalmente pinchamos en “Finish” y luego en “Apply and Close”
				
## Pasos para abrir el proyecto en Eclipse
	1. En la barra superior de herramientas pinchamos en “File”.
		1.1.	Pinchamos en “Import ...”
	2.	Dentro de la opción “Import”:
		2.1.	Abrimos la carpeta “Maven” y seleccionamos la opción “Existing Maven Projects”
		2.2.	Pinchamos en “Next >”
	3.	Dentro de la opción “Import Maven Projects”:
		3.1.	En Root Directory ponemos la dirección donde nos hemos clonado el repositorio, incluyendo el directorio “liga”.
				Un ejemplo sería: “C:\Users\User\Desktop\...\REST_Project\liga”
		3.2.	Si el paso anterior se ha realizado correctamente tendrá que aparecer en Projects el “/pom.xml” seleccionado.
		3.3.	Pinchamos en “Finish”


## Operaciones que se podrán realizar para gestionar nuestra liga:

### Crear una liga:
  POST http://localhost:8080/ligas
  
  ejemplo de estructura JSON para la creción:
  {
  "nombre": "Bundesliga"
  }
  
### Crear un equipo:
  POST /Liga/:id/Equipo
  
### Mostrar todas las ligas:
  GET  http://localhost:8080/ligas
  
### Mostrar todos los equipos de una liga:
  GET http://localhost:8080/ligas/{id}/equipos
  Ejemplo:
  http://localhost:8080/ligas/1/equipos
  
### Mostrar un equipo en concreto:
  GET http://localhost:8080/ligas/{id}/equipos/{id}
  Ejemplo:
  http://localhost:8080/ligas/1/equipos/2
  
### Actualizar una liga:
  PUT http://localhost:8080/ligas
  
  
### Borrar una liga: 
  DELETE http://localhost:8080/ligas 
  
