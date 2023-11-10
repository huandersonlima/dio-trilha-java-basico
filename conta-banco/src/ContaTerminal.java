import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();
        System.out.println("Informe o número da agência:");
        String agencia = sc.nextLine();
        System.out.println("Informa o número da conta:");
        int num = sc.nextInt();
        System.out.println("Informe seu saldo:");
        double saldo = sc.nextDouble();
        sc.close();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque",nome,agencia,num,saldo);
    }
}
