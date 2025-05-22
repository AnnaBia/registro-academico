import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[10];
        double total = 0, totalBasico = 0, totalMedio = 0, totalSuperior = 0;
        int funcionarioContador = 0;
        int funcBasicoContador = 0;
        int funcMedioContador = 0;
        int funcGraduadoContador = 0;

        // 40% Ensino Básico → 4 funcionários
        funcionarios[0] = new FuncionarioEnsinoBasico("Ana", 1, 2000, "Escola A");
        funcionarios[1] = new FuncionarioEnsinoBasico("Carlos", 2, 2100, "Escola B");
        funcionarios[2] = new FuncionarioEnsinoBasico("Marina", 3, 1900, "Escola C");
        funcionarios[3] = new FuncionarioEnsinoBasico("José", 4, 2200, "Escola D");

        // 40% Ensino Médio → 4 funcionários
        funcionarios[4] = new FuncionarioEnsinoMedio("Bruna", 5, 2500, "Colégio A");
        funcionarios[5] = new FuncionarioEnsinoMedio("Felipe", 6, 2600, "Colégio B");
        funcionarios[6] = new FuncionarioEnsinoMedio("Luciana", 7, 2550, "Colégio C");
        funcionarios[7] = new FuncionarioEnsinoMedio("Ricardo", 8, 2450, "Colégio D");

        // 20% Nível Superior → 2 funcionários
        funcionarios[8] = new FuncionarioGraduado("Paula", 9, 3200, "Universidade A");
        funcionarios[9] = new FuncionarioGraduado("Tiago", 10, 3100, "Universidade B");

        System.out.println("Cadastro de funcionários:");

        /**
        // 4 do ensino básico
        for (funcBasicoContador = 0; funcBasicoContador < 4; funcBasicoContador++) {
            System.out.println("Funcionário Ensino Básico #" + (funcBasicoContador + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            int codigo = validaCodigo(scanner);
            double renda = validaRenda(scanner);

            System.out.print("Escola: ");
            String escola = scanner.nextLine();

            funcionarios[funcBasicoContador] = new FuncionarioEnsinoBasico(nome, codigo, renda, escola);
        }

        // 4 do ensino médio
        for (funcMedioContador = 4; funcMedioContador < 8; funcMedioContador++) {
            System.out.println("Funcionário Ensino Médio #" + (funcMedioContador - 3));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            int codigo = validaCodigo(scanner);
            double renda = validaRenda(scanner);

            System.out.print("Escola: ");
            String escola = scanner.nextLine();

            funcionarios[funcMedioContador] = new FuncionarioEnsinoMedio(nome, codigo, renda, escola);
        }

        // 2 do ensino superior
        for (funcGraduadoContador = 8; funcGraduadoContador < 10; funcGraduadoContador++) {
            System.out.println("Funcionário Graduado #" + (funcGraduadoContador - 7));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            int codigo = validaCodigo(scanner);
            double renda = validaRenda(scanner);
            System.out.print("Faculdade: ");
            String faculdade = scanner.nextLine();

            funcionarios[funcGraduadoContador] = new FuncionarioGraduado(nome, codigo, renda, faculdade);
        }*/

        System.out.println("=== Funcionários ===");

        for (funcionarioContador = 0; funcionarioContador < funcionarios.length; funcionarioContador++) {
            Funcionario f = funcionarios[funcionarioContador];
            System.out.println(f.getDescricao());
            total += f.getRendaBase();

            if (f instanceof FuncionarioEnsinoBasico) {
                totalBasico += f.getRendaBase();
            } else if (f instanceof FuncionarioEnsinoMedio) {
                totalMedio += f.getRendaBase();
            } else if (f instanceof FuncionarioGraduado) {
                totalSuperior += f.getRendaBase();
            }
        }

        System.out.printf("\nTotal com salários: R$ %.2f%n", total);
        System.out.printf("Custo com Ensino Básico: R$ %.2f%n", totalBasico);
        System.out.printf("Custo com Ensino Médio: R$ %.2f%n", totalMedio);
        System.out.printf("Custo com Ensino Superior: R$ %.2f%n", totalSuperior);
    }

    public static int validaCodigo(Scanner codigo) {
        int valor;
        while (true) {
            try {
                System.out.print("Código: ");
                valor = Integer.parseInt(codigo.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro válido.");
            }
        }
    }

    public static double validaRenda(Scanner renda) {
        double valor;
        while (true) {
            try {
                System.out.print("Renda base: R$ ");
                valor = Double.parseDouble(renda.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida! Por favor, digite um número válido (ex: 1234.56).");
            }
        }
    }
}
