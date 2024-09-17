import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor = 0;
        int somatoral = 0;


        while ( valor !=99 ){
       //   System.out.println(valor); valor++; // ou colocar valor = valor +1

            System.out.println("Informe o   valor:");
            System.out.println("Informe 99 para sair.");
            valor = sc.nextInt();
            somatoral += valor;


        }
        System.out.println("Total é: " + somatoral);


    }
}