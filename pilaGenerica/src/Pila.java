public class Pila <T>{
    NodoPila<T> primero;

    public void push(T valorNodo){
        NodoPila<T> nuevoNodo = new NodoPila<>(valorNodo);
        
        if (primero == null){ //caso en el que la pila esta vacia y este es el primer nodo
            nuevoNodo.siguiente = null;
            primero = nuevoNodo;
        }else{ // caso en el que ya hay nodos, lo enlazamos con el primero y ahora el nuevo es el siguiente
            nuevoNodo.siguiente = primero;
            primero = nuevoNodo;
        }
    }

    public T pop(){
        if (primero == null){ // verificamos que la pila tenga elementos
            System.out.println("la pila esta vacia. No hay nodos para eliminar");
            return null;
        }
        T valor = primero.valorNodo;
        primero = primero.siguiente;
        return valor;
        }

    public T peek(){
        if (primero == null){ //verificar que hayan nodos en la pila
            return null;
        }
        return primero.valorNodo; // de ser asi, retornamos el primero sin eliminarlo
    }

    public boolean isEmpty(){
        return primero == null;
    }

    public int size(){
        int contador = 0;
        NodoPila<T> temporal = primero;
        while (temporal != null){
            contador ++;
            temporal = temporal.siguiente;
        }
        return contador;
    }

    }

