import java.util.Scanner;

public class A1E5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //definir variables
        int Numero;
        int SiguienteNumero;
        
        //pedir un numero
        System.out.print("Ingrese un numero para darle el siguiente: ");
        Numero = scanner.nextInt();
        
        //hacer la operacion 
        SiguienteNumero = Numero + 1;

        System.out.println(SiguienteNumero + " es el siguiente numero de : " + Numero);
    }

}
