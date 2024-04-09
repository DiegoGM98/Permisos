Gestion de permisos municipales

Clases Principales:
El programa define varias clases principales que representan los elementos fundamentales del sistema, como Ciudadano, PermisoMunicipal, SolicitudPermiso, y las subclases específicas de permisos como NegocioPermiso, ConstruccionPermiso y EventoEspecialPermiso.

Funciones del Main:
El Main del programa maneja la interacción con el usuario a través de la consola. Ofrece un menú con varias opciones, como registrar ciudadanos, registrar permisos, buscar permisos por tipo, fecha de emisión o fecha de vencimiento, y salir del programa.

Registro de Ciudadanos y Permisos:
Los métodos registrarCiudadano() y registrarPermiso() permiten al usuario ingresar los datos de un nuevo ciudadano o permiso, respectivamente, y los almacenan en las listas correspondientes.

Búsqueda de Permisos:
Los métodos buscarPermisosPorTipo(), buscarPermisosPorFechaEmision() y buscarPermisosPorFechaVencimiento() permiten al usuario buscar permisos en función de diferentes criterios y muestran los detalles de los permisos encontrados.

Cálculo de Tarifa:
El método calcularTarifa() calcula la tarifa de un permiso según su tipo y detalles específicos. La tarifa se muestra en pesos chilenos.

Formato de Tarifa:
Se utiliza un objeto DecimalFormat para formatear la tarifa en pesos chilenos y mostrarla correctamente al usuario.