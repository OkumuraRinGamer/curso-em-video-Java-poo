package aula05;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        // Nome do objeto ContaBanco
        // Ver estado da conta estadoAtual()
        // Abrir conta abrirConta("t") "t = CC conta corrente" "t = CP conta poupança"
        // Fechar conta fecharConta()
        // Depositos depositar(v) "v = valor a ser depositado"
        // Saques sacar(v) "v = valor a ser sacado"
        // Pagar mensalidade pagarMensal()
        String CriarConta;
        String nome;
        String conta;
        int numConta;
        int escolha;
        float depositar;
        float sacar;
        String continuar = "S";
        Scanner teclado = new Scanner(System.in);
        System.out.print("Olá gostaria de criar uma conta? S/N ");
        CriarConta = teclado.next();
        if ("S".equals(CriarConta)) {
            ContaBanco c1 = new ContaBanco();
            System.out.print("Qual é seu nome? ");
            nome = teclado.next();
            c1.setDono(nome);
            System.out.println("Gostaria de abirr uma conta: ");
            System.out.println("CC - Corrente");
            System.out.println("CP - Poupança");
            conta = teclado.next();
            c1.abrirConta(conta);
            System.out.print("Qual é o número da conta? ");
            numConta = teclado.nextInt();
            c1.setNumConta(numConta);
            System.out.println("Sua conta foi criada com sucesso! estes são os dados:");
            c1.estadoAtual();
            while("S".equals(continuar)) {
                System.out.println("O que gostaria de fazer? ");
                System.out.println("1 - Depositar.");
                System.out.println("2 - Sacar.");
                System.out.println("3 - Pagar Mensalidade.");
                System.out.println("4 - Fechar conta.");
                System.out.println("5 - Estado da conta.");
                System.out.println("6 - Sair.");
                escolha = teclado.nextInt();
                switch(escolha){
                    case 1:
                        System.out.print("Digite o valor a ser depositado: ");
                        depositar = teclado.nextFloat();
                        c1.depositar(depositar);
                        break;
                    case 2:
                        System.out.print("Digite o valor para ser sacado: ");
                        sacar = teclado.nextFloat();
                        c1.sacar(sacar);
                        break;
                    case 3:
                        c1.pagarMensal();
                        break;
                    case 4:
                        c1.fecharConta();
                        break;
                    case 5:
                        c1.estadoAtual();
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Escolha uma opção válida!");
                }
                System.out.print("Gostaria de continuar? S/N ");
                continuar = teclado.next();
            }
        } else {
            System.out.println("Encerrando programa...");
        }
    }
}
