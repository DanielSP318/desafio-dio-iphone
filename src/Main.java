import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone meuIphone = new Iphone();

        // Testando reprodutor musical
        System.out.println("Digite a música que deseja tocar:");
        String musica = scanner.nextLine();
        meuIphone.selecionarMusica(musica);
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando aparelho telefônico
        System.out.println("Digite o número para ligar:");
        String numero = scanner.nextLine();
        meuIphone.ligar(numero);
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando navegador de internet
        System.out.println("Digite a URL para acessar:");
        String url = scanner.nextLine();
        meuIphone.exibirPagina(url);
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();

        scanner.close();
    }
}
