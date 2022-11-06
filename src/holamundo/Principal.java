
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        int cantEstaturas;
        double estatura;
        double acuEstaturas = 0;
        double promedio;
        /*boolean esDeDia = true;
        char elArroba = '@';
        String miNombre = "Carlos";*/
        
        cantEstaturas = (int) leerNumeroPositivo("¿Cuántas estaturas va a cargar?");
        
        for (int i = 1; i <= cantEstaturas; i++) {
            estatura = leerNumeroPositivo("Ingrese la estatura #" + i);
            acuEstaturas = acuEstaturas + estatura;
        }
        
        promedio = acuEstaturas / cantEstaturas;
        System.out.println("El promedio es " + promedio + " m.");
    } // Cierre del main
    
    static double leerNumeroPositivo(String mensaje) {
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        double numero = input.nextDouble();
        while (numero <= 0) {
            System.out.println("ERROR. " + mensaje);
            numero = input.nextDouble();
        }
        return numero;
    }

} // Cierre de la clase Principal
