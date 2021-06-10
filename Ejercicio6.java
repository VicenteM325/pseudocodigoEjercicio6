import java.util.Scanner;

    public class Ejercicio6{
        public static void main(String[] args){
            int suma1 = 0, suma2 = 0, a = 0, b = 0, i = 1;
            double promedio1, promedio2;
            while(i <= 100){
                 int aleatorio = (int)(Math.random()*100+1);
                 System.out.println(aleatorio + "");
                 if(aleatorio < 25){
                     suma1 = suma1+ aleatorio;
                     a = a+1;
                 }
                 if(aleatorio >= 25){
                     suma2 = suma2+aleatorio;
                     b = b+1;
                 }
                 i = i+1;

            }
            promedio1 = suma1/a;
            promedio2 = suma2/b;
            System.out.println("Personas con menos de 25 años = " + a );
            System.out.println("Personas con mas de 25 años = " + b );
            System.out.println("El promedio de personas con menos de 25 años es = " + promedio1);
            System.out.println("El promedio de personas con mas de 25 años es = " + promedio2);
        }
    }