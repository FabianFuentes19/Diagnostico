import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma=0;
        int numero ;
        do {

            System.out.println("ingresa un numero: ");
            numero = sc.nextInt();

            if (numero!=0){
                System.out.println("numero ingresado: "+numero);
                suma+=numero;

            }

        } while (numero != 0);
        System.out.println("el totaL es: "+suma);
    }
}