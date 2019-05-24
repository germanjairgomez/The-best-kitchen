
SOFTWARE UTILIZADO PARA DESARROLLAR LA APLICACIÓN WEB

------------------------------------------------------

JDK 8u211 -> https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Eclipse IDE for Enterprise Java Developers(ultima versión 2019 03) -> https://www.eclipse.org/downloads/

Apache Maven Project 3.6.1 -> http://maven.apache.org/download.cgi

Mysql Workbench con Maria DB 8.0.15 servido por XAMPP

Spring Tools 3 Add-On (aka Spring Tool Suite 3) 3.9.8. RELEASE -> por medio de eclipse marketplace 

Maven (Java EE) Integration for Eclipse WTP (Luna/Mars) 1.2.0 -> viene instalado por defecto con la versión de Eclipse

JBoss Tools 4.11.0.Final -> por medio de Eclipse MarketPlace

Los instaladores se encuentran en la carpeta "resources" de este proyecto

--------------------------------------------------------

A TENER EN CUENTA

--------------------------------------------------------

En el archivo host de windows (c:/windows/system32/drivers/etc/hosts)como administrador se agrega la siguiente linea de código:

127.0.0.1 www.lamejorcocina.com

por lo cual el acceso a la plataforma lo tendremos por medio de:

http://www.lamejorcocina.com:8080/webapp/index.xhtml

o en su defecto por medio de:

http://localhost:8080/webapp/index.xhtml

-----------------------------------------------------------

CREACIÓN Y CONFIGURACIÓN DEL PROYECTO

----------------------------------------------------------

En eclipse se crea un nuevo proyecto Maven

Se configura el servidor de aplicaciones WildFly 16.0

En la opción "properties" de se selecciona la opcion de "Project Facets", allí
Se configura el "application client module" en  la pestaña de Runtime "Wildfly 16.0 Runtime"
Se cambia el "dynamic web" module a 3.0
se cambia la version de java con la que se trabajara a 1.8

-----------------------------------------------------------

IMPORTACIÓN DEL PROYECTO

----------------------------------------------------------


En Eclipse:

File -> import -> Maven -> Existing Maven Projects (se selecciona la carpeta The best kitchen/WebApp) -> Se selecciona el war, click en Finish


----------------------------------------------------------

SOLUCIÓN A POSIBLE ERRORES DE IMPORTACIÓN

----------------------------------------------------------

Si causa errores en los metodos sobrescritos con @Override, asegurarse que JAVA Compiler este usando JAVA 1.8
project->Java Complier->compiler compilance level->1.8, también, "use default compilance settings" checked.


Para el error java.lang.NoClassDefFoundError: org/springframework/context/annotation/AnnotationConfigApplicationContext o similares
asegurarse que se copiaron los modulos de dependencias a las carpetas requeridas dentro de su carpeta de instalación del servidor de aplicaciones
en nuestro caso es Wildfly 16 que se encuentra en C:\Users\{%USER%}\wildfly-16.0.0.Final por defecto.

Las dependencias del proyecto deben ser agregadas en las carpetas org o com dependiendo de cada caso (la carpeta padre directa de las dependencias se llama "main").

Recordar que los archivos xml de las dependencias deben estar en la misma carpeta que los archivos jar a los cuales se va a referenciar

Dependencias que deben ser agregadas:
org.springframework.spring
org.springframework.boot
org.slf4j
org.hibernate
com.mysql

los archivos se encuentran en la carpeta "resources/jboss-deployment-structure" de este proyecto.

ES NECESARIO AGREGAR EL DRIVER DE MYSQL EN EL ARCHIVO STANDALONE.XML DE WILDFLY (se encuentra en la carpeta de instalación de wildfly), JUNTO CON SU RESPECTIVA DEPENDENCIA


                   <driver name="mysql" module="com.mysql">
					 	<driver-class>com.mysql.jdbc.Driver</driver-class>
				   </driver>

----------------------------------------------------------------

IMPORTACIÓN DE LA BASE DE DATOS

----------------------------------------------------------------

En una ventana SQL de MySQL Workbench se ejecuta el query "database_structure.sql" (incluye la creación del schema de base de datos)

Si se desea trabajar con datos de prueba de inicio, se puede ejecutar el query "test_data.sql" 

Ambos archivos se encuentran en la carpeta "db" de este proyecto junto con el modelo E-R

----------------------------------------------------------------

ARCHIVO WAR DEL PROYECTO

------------------------------------------------------------------

Se encuentra ubicado en la carpeta "war" de este proyecto

-----------------------------------------------------------

AUTOR: GERMÁN JAIR GÓMEZ FIGUEREDO - CC: 1030637513