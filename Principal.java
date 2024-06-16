import java.util.Scanner;


public class Principal {
    private static Cronograma cronograma = new Cronograma();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = 0;

        do {
            System.out.println("1. Inserir Alimento");
            System.out.println("2. Alterar Alimento");
            System.out.println("3. Remover Alimento");
            System.out.println("4. Listar Alimentos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    inserirAlimento();
                    break;
                case 2:
                    alterarAlimento();
                    break;
                case 3:
                    removerAlimento();
                    break;
                case 4:
                    listarAlimentos();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);
    }

    private static void inserirAlimento() {
        System.out.print("Digite o nome do alimento: ");
        String nome = scanner.nextLine();
        System.out.print("Digite as calorias do alimento: ");
        int calorias = scanner.nextInt();
        scanner.nextLine();  
        Alimento alimento = new Alimento(nome, calorias);
        cronograma.adicionarAlimento(alimento);
        System.out.println("Alimento inserido com sucesso.");
    }

    private static void alterarAlimento() {
        listarAlimentos();
        System.out.print("Digite o índice do alimento a ser alterado: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Digite o novo nome do alimento: ");
        String nome = scanner.nextLine();
        System.out.print("Digite as novas calorias do alimento: ");
        int calorias = scanner.nextInt();
        scanner.nextLine();
        Alimento alimento = new Alimento(nome, calorias);
        cronograma.alterarAlimento(index, alimento);
        System.out.println("Alimento alterado com sucesso.");
    }

    private static void removerAlimento() {
        listarAlimentos();
        System.out.print("Digite o índice do alimento a ser removido: ");
        int index = scanner.nextInt();
        scanner.nextLine();  
        Alimento alimento = cronograma.listarAlimentos().get(index);
        cronograma.removerAlimento(alimento);
        System.out.println("Alimento removido com sucesso.");
    }

    private static void listarAlimentos() {
        System.out.println("Lista de Alimentos:");
        for (int i = 0; i < cronograma.listarAlimentos().size(); i++) {
            System.out.println(i + ". " + cronograma.listarAlimentos().get(i).toString());
        }
    }
}
