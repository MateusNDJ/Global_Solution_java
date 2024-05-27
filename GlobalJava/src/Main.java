import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MarineDefense md = new MarineDefense();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Visualizar habitats em extinção");
            System.out.println("2. Visualizar animais em extinção");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                md.visualizarHabitats();
            } else if (opcao == 2) {
                md.visualizarAnimais();
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
