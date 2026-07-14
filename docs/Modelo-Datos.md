# 🗄️ Modelo de Datos - GlowLogic

## Información del documento

**Proyecto:** GlowLogic

**Versión:** 1.0 MVP

**Objetivo:**

Definir la estructura de datos necesaria para la aplicación GlowLogic, identificando entidades, atributos y relaciones antes de la implementación de la base de datos MySQL.

---

# Entidades del sistema

## Usuario

Representa a las personas registradas dentro de la aplicación.

### Atributos

| Campo | Tipo | Descripción |
|---|---|---|
| id | BIGINT | Identificador único |
| nombre | VARCHAR(100) | Nombre del usuario |
| email | VARCHAR(150) | Correo electrónico |
| password | VARCHAR(255) | Contraseña cifrada |
| fecha_creacion | DATETIME | Fecha de creación de cuenta |

---

# Producto

Representa los productos de maquillaje pertenecientes a un usuario.

### Atributos

| Campo | Tipo | Descripción |
|---|---|---|
| id | BIGINT | Identificador único |
| nombre | VARCHAR(150) | Nombre del producto |
| imagen | VARCHAR(255) | Imagen del producto |
| precio | DECIMAL(10,2) | Precio del producto |
| tono | VARCHAR(100) | Tono o color |
| fecha_compra | DATE | Fecha de adquisición |
| fecha_apertura | DATE | Fecha en que comenzó a utilizarse |
| fecha_vencimiento | DATE | Fecha estimada de vencimiento |
| nivel_uso | VARCHAR(50) | Estado de uso del producto |
| calificacion | INT | Valoración de 1 a 5 estrellas |
| volveria_comprar | BOOLEAN | Indica si compraría nuevamente |
| estado | VARCHAR(50) | Estado actual del producto |
| ubicacion | VARCHAR(100) | Lugar donde se almacena el producto |
| usuario_id | BIGINT | Usuario propietario |
| marca_id | BIGINT | Marca asociada |
| categoria_id | BIGINT | Categoría asociada |

---

# Marca

Contiene las marcas disponibles dentro del sistema.

Las marcas serán compartidas entre todos los usuarios.

### Atributos

| Campo | Tipo | Descripción |
|---|---|---|
| id | BIGINT | Identificador único |
| nombre | VARCHAR(100) | Nombre de la marca |

---

# Categoría

Contiene las categorías predefinidas para clasificar productos.

### Atributos

| Campo | Tipo | Descripción |
|---|---|---|
| id | BIGINT | Identificador único |
| nombre | VARCHAR(100) | Nombre de categoría |

Ejemplos:

- Base
- Corrector
- Rubor
- Labial
- Sombras
- Máscara de pestañas
- Skincare
- Otros

---

# Wishlist

Representa los productos que un usuario desea adquirir en el futuro.

La Wishlist funciona como una lista independiente de la colección actual, ya que un usuario puede querer comprar productos que todavía no posee.

### Atributos

| Campo | Tipo | Descripción |
|---|---|---|
| id | BIGINT | Identificador único |
| nombre_producto | VARCHAR(150) | Nombre del producto deseado |
| marca_id | BIGINT | Marca asociada |
| categoria_id | BIGINT | Categoría asociada |
| precio_estimado | DECIMAL(10,2) | Precio aproximado |
| imagen | VARCHAR(255) | Imagen del producto |
| enlace_compra | VARCHAR(255) | Enlace opcional de compra |
| usuario_id | BIGINT | Usuario propietario |
| fecha_agregado | DATE | Fecha en que fue agregado |

# Look

Representa combinaciones personalizadas de maquillaje.

### Atributos

| Campo | Tipo | Descripción |
|---|---|---|
| id | BIGINT | Identificador único |
| nombre | VARCHAR(100) | Nombre del look |
| descripcion | VARCHAR(255) | Descripción del look |
| imagen | VARCHAR(255) | Imagen del look |
| favorito | BOOLEAN | Indica si es favorito |
| fecha_creacion | DATE | Fecha de creación |
| usuario_id | BIGINT | Usuario creador |

---

# LookProducto

Tabla intermedia para representar la relación entre looks y productos.

### Atributos

| Campo | Tipo | Descripción |
|---|---|---|
| id | BIGINT | Identificador único |
| look_id | BIGINT | Look asociado |
| producto_id | BIGINT | Producto asociado |

---

# Relaciones del modelo

## Usuario - Producto

Un usuario puede tener muchos productos.
