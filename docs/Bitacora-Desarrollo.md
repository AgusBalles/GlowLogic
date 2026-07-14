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
