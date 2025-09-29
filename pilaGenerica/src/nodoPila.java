public class NodoPila<T> {
    NodoPila<T> siguiente;
    T valorNodo;

    public NodoPila(T valorNodo){
        this.valorNodo = valorNodo;
        this.siguiente = null;
    }

}
