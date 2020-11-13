import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - Ibai Andreu
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        char si = 's';
        while(si == 's' || si == 'S'){
            System.out.println('\u000C');
            System.out.print("Teclee número1: ");
            int numero1 = teclado.nextInt();
            System.out.print("Teclee número2: ");
            int numero2 = teclado.nextInt();
            if(Utilidades. estaEnOctal(numero1) && Utilidades.estaEnOctal(numero2)){
                if(Utilidades.contarCifras(numero1) == Utilidades.contarCifras(numero2)){
                    System.out.println("----------------------------------------------");
                    System.out.printf("%30", numero1);
                    System.out.printf("%30", numero2);
                    System.out.printf("%15 %30" , "Suma octal: ", calculadora.sumarEnOctal(numero1, numero2));
                }
                else{
                    System.out.println("No tiene el mismo nº de cifras.");
                }
            }
            else{
                System.out.println("Alguno de los numeros no esta en octal.");
            }
            System.out.println("Quiere hacer otra suma en octal? (S/s)");
            si = teclado.nextLine().charAt(0);//se me para aquí no encuentro el error.
        }
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        System.out.println("Ahora dibujara una figura.");
        System.out.println("Altura de la figura? (1-10)");
        int altura = teclado.nextInt();
        while(altura < 1 || altura > 10){
            System.out.println("Error, altura de la figura? (1-10)");
            altura = teclado.nextInt();
        }
        pintor.dibujarFigura(altura);
    }

}
