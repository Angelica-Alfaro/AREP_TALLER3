# Escuela Colombiana de Ingeniería Julio Garavito

# Servidor Web con Framework IoC

#### Autor🙎
> - María Angélica Alfaro Fandiño

#### 🔎 Descripción
Construcción de un servidor(tipo Apache) usando solo Java y librerías para manejo de la red, que soporta múltiples solicitudes seguidas (no concurrentes). El servidor está desplegado en HEROKU y retorna todos los archivos solicitados, incluyendo páginas html e imágenes. También, el servidor cuenta con un framework IoC para la construcción de aplicaciones web a partir de POJOS.

#### 💡 Usos
El servidor web tiene la capacidad de entender recursos diversos como: .html, .css, .js, .png para ser leidos por el cliente.Algunos ejemplos de los recursos que se pueden acceder desde el navegador son:

- [Sin recurso](https://myframework-ioc.herokuapp.com/)
- [.html](https://myframework-ioc.herokuapp.com/index.html)
- [.js](https://myframework-ioc.herokuapp.com/js/app.js)
- [.css](https://myframework-ioc.herokuapp.com/css/style.css)
- [.png](https://myframework-ioc.herokuapp.com/js/app.js/mafalda.png)

Ejemplos de acceso a componentes del Framework:

Usando el POJO Controller, se puede acceder:
- [/api/sentence](https://myframework-ioc.herokuapp.com/api/sentence) que muestra en pantalla una frase.
- [/api/personajes](https://myframework-ioc.herokuapp.com/api/personajes) que muestra en pantalla un imagen obtenida desde internet.

### 📜 Arquitectura y Diseño detallado
El Framework desarollado está compuesto de:

- Meta-Protocolos de Objetos
- Reflexión
- Anotaciones
- POJO





