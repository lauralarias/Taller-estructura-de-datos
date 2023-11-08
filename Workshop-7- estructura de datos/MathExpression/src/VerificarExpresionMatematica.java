import java.util.Stack;

public class VerificarExpresionMatematica {
    public static boolean esExpresionValida(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : expresion.toCharArray()) {
            if (caracter == '(' || caracter == '[' || caracter == '{') {
                pila.push(caracter);
            } else if (caracter == ')' || caracter == ']' || caracter == '}') {
                if (pila.isEmpty() || !esParValido(pila.pop(), caracter)) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }

    private static boolean esParValido(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
                (apertura == '[' && cierre == ']') ||
                (apertura == '{' && cierre == '}');
    }

    public static void main(String[] args) {
        String expresionValida = "(3 + 2) * [5 - (2 + 1)]";
        String expresionNoValida = "5 * (2 + 1";

        if (esExpresionValida(expresionValida)) {
            System.out.println("La expresión es válida.");
        } else {
            System.out.println("La expresión no es válida.");
        }

        if (esExpresionValida(expresionNoValida)) {
            System.out.println("La expresión es válida.");
        } else {
            System.out.println("La expresión no es válida.");
        }
    }
}
