public class Main {
    public static void main(String[] args){
        //prueba del balanceador
        String expresion1 = "{[()]}";
        String expresion2 = "{[(])}";
        String expresion3 = "((()))";
        String expresion4 = "(()";

        System.out.println(expresion1 + " -> " + Balanceador.estanBalanceados(expresion1));
        System.out.println(expresion2 + " -> " + Balanceador.estanBalanceados(expresion2));
        System.out.println(expresion3 + " -> " + Balanceador.estanBalanceados(expresion3));
        System.out.println(expresion4 + " -> " + Balanceador.estanBalanceados(expresion4));

    }
}
