public class Balanceador {
    public static boolean estanBalanceados(String expresion) {
        Pila<Character> pila = new Pila<>();
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            //si es parentesis abierto se apila
            if (c == '(' || c == '{' || c == '[') {
                pila.push(c);
            }
            //si es parentesis cerraod se quita
            else if (c == ')' || c == '}' || c == ']') {
                if (pila.isEmpty()) {
                    return false; // hay cierre sin apertura
                }
                char tope = pila.pop(); // sacamos el de ariba de la pila
                if (!esParCorrecto(tope, c)) {
                    return false; // apertura y cierre no coinciden
                }
            } 
        }
        return pila.isEmpty();   
    }

    private static boolean esParCorrecto(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
               (apertura == '{' && cierre == '}') ||
               (apertura == '[' && cierre == ']');
    }


}
