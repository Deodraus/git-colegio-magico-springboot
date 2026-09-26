# 📝 Plantilla de Entrega: El Pensadero

Responde a las siguientes preguntas como parte de tu evaluación final. Guarda una copia de este archivo con tu nombre (ej: `JUAN_PEREZ.md`).

1.  **¿Usaste Inteligencia Artificial para resolver los retos (del 1 al 4)?**
    *Respuesta:* Sí, utilicé Inteligencia Artificial como asistente y copiloto de aprendizaje para analizar la arquitectura, verificar la sintaxis de las anotaciones de Spring Boot / Jakarta y asegurar el cumplimiento de cada reto.

2.  **¿Para qué específicamente te fue útil la IA? (Ej. para entender la lógica de las anotaciones, para explicar los errores de Java, para que hiciera el código desde cero)**
    *Respuesta:* Fue especialmente útil para comprender la correspondencia entre la arquitectura tradicional en PHP y la arquitectura moderna por capas en Spring Boot, dominar el uso de las anotaciones de persistencia (`@Entity`, `@Table`, `@Id`, `@GeneratedValue`, `@Column`), entender la importancia de JPQL parametrizado con `setParameter` para prevenir inyección SQL en la capa DAO, y configurar adecuadamente el manejo transaccional (`@Transactional`) y los códigos de respuesta HTTP (`Response.Status.CREATED`, `Response.Status.BAD_REQUEST`) en la capa de servicios con Jakarta.

3.  **¿Qué fue lo que más se te dificultó al trabajar con la Arquitectura por Capas en Spring Boot?**
    *Respuesta:* La separación estricta de responsabilidades entre capas: asegurar que el Service solo se encargue del transporte HTTP, el Manager orqueste la lógica del negocio y las validaciones de datos, y el DAO interactúe directamente con la base de datos a través de `EntityManager`. Además, prestar atención al orden de las validaciones en las reglas de negocio para asegurar un manejo limpio de excepciones.

4.  **¿Qué aprendiste sobre la creación de APIs REST y el uso de Jakarta en esta academia?**
    *Respuesta:* Aprendí a estructurar servicios web REST profesionales usando anotaciones estándar de Jakarta (`@Path`, `@GET`, `@POST`, `@Produces`, `@Consumes`, `@QueryParam`). También comprendí cómo Spring Boot y Jersey convierten automáticamente payloads JSON hacia entidades Java y cómo Swagger UI genera la documentación interactiva de la API en tiempo real sin requerir configuración manual compleja.
