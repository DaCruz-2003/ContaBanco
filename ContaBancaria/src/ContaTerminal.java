import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nome;
        double saldo;

    
    System.out.println("Digite seu nome: ");
    nome = scanner.nextLine();
    
    System.out.println("Digite a Agencia!");
    agencia = scanner.nextLine();

    System.out.println("Digite o Numero da Agencia");
    numero = scanner.nextInt();

    System.out.println("Digite o Saldo");
    saldo = scanner.nextFloat();

        System.out.println("Olá" + nome + ",obrigado por criar uma conta em nosso banco, sua agência é" + agencia + ",conta" + numero + "e seu saldo " + saldo + "já está disponível para saque");
        scanner.close();

    }
}