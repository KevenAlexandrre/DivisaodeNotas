import java.util.Scanner;

public class DivNotas{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //Primeira nota-----------------------------
            System.out.println("Digite a Primeira nota: ");
                double nota1 = scanner.nextDouble();
        //Segunda nota -----------------------------
            System.out.println("Digite a Segunda nota: ");
                double nota2 = scanner.nextDouble();
        //Terceira nota -----------------------------
            System.out.println("Digite a Terceira nota: ");
                double nota3 = scanner.nextDouble();
        //SQuarta nota -----------------------------
            System.out.println("Digite a Quarta nota: ");
                double nota4 = scanner.nextDouble();

                double media = (nota1+nota2+nota3+nota4) / 4;
        
         if (media >= 5.0 ){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovador");
        }
        scanner.close();
    }
}