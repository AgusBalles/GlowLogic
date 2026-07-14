# 📒 Bitácora de Desarrollo - GlowLogic

## Información del proyecto

**Nombre:** GlowLogic

**Descripción:**

GlowLogic es una aplicación web orientada a la gestión de colecciones personales de maquillaje. 
Permite a los usuarios organizar sus productos, controlar información como fechas de vencimiento, nivel de uso, favoritos y crear looks utilizando su colección.

**Objetivo:**

Desarrollar una aplicación Full Stack que permita administrar una colección de maquillaje de forma visual, organizada y sencilla, aplicando buenas prácticas de desarrollo de software.

---

# Decisiones de Diseño

## Decisión #001 - Productos personalizados por usuario

**Fecha:** 14/07/2026

**Decisión:**

Cada usuario podrá crear y administrar sus propios productos de maquillaje.

**Motivo:**

Se descartó utilizar un catálogo global de productos debido a la complejidad que implicaría mantenerlo. 
Esta alternativa permite mayor flexibilidad y simplifica el desarrollo inicial.

---

## Decisión #002 - Productos con imagen

**Fecha:** 14/07/2026

**Decisión:**

Cada producto podrá tener una fotografía.

**Motivo:**

Permite una experiencia más visual y atractiva para el usuario, diferenciando la aplicación de un sistema CRUD tradicional.

---

## Decisión #003 - Vista de productos

**Fecha:** 14/07/2026

**Decisión:**

La aplicación contará con dos formas de visualizar los productos:

- Vista galería.
- Vista lista.

**Motivo:**

La vista galería mejora la experiencia visual, mientras que la vista lista facilita la gestión y búsqueda de información.

---

## Decisión #004 - Categoría de productos

**Fecha:** 14/07/2026

**Decisión:**

Cada producto tendrá una única categoría.

**Motivo:**

Mantiene el modelo simple y permite una clasificación clara para filtros y búsquedas.

---

## Decisión #005 - Creación de marcas

**Fecha:** 14/07/2026

**Decisión:**

Los usuarios podrán agregar nuevas marcas si estas no existen.

**Motivo:**

Permite registrar marcas pequeñas o productos que no estén dentro de una lista predefinida.

---

## Decisión #006 - Módulo de Looks

**Fecha:** 14/07/2026

**Decisión:**

GlowLogic permitirá crear looks de maquillaje asociados a productos registrados.

**Motivo:**

Agregar esta funcionalidad entrega mayor valor al usuario, permitiendo organizar combinaciones de productos y rutinas.

---

## Decisión #007 - Productos terminados como historial

**Fecha:** 14/07/2026

**Decisión:**

Los productos terminados no serán eliminados del sistema.

**Motivo:**

Mantener estos productos permitirá generar estadísticas futuras sobre consumo, productos utilizados y hábitos del usuario.

---

# Funcionalidades futuras

## Módulo de compras

**Estado:** Planificado para versión futura.

**Descripción:**

Permitirá registrar compras realizadas, tiendas, gastos y generar estadísticas más avanzadas.



**Motivo de postergación:**

Se mantendrá fuera de la primera versión para controlar el alcance del MVP.


## Decisión #008 - Información del usuario

**Fecha:** 14/07/2026

**Decisión:**

Mantener el perfil de usuario con la información esencial.
Campos iniciales:

Nombre.
Correo.
Contraseña.
Fecha de creación.

**Motivo:**

Evitar agregar información innecesaria en la primera versión y mantener el sistema simple.
---

## Decisión #009 - Calificación de productos

**Fecha:** 14/07/2026

**Decisión:**

Cambiar el campo clasificacion por calificacion.

**Motivo:**

El concepto es más claro para el usuario y representa mejor la valoración personal del producto.
---

## Decisión #010 - Nivel de uso

**Fecha:** 14/07/2026

**Decisión:**

El usuario verá niveles de uso amigables en lugar de porcentajes directos.

Opciones:
Nuevo.
Poco usado.
En uso.
Casi terminado.
Terminado.

**Motivo:**

Es más intuitivo para una aplicación orientada a usuarios finales.
---
## Decisión #011 - Marcas compartidas

**Fecha:** 14/07/2026

**Decisión:**

Las marcas serán compartidas entre todos los usuarios de la aplicación.

**Motivo:**

