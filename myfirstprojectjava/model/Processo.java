package com.mycompany.myfirstprojectjava.model;

import com.mycompany.myfirstprojectjava.model.Bloco;
import com.mycompany.myfirstprojectjava.model.Foliao;
import com.mycompany.myfirstprojectjava.model.Processo;
import com.mycompany.myfirstprojectjava.model.Transporte;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Processo {
    private List<Foliao> folioes;
    private List<Transporte> transportes;
    private List<Bloco> blocos;

    public Processo() {
        folioes = new ArrayList<>();
        transportes = new ArrayList<>();
        blocos = new ArrayList<>();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    criarFoliao(scanner);
                    break;
                case 2:
                    criarTransporte(scanner);
                    break;
                case 3:
                    criarBloco(scanner);
                    break;
                case 4:
                    exibirTodasInformacoes();
                    break;
                case 5:
                    System.out.println("Encerrando o processo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }

    private void exibirMenu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Criar Foliao");
        System.out.println("2. Criar Transporte");
        System.out.println("3. Criar Bloco");
        System.out.println("4. Exibir todas as informações");
        System.out.println("5. Sair");
    }

    private void criarFoliao(Scanner scanner) {
        System.out.println("Digite o CPF do folião:");
        String cpf = scanner.nextLine();

        System.out.println("Digite o RG do folião:");
        String rg = scanner.nextLine();

        System.out.println("Digite o nome do folião:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do folião:");
        int idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Foliao foliao = new Foliao(cpf, rg, nome, idade);

        if (!transportes.isEmpty()) {
            System.out.println("Transportes disponíveis:");
            exibirTransportes();
            System.out.println("Digite o ID do transporte para registrar o folião:");
            int idTransporte = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            Transporte transporte = buscarTransportePorId(idTransporte);
            if (transporte != null) {
                foliao.registra(transporte);
            } else {
                System.out.println("Transporte não encontrado.");
            }
        }

        folioes.add(foliao);
        System.out.println("Folião registrado com sucesso!");
    }

    private void criarTransporte(Scanner scanner) {
        System.out.println("Digite o ID do transporte:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite o nome do transporte:");
        String nome = scanner.nextLine();

        System.out.println("Digite o tipo do transporte:");
        String tipo = scanner.nextLine();

        System.out.println("Digite o valor do transporte:");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite a capacidade do transporte:");
        int capacidade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite o horário de saída do transporte:");
        int saida = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite o local de saída do transporte:");
        String localSaida = scanner.nextLine();

        System.out.println("Digite o horário de retorno do transporte:");
        int retorno = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite o local de retorno do transporte:");
        String localRetorno = scanner.nextLine();

        System.out.println("Digite o horário de chegada do transporte:");
        int chegada = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite o local de chegada do transporte:");
        String localChegada = scanner.nextLine();

        Transporte transporte = new Transporte(id, nome, tipo, valor, capacidade, saida, localSaida, retorno,
                localRetorno, chegada, localChegada);

        if (!blocos.isEmpty()) {
            System.out.println("Blocos disponíveis:");
            exibirBlocos();
            System.out.println("Digite o ID do bloco para designar o transporte:");
            int idBloco = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            Bloco bloco = buscarBlocoPorId(idBloco);
            if (bloco != null) {
                transporte.vaiPara(bloco);
            } else {
                System.out.println("Bloco não encontrado.");
            }
         }


        transportes.add(transporte);
        System.out.println("Transporte registrado com sucesso!");
    }

    private void criarBloco(Scanner scanner) {
        System.out.println("Digite o ID do bloco:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        System.out.println("Digite o nome do bloco:");
        String nome = scanner.nextLine();

        System.out.println("Digite o local do bloco:");
        String local = scanner.nextLine();

        System.out.println("Digite o horário de saída do bloco:");
        int saida = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Bloco bloco = new Bloco(id, nome, local, saida);

        if (!transportes.isEmpty()) {
            System.out.println("Transportes disponíveis:");
            exibirTransportes();
            System.out.println("Digite o ID do transporte para designar o bloco:");
            int idTransporte = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            Transporte transporte = buscarTransportePorId(idTransporte);
            if (transporte != null) {
                transporte.vaiPara(bloco);
            } else {
                System.out.println("Transporte não encontrado.");
            }
        }

        blocos.add(bloco);
        System.out.println("Bloco registrado com sucesso!");
    }

    private void exibirTodasInformacoes() {
    System.out.println("***** FOLIOES *****");
    for (Foliao foliao : folioes) {
        System.out.println("CPF: " + foliao.getCpf());
        System.out.println("RG: " + foliao.getRg());
        System.out.println("Nome: " + foliao.getNome());
        System.out.println("Idade: " + foliao.getIdade());
        System.out.println("Transporte: " + (foliao.getTransporte() != null ? foliao.getTransporte().getNome() : "Nenhum"));
        System.out.println();
    }

    System.out.println("***** TRANSPORTES *****");
    for (Transporte transporte : transportes) {
        System.out.println("ID: " + transporte.getId());
        System.out.println("Nome: " + transporte.getNome());
        System.out.println("Tipo: " + transporte.getTipo());
        System.out.println("Valor: " + transporte.getValor());
        System.out.println("Capacidade: " + transporte.getCapacidade());
        System.out.println("Saída: " + transporte.getSaida());
        System.out.println("Local de Saída: " + transporte.getLocalSaida());
        System.out.println("Retorno: " + transporte.getRetorno());
        System.out.println("Local de Retorno: " + transporte.getLocalRetorno());
        System.out.println("Chegada: " + transporte.getChegada());
        System.out.println("Local de Chegada: " + transporte.getLocalChegada());
        System.out.println("Bloco: " + (transporte.getBloco() != null ? transporte.getBloco().getNome() : "Nenhum"));
        System.out.println();
    }

    System.out.println("***** BLOCOS *****");
    for (Bloco bloco : blocos) {
        System.out.println("ID: " + bloco.getId());
        System.out.println("Nome: " + bloco.getNome());
        System.out.println("Local: " + bloco.getLocal());
        System.out.println("Saída: " + bloco.getSaida());
        System.out.println();
    }
}


    private Transporte buscarTransportePorId(int id) {
        for (Transporte transporte : transportes) {
            if (transporte.getId() == id) {
                return transporte;
            }
        }
        return null;
    }

    private Bloco buscarBlocoPorId(int id) {
        for (Bloco bloco : blocos) {
            if (bloco.getId() == id) {
                return bloco;
            }
        }
        return null;
    }

    private void exibirTransportes() {
        for (Transporte transporte : transportes) {
            System.out.println("ID: " + transporte.getId() + " | Nome: " + transporte.getNome());
        }
    }

    private void exibirBlocos() {
        for (Bloco bloco : blocos) {
            System.out.println("ID: " + bloco.getId() + " | Nome: " + bloco.getNome());
        }
    }

    public static void main(String[] args) {
        Processo processo = new Processo();
        processo.iniciar();
    }
}

