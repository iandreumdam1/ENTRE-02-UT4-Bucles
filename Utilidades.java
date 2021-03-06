import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - Ibai Andreu
 */
public class Utilidades
{

    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
        boolean octal = false;
        while(n != 0){
            if((n % 10) >= 0 && (n % 10) <= 7){
                octal = true;
            }
            n /= 10;
        }
        
        return octal;

    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        int contador = 0;
        while(n != 0){
          contador ++;
          n /= 10;
        }
        
        return contador;
    }

   
    
}
