
import java.util.Scanner;

/**
 * Operaciones entre a y b
 * 
 * @author ISRAEL SEVERICHE 
 * @version 20190811
 */
public class operaciones
{
    public static void main(String[] args)
    {
        double num1,num2,suma,resta,producto,cociente,residuo,logaritmo,expo;
                
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Favor insertar el primer valor");
        num1=Teclado.nextDouble();
        
        System.out.println("Favor insertar el segundo valor");
        num2=Teclado.nextDouble();
        
        suma = num1+num2;
        resta = num1-num2;
        producto = num1*num2;
        cociente = num1/num2;
        residuo = num1%num2;
        logaritmo = Math.log(num1);
        expo = Math.pow(num1,num2);
        
        System.out.println("la suma de los 2 numeros es " + suma);
        System.out.println("la resta de los 2 numeros es " + resta);
        System.out.println("el producto de los 2 numeros es " + producto);
        System.out.println("el cociente de a entre b es " + cociente);
        System.out.println("el residuo de a entre b es " + residuo);
        System.out.println("el logaritmo del número es " + logaritmo);
        System.out.println("el exponencial es " + expo);
    }
}