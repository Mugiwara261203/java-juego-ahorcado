import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Clase Scanner para poder escribir
        Scanner scanner = new Scanner(System.in);

        // Declaraciones de variables
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // Areglos:
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        // Estructura de control: Iterativa (Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            System.out.println(letrasAdivinadas[i]);
        }

        // Estructura de control: Iterativa (Bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                        // Esto se usa cuando tenemos una palabra de chars(letras)
            System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor: ");
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control: Iterativa (Bucle)
            for (int i = 0; i < palabraSecreta.length(); i++) {
                // Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrect! Te quedan " + (intentosMaximos - intentos) + " intentos");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades, has adivinado la palabra secreta: "+ palabraSecreta);

            }
        }

        if(!palabraAdivinada){
            System.out.println("¡Que pena, te has quedado sin intentos! GAME OVER");
        }
        
        scanner.close();
    }
}
