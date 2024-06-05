import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = lerInteiro(terminal);
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = lerInteiro(terminal);

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        } catch (InputMismatchException e) {
        System.out.println("Entrada inválida. Digite números inteiros.");
        } finally {
            terminal.close();
        }

    }
    private static int lerInteiro(Scanner terminal) {
        while (!terminal.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um número inteiro:");
            terminal.next();
        }
        return terminal.nextInt();
    }
    public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
