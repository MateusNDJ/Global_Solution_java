import java.util.HashMap;
import java.util.Scanner;

public class MarineDefense {
    private HashMap<String, Habitat> habitats;
    private HashMap<String, Animal> animais;

    public MarineDefense() {
        habitats = new HashMap<>();
        habitats.put("Recifes de coral", new Habitat("Recifes de coral", "Os recifes de coral são alguns dos ecossistemas mais biodiversos do planeta, abrigando inúmeras espécies marinhas."));
        habitats.put("Manguezais", new Habitat("Manguezais", "Os manguezais são ecossistemas costeiros tropicais que desempenham um papel crucial na proteção contra a erosão costeira."));
        habitats.put("Prados de ervas marinhas", new Habitat("Prados de ervas marinhas", "Os prados de ervas marinhas são importantes habitats de alimentação e berçários para muitas espécies marinhas."));
        habitats.put("Florestas de algas", new Habitat("Florestas de algas", "As florestas de algas, especialmente as florestas de kelp, são habitats ricos que suportam uma grande diversidade de vida marinha."));
        habitats.put("Pântano Salgado", new Habitat("Pântano Salgado", "Os pântanos salgados são áreas costeiras inundadas regularmente pelas marés, fornecendo habitat para uma variedade de vida selvagem."));

        animais = new HashMap<>();
        animais.put("Tartaruga-de-pente", new Animal("Tartaruga-de-pente", "A tartaruga-de-pente é uma espécie de tartaruga marinha criticamente ameaçada, conhecida por seu bico estreito e serrilhado."));
        animais.put("Vaquita", new Animal("Vaquita", "A vaquita é uma espécie de golfinho extremamente rara, encontrada apenas no norte do Golfo da Califórnia."));
        animais.put("Golfinho do Rio", new Animal("Golfinho do Rio", "Os golfinhos do rio são espécies de golfinhos que vivem em rios, e muitas dessas espécies estão gravemente ameaçadas."));
        animais.put("Baleia Narval", new Animal("Baleia Narval", "A baleia narval é conhecida por sua presa longa e reta, uma característica distintiva dos machos. Esta espécie ártica está atualmente ameaçada pelo aquecimento global."));
        animais.put("Tartaruga Verde", new Animal("Tartaruga Verde", "A tartaruga verde é uma grande espécie de tartaruga marinha que passa a maior parte de sua vida em habitats de águas costeiras e manguezais."));
    }

    public void visualizarHabitats() {
        System.out.println("Habitats Marinhos em Extinção:");
        for (String habitat : habitats.keySet()) {
            System.out.println(habitat);
        }
    }

    public void visualizarAnimais() {
        System.out.println("Animais Marinhos em Extinção:");
        for (String animal : animais.keySet()) {
            System.out.println(animal);
        }
    }

    public void visualizarDescricaoHabitat(String habitat) {
        if (habitats.containsKey(habitat)) {
            System.out.println(habitats.get(habitat).getDescricao());
        } else {
            System.out.println("Habitat não encontrado.");
        }
    }

    public void visualizarDescricaoAnimal(String animal) {
        if (animais.containsKey(animal)) {
            System.out.println(animais.get(animal).getDescricao());
        } else {
            System.out.println("Animal não encontrado.");
        }
    }

    public static void main(String[] args) {
        MarineDefense md = new MarineDefense();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Visualizar habitats em extinção");
            System.out.println("2. Visualizar animais em extinção");
            System.out.println("3. Visualizar descrição de um habitat");
            System.out.println("4. Visualizar descrição de um animal");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            if (opcao == 1) {
                md.visualizarHabitats();
            } else if (opcao == 2) {
                md.visualizarAnimais();
            } else if (opcao == 3) {
                System.out.print("Digite o nome do habitat: ");
                String habitat = scanner.nextLine();
                md.visualizarDescricaoHabitat(habitat);
            } else if (opcao == 4) {
                System.out.print("Digite o nome do animal: ");
                String animal = scanner.nextLine();
                md.visualizarDescricaoAnimal(animal);
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
