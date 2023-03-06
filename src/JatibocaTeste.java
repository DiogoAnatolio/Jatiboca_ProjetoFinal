
import java.util.Scanner;

public class JatibocaTeste {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int opcao = 0, escolha = 0;
        int estoqueAtualJatiboca = 0, estoqueAtualPontal = 0, quantidadeEntrada = 0, quantidadeTransferencia = 0;


        do {
            System.out.println("O que deseja fazer: ");
            System.out.println("1 - Entrada de Estoque");
            System.out.println("2 - Saida de Estoque");
            System.out.println("3 - Transferenncia de Estoque");
            System.out.println("4 - Consulta Estoque");
            System.out.println("5 - Finalizar ");

            opcao = ler.nextInt();

            do {

                if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5) {

                    System.out.println("Escolha apenas entre os numeros 1, 2, 3, 4 e 5. ");
                    escolha = ler.nextInt();
                }

            } while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5);


            if (opcao != 5) {

                switch (opcao) {
                    case 1:
                        System.out.println("Opicao -> 1");
                        System.out.println("Qual empresa:");
                        System.out.println("1 - Jatiboca");
                        System.out.println("2 - Pontal");

                        escolha = ler.nextInt();
                        do {
                            if (escolha != 1 && escolha != 2) {

                                System.out.println("Escolha apenas entre os numeros 1 e 2 ");
                                System.out.println("Qual empresa:");
                                System.out.println("1 - Jatiboca");
                                System.out.println("2 - Pontal");
                                escolha = ler.nextInt();
                            }

                        } while (escolha != 1 && escolha != 2);

                        System.out.println("Opcao -> " + escolha);

                        if (escolha == 1) {
                            System.out.println("Qual a quantidade de Entrada de acucar em Jatiboca -> ");
                            quantidadeEntrada = ler.nextInt();

                            do {
                                if (quantidadeEntrada <= 0) {

                                    System.out.println("Desculpa, mas esse valor nao e aceitavel");
                                    System.out.println("Digite novamente, qual a quantidade de Entrada de acucar em Jatiboca -> ");
                                    quantidadeEntrada = ler.nextInt();
                                }

                            } while (quantidadeEntrada <= 0);

                            estoqueAtualJatiboca += quantidadeEntrada;

                            System.out.println("Estoque Atualizado em Jatiboca -> " + estoqueAtualJatiboca + " kg");
                            break;
                        } else {

                            System.out.println("Qual a quantidade de Entrada de acucar em Pontal -> ");
                            quantidadeEntrada = ler.nextInt();

                            do {
                                if (quantidadeEntrada <= 0) {

                                    System.out.println("Desculpa, mas esse valor nao e aceitavel");
                                    System.out.println("Digite novamente, qual a quantidade de Entrada de aï¿½ï¿½car em Pontal -> ");
                                    quantidadeEntrada = ler.nextInt();
                                }

                            } while (quantidadeEntrada <= 0);

                            estoqueAtualPontal += quantidadeEntrada;

                            System.out.println("Estoque Atualizado em Pontal -> " + estoqueAtualPontal + " kg");
                        }

                        break;

                    case 2:
                        System.out.println("Opicao -> 2");
                        System.out.println("Qual empresa:");
                        System.out.println("1 - Jatiboca");
                        System.out.println("2 - Pontal");

                        escolha = ler.nextInt();

                        do {
                            if (escolha != 1 && escolha != 2) {

                                System.out.println("Escolha apenas entre os numeros 1 e 2 ");
                                System.out.println("Qual empresa:");
                                System.out.println("1 - Jatiboca");
                                System.out.println("2 - Pontal");
                                escolha = ler.nextInt();
                            }

                        } while (escolha != 1 && escolha != 2);

                        System.out.println("Opicao -> " + escolha);

                        if (escolha == 1) {
                            System.out.println("Qual a quantidade de Saida de acucar em Jatiboca -> ");
                            quantidadeEntrada = ler.nextInt();

                            do {
                                if (quantidadeEntrada > estoqueAtualJatiboca) {

                                    System.out.println("Desculpa, mas esse valor nao e aceitavel");
                                    System.out.println("Digite novamente, qual a quantidade de Saida de acucar em Jatiboca -> ");
                                    quantidadeEntrada = ler.nextInt();
                                }

                            } while (quantidadeEntrada > estoqueAtualJatiboca);

                            estoqueAtualJatiboca -= quantidadeEntrada;

                            System.out.println("Estoque Atualizado em Jatiboca -> " + estoqueAtualJatiboca + " kg");
                            break;
                        } else {

                            System.out.println("Qual a quantidade de SSaida de acucar em Pontal -> ");
                            quantidadeEntrada = ler.nextInt();

                            do {
                                if (quantidadeEntrada > estoqueAtualPontal) {

                                    System.out.println("Desculpa, mas esse valor nao e aceitavel");
                                    System.out.println("Digite novamente, qual a quantidade de Saida de acucar em Pontal -> ");
                                    quantidadeEntrada = ler.nextInt();
                                }

                            } while (quantidadeEntrada > estoqueAtualPontal);

                            estoqueAtualPontal -= quantidadeEntrada;

                            System.out.println("Estoque Atualizado em Pontal -> " + estoqueAtualPontal + " kg");
                        }

                        break;

                    case 3:
                        System.out.println("Opicao -> 3");
                        System.out.println("Qual empresa:");
                        System.out.println("1 - Jatiboca");
                        System.out.println("2 - Pontal");

                        escolha = ler.nextInt();

                        do {
                            if (escolha != 1 && escolha != 2) {

                                System.out.println("Escolha apenas entre os numeros 1 e 2 ");
                                System.out.println("Qual empresa:");
                                System.out.println("1 - Jatiboca");
                                System.out.println("2 - Pontal");
                                escolha = ler.nextInt();
                            }

                        } while (escolha != 1 && escolha != 2);

                        System.out.println("Opicao -> " + escolha);

                        if (escolha == 1) {

                            System.out.println("Qual a quantidade de acucar para a transferencia de - Jatiboca para Pontal -> ");
                            quantidadeTransferencia = ler.nextInt();

                            do {
                                if (quantidadeTransferencia > estoqueAtualJatiboca || quantidadeTransferencia < 0) {

                                    System.out.println("Impossivel transferir de Jatiboca para Pontal, estoque insuficiente ou esse valor nao e aceitavel!");
                                    System.out.println("Informe porfavor, qual a quantidade de acucar para a transferencia de - Jatiboca para Pontal ->");
                                    quantidadeTransferencia = ler.nextInt();

                                }

                            } while (quantidadeTransferencia > estoqueAtualJatiboca);

                            System.out.println("Transferencia realizada com sucesso!");

                            estoqueAtualPontal += quantidadeTransferencia;
                            estoqueAtualJatiboca -= quantidadeTransferencia;

                            System.out.println("Estoque Atualizado em Pontal -> " + estoqueAtualPontal + " kg");
                            System.out.println("Estoque Atualizado em Jatiboca -> " + estoqueAtualJatiboca + " kg");

                            break;

                        } else {

                            System.out.println("Qual a quantidade de acucar para a transferencia de acucar - Pontal para Jatiboca -> ");
                            quantidadeTransferencia = ler.nextInt();

                            do {
                                if (quantidadeTransferencia > estoqueAtualPontal || quantidadeTransferencia < 0) {

                                    System.out.println("Impossivel transferir de Pontal para Jatiboca, estoque insuficiente ou esse valor nao e aceitavel!!");
                                    System.out.println("Informe porfavor, qual a quantidade de acucar para a transferencia de - Pontal para Jatiboca ->");
                                    quantidadeTransferencia = ler.nextInt();

                                }

                            } while (quantidadeTransferencia > estoqueAtualPontal);

                            System.out.println("Transferencia realizada com sucesso!");

                            estoqueAtualJatiboca += quantidadeTransferencia;
                            estoqueAtualPontal -= quantidadeTransferencia;

                            System.out.println("Estoque Atualizado em Pontal -> " + estoqueAtualPontal + " kg");
                            System.out.println("Estoque Atualizado em Jatiboca -> " + estoqueAtualJatiboca + " kg");

                            break;
                        }

                    case 4:
                        System.out.println("Opicao -> 4");

                        System.out.println("Estoque Atualizado em Pontal -> " + estoqueAtualPontal + " kg");
                        System.out.println("Estoque Atualizado em Jatiboca -> " + estoqueAtualJatiboca + " kg");

                        break;


                }

            }

            System.out.println("Opicao -> 5");
            System.out.println("Bom dia e um bom trabalho !!!");
        } while (opcao != 5);

    }
}