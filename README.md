# TP-1-Threads
TP 1 Threads en Java

-> Cuantos consumidores se necesitan para que llegue a 0? 
- Depende de que thread arranque primero. En mi caso, como di una ejecucion de gracia para el productor, se necesitaran instanciar y ejecutar al menos dos consumidores por cada productor.\
-> Bloques synchronized, porque deben serlo? 
- Para que la totalidad del metodo se ejecute de manera atomica a la hora de modificar el recurso compartido por los threads
Explique el recurso compartido
- El recurso es un objeto que tienen en comun los threads. Cada thread intentara modificar este objeto segun la logica y responsabilidades de los mismos.
-> Explicar las 3 formas de instanciar un thread.
- Implementar la interfaz Runnable, sobrescribir el metodo run() y pasarselo al Constructor de la clase Thread: solucion para la falta de herencia multiple en el lenguaje.
- Extender la clase Thread y sobrescribir el metodo run().
- Implementar la interfaz Callable y pasarselo a un objeto del tipo Executor, a diferencia de run() de la interfaz Runnable el metododo a sobreescribir (call) puede devolver un valor.