Una marca representa información general de un producto y no pertenece a un usuario específico. 
Mantenerlas compartidas evita la duplicación de información y permite reutilizar marcas existentes dentro del sistema.

**Ejemplo:**

Una marca como "Maybelline" podrá ser utilizada por diferentes usuarios sin necesidad de crear registros duplicados.

---

## Decisión #012 - Categorías predefinidas

**Fecha:** 14/07/2026

**Decisión:**

Las categorías de productos serán administradas por el sistema y estarán predefinidas.

Ejemplos:

- Base
- Corrector
- Rubor
- Polvo
- Iluminador
- Labial
- Sombras
- Máscara de pestañas
- Delineador
- Brochas
- Skincare
- Otros

**Motivo:**

Mantener categorías controladas permite una clasificación consistente de los productos, facilita las búsquedas y evita la creación de categorías duplicadas o similares por parte de los usuarios.

---

## Decisión #013 - Implementación de categorías mediante tabla independiente

**Fecha:** 14/07/2026

**Decisión:**

Las categorías serán almacenadas en una tabla propia dentro de la base de datos y los productos tendrán una referencia hacia dicha tabla mediante una clave foránea.

**Modelo:**

Categoría:

- id
- nombre

Producto:

- categoria_id
## Decisión #014 - Gestión de Wishlist

**Fecha:** 14/07/2026

**Decisión:**

La lista de deseos permitirá guardar productos que el usuario desea adquirir en el futuro.

**Modelo:**

La Wishlist tendrá una relación entre Usuario y Producto, permitiendo almacenar la fecha en que un producto fue agregado.

**Motivo:**

Permite gestionar productos deseados sin perder información y facilita futuras mejoras como prioridades o conversión de wishlist a colección.

---

## Decisión #015 - Creación de Looks de maquillaje

**Fecha:** 14/07/2026

**Decisión:**

Los usuarios podrán crear looks personalizados asociados a productos de su colección.

Cada look tendrá:

- Nombre.
- Descripción.
- Imagen.
- Favorito.
- Fecha de creación.

**Motivo:**

Esta funcionalidad entrega un valor adicional al usuario, permitiendo organizar combinaciones de productos y rutinas de maquillaje.

---

## Decisión #016 - Relación entre Looks y Productos

**Fecha:** 14/07/2026

**Decisión:**

Los looks podrán contener múltiples productos y un producto podrá pertenecer a múltiples looks.

Para representar esta relación muchos a muchos se utilizará una entidad intermedia llamada LookProducto.

**Motivo:**

Permite reutilizar productos en diferentes looks y mantiene un modelo de datos normalizado.

**Motivo:**

Aunque las categorías serán fijas, mantenerlas como una entidad independiente permite un diseño más escalable, facilita futuras modificaciones y sigue buenas prácticas de modelado relacional.


## Decisión #017 - Ubicación de productos

**Fecha:** 14/07/2026

**Decisión:**

La ubicación de los productos será almacenada como texto libre.

Ejemplos:

- Tocador.
- Cajón de maquillaje.
- Neceser.
- Bolso de viaje.
- Cajón personalizado.

**Motivo:**

Cada usuario puede organizar sus productos de diferentes maneras. Permitir una ubicación personalizada entrega mayor flexibilidad y evita limitar al usuario a opciones predefinidas.

---

## Decisión #018 - Prioridad en Wishlist

**Fecha:** 14/07/2026

**Decisión:**

La lista de deseos no contará con un sistema de prioridades en la primera versión del proyecto.

**Motivo:**

Aunque puede ser una funcionalidad útil, no es necesaria para el funcionamiento principal del MVP. Se mantiene fuera del alcance inicial para reducir complejidad y enfocarnos en las funcionalidades principales.

---

## Decisión #019 - Notas personales en productos

**Fecha:** 14/07/2026

**Decisión:**

Los productos no tendrán un campo de notas personales en la primera versión.

**Motivo:**

Esta funcionalidad puede ser incorporada en futuras versiones, pero no es esencial para la gestión principal de la colección de maquillaje.


## Decisión #020 - Relación muchos a muchos entre Looks y Productos

**Fecha:** 14/07/2026

**Decisión:**

Se implementará una tabla intermedia llamada `LookProduct` para representar la relación entre los looks y los productos.

**Motivo:**

Un look puede contener múltiples productos y un mismo producto puede formar parte de distintos looks. La utilización de una tabla intermedia permite mantener un modelo de datos normalizado y escalable.
