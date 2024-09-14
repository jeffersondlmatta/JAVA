import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
//ToDo:
//conhecer e importar a class scanner
//Exibir a mgm para o usuario
//ler os valores digitados no terminal
//exibir a mensagem conta criada
// **implementei um medoto que gera um numero de conta aleatorio.

public class ContaBanco {

    static String agencia = "1";
    String nome;
    static int NumConta = GerarNumConta();;
    double saldo;

    public ContaBanco(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        this.NumConta = GerarNumConta(); // metodo que cria um numero aleatorio
    }

    private static int GerarNumConta() {
        return ThreadLocalRandom.current().nextInt(1000, 9999);
    }


    public static void main(String[] args) {

        Scanner NewClient = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = NewClient.nextLine();

        System.out.println("Digite o valor de deposito");
        String saldo = NewClient.nextLine();

        System.out.println("Obrigado por Estar com a gente");
        System.out.println(nome + ". Sua agencia é: " + agencia + " o numero da sua conta é: " + NumConta + " e Seu deposito inicial foi de  R$: "+ saldo );
    }

}
