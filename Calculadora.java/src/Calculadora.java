// Importando a classe Scanner para ler a entrada do teclado.

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("=======================================");
        System.out.println("            CALCULADORA JAVA           ");
        System.out.println("=======================================");
        int opcao = -1; //Variavel de controle de opçao

        do {
            System.out.println("\n--- Menu de Operações ---");
            System.out.println("1 - Adição (+)");
            System.out.println("2 - Subtração (-)");
            System.out.println("3 - Multiplicação (*)");
            System.out.println("4 - Divisão (/)");
            System.out.println("5 - Sair");
            System.out.println("Escolha a operação (1-4) ou 0 para sair.");

            //Tente ler a opçao escolhida
            if (scan.hasNextInt()) {
                opcao = scan.nextInt();
            } else {
                System.out.println("❌ Entrada Inválida. Por favor, digite um número");
                scan.next(); // Limpa a entrada inválida do buffer do scanner
                continue; //Volta para o ínicio do loop
            }

            //Se a opção for sair. e finalizar a calculadora
            if (opcao == 5) {
                break; //para o processo e sai fora, termina o loop
            }

            // Se a opção for de 1 - 4 pede os números

            if (opcao >= 1 && opcao <= 4) {
                System.out.println("Digite o primeiro  número");
                double num1 = scan.nextDouble();

                System.out.println("Digite o segundo  número");
                double num2 = scan.nextDouble();

                double resultado = 0; // Variável para armazenar o resultado final

                // Estrutura SWITCH: Executa o código específico baseado na 'opcao'

                switch (opcao) {
                    case 1:
                        resultado = num1 + num2; // Operador Aritmético (+)
                        System.out.println("Resultado da Adição: " + resultado);
                        break;

                    case 2:
                        resultado = num1 - num2; // Operador Aritmético (-)
                        System.out.println("Resultado da Subtração: " + resultado);
                        break;

                    case 3:
                        resultado = num1 * num2; // Operador Aritmético (*)
                        System.out.println("Resultado da Multiplicação: " + resultado);
                        break;

                    case 4:
                        // Verificação de erro: Divisão por zero (Operador Relacional !=)
                        if (num2 != 0) {
                            resultado = num1 / num2; // Operador Aritmético (/)
                            System.out.println("Resultado da Divisão: " + resultado);
                        } else {
                            System.out.println("⚠ Erro: Divisão por zero não é permitida.");
                        }
                        break;

                    default:

                        // Não deve acontecer, mas é uma segurança extra
                        System.out.println("❌ Opção inválida. ");
                }
            } else {
                System.out.println("❌ Opção fora do intervalo. Escolha entre 0 e 4.");
            }

        } while (opcao != 0); // Repete enquanto a opção for diferente de 0
        System.out.println("\nCalculadora encerrada. Até mais!");
        scan.close(); // Boa prática: Fecha o Scanner ao finalizar o programa
    }
}
