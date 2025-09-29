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
        if (primero == null){
            System.out.println("la pila esta vacia. No hay nodos para eliminar");
            return null;
        }
        T valor = primero.valorNodo;
        primero = primero.siguiente;
        return valor;
        }
    }

