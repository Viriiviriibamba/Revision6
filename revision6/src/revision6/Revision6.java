package revision6;
import java.util.Scanner; //Importación
public class Revision6 {
    public static void main(String[] args) {
        int[] n = new int[20]; // Inicialización del array int[] n = new int[20];

        for (int i = 0; i < 20; i++) { 
            n[i] = (int)(Math.random() * 381) + 20;
            System.out.print(n[i] + " ");
        }
        
        System.out.println("\n¿Qué números quiere resaltar?"); //Se ha corrección para imprimir los números generados.
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): "); //Se añadió System.out.println para una nueva línea después de imprimir los números generados.
        Scanner scanner = new Scanner(System.in); //Se añadió un Scanner para leer la opción del usuario y System.console().readLine() se ha reemplazó con Scanner.
        int opcion = Integer.parseInt(scanner.nextLine());

        int multiplo = (opcion == 1) ? 5 : 7; //Estructura condicional: int multiplo 

        for (int e : n) { //Se corrigió el bucle foreach para iterar.
        	if (e % multiplo == 0) {
                System.out.print("[" + e + "] ");
            } else {
                System.out.print(e + " ");
            }
        }
    }
}

