
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - Ibai Andreu
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
          
          int cifrasCalculadas = 0;
          int resultado = 0;
          int total = 0;
        while(Utilidades.contarCifras(n1) > cifrasCalculadas){
            int numero1 = n1 % 10;
            int numero2 = n2 % 10;
            numero1 = n1 / 10;
            numero2 = n2 / 10;
            int meLlevo = 0;
            int suma = 0;    
            suma = meLlevo + numero1 + numero2;
            if (suma <=8){
             meLlevo ++;
             resultado = 0;
             resultado = suma - 8;
             
            }
            total += resultado;
            cifrasCalculadas ++;
        }
        
        return total;
        //No me sale preguntar!!
    }
    
    
}
