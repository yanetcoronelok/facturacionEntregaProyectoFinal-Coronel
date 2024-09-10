# Final project

Este documento detalla los endpoints disponibles en la aplicación de facturación. La aplicación gestiona Clientes, Productos y Ventas.

## Clientes

### Crear un Cliente (POST /clientes):
Este endpoint crea un nuevo cliente en el sistema.
Cuerpo de la solicitud: Un objeto JSON que representa el modelo Cliente. Campos obligatorios: nombre, apellido, email, direccion y dni.
Respuesta: El objeto Cliente creado con su ID recién generado.

### Obtener todos los Clientes (GET /clientes):
Este endpoint recupera una lista de todos los clientes en el sistema.
Respuesta: Un arreglo JSON que contiene objetos Cliente.

### Obtener un Cliente por ID (GET /clientes/{id}):
Este endpoint recupera un cliente específico por su ID.
Variable de ruta: {id} - El identificador único del cliente.
Respuesta: Un objeto JSON que representa el Cliente o un error 404 Not Found si el cliente no existe.

### Eliminar un Cliente (DELETE /clientes/{id}):
Este endpoint elimina un cliente del sistema.
Variable de ruta: {id} - El identificador único del cliente.
Respuesta: No hay contenido (código de estado 204) si la eliminación fue exitosa o un error 404 Not Found si el cliente no existe.

## Productos

### Crear un Producto (POST /productos):
Este endpoint crea un nuevo producto en el sistema.
Cuerpo de la solicitud: Un objeto JSON que representa el modelo Producto. Campos obligatorios: nombre, descripcion, precio y stock.
Respuesta: El objeto Producto creado con su ID recién generado.

### Obtener todos los Productos (GET /productos):
Este endpoint recupera una lista de todos los productos en el sistema.
Respuesta: Un arreglo JSON que contiene objetos Producto.

### Obtener un Producto por ID (GET /productos/{id}):
Este endpoint recupera un producto específico por su ID.
Variable de ruta: {id} - El identificador único del producto.
Respuesta: Un objeto JSON que representa el Producto o un error 404 Not Found si el producto no existe.

### Eliminar un Producto (DELETE /productos/{id}):
Este endpoint elimina un producto del sistema.
Variable de ruta: {id} - El identificador único del producto.
Respuesta: No hay contenido (código de estado 204) si la eliminación fue exitosa o un error 404 Not Found si el producto no existe.

## Ventas

### Crear una Venta (POST /ventas):
Este endpoint crea una nueva venta en el sistema.
Cuerpo de la solicitud: Un objeto JSON que representa el modelo VentaDto. Este DTO incluye el clienteId (ID del cliente asociado a la venta) y una lista de objetos VentaProductoDto que especifican los productos y sus cantidades dentro de la venta.
Respuesta: El objeto Venta creado con su ID recién generado si se crea correctamente o un error 400 Bad Request si hay errores de validación.

### Obtener todas las Ventas (GET /ventas):
Este endpoint recupera una lista de todas las ventas en el sistema.
Respuesta: Un arreglo JSON que contiene objetos Venta.

### Obtener una Venta por ID (GET /ventas/{id}):
Este endpoint recupera una venta específica por su ID.
Variable de ruta: {id} - El identificador único de la venta.
Respuesta: Un objeto JSON que representa la Venta o un error 404 Not Found si la venta no existe.

## Notas Adicionales
La API utiliza los métodos HTTP estándar (GET, POST, DELETE) para las operaciones CRUD.
Los códigos de estado de respuesta se utilizan para indicar el éxito (200 OK) o errores (por ejemplo, 400 Bad Request, 404 Not Found).
