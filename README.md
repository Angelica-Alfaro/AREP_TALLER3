# Escuela Colombiana de Ingeniería Julio Garavito

# Servidor Web con Framework IoC

#### Autor🙎
> - María Angélica Alfaro Fandiño

#### 🔎 Descripción
Construcción de un servidor(tipo Apache) usando solo Java y librerías para manejo de la red, que soporta múltiples solicitudes seguidas (no concurrentes). El servidor está desplegado en HEROKU y retorna todos los archivos solicitados, incluyendo páginas html e imágenes. También, el servidor cuenta con un framework IoC para la construcción de aplicaciones web a partir de POJOS.

#### 💡 Usos
El servidor web tiene la capacidad de entender recursos diversos como: .html, .css, .js, .png para ser leidos por el cliente.Algunos ejemplos de los recursos que se pueden acceder desde el navegador son:

- [Sin recurso](https://webserver-client-server.herokuapp.com)
- [.html](https://webserver-client-server.herokuapp.com/index.html)
- [.js](https://webserver-client-server.herokuapp.com/js/app.js)
- [.css](https://webserver-client-server.herokuapp.com/css/style.css)
- [.png](https://webserver-client-server.herokuapp.com/mafalda.png)

Ejemplos de acceso a componentes del Framework:

Usando el POJO Controller, se puede acceder:
- [/api/sentence] que muestra en pantalla una frase.
- [/api/personajes ] que muestra en pantalla un imagen desde internet.

### 📜 Arquitectura y Diseño detallado
El Framework desarollado está compuesto de:

- Meta-Protocolos de Objetos
- Reflexión
- Anotaciones
- POJO





