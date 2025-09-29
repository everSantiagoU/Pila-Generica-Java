public class Main {
    public static void main(String[] args){
        Pila<Integer> pilaEnteros = new Pila<>();

        pilaEnteros.push(10);
        pilaEnteros.push(20);
        pilaEnteros.push(30);

        System.out.println("hola");
        System.out.println("Elemento sacado: " + pilaEnteros.pop());


    }
}
