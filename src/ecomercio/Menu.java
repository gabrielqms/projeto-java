package ecomercio;

import ecomercio.model.Carrinho;
import ecomercio.model.Produto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Carrinho carrinho = new Carrinho();

		int opcao;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                MERCADO PRESO                        ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Ver Carrinho                         ");
			System.out.println("            2 - Colocar no Carrinho                  ");
			System.out.println("            3 - Finalizar                            ");
			System.out.println("            4 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                leia.nextLine();
                continue;
            }
			
			if (opcao == 5) {
				System.out.println("\nMercado Preso - Seu Destino para Compras Confiáveis.");
                leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Ver Carrinho\n\n");
					carrinho.verCarrinho();
					break;
				case 2:
					System.out.println("Colocar no Carrinho\n\n");
					exibirProdutos();
					int produtoEscolhido;
					try {
						produtoEscolhido = leia.nextInt();
					}catch (InputMismatchException e) {
						System.out.println("Por favor, insira um número válido");
						leia.nextLine();
						continue;
					}
					adicionarProdutoAoCarrinho(carrinho, produtoEscolhido);
					break;
				case 3:
					System.out.println("Finalizar\n\n");
					carrinho.finalizarCompra();
					break;
				case 4:
					System.out.println("Sair\n\n");
					System.exit(0);
					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					
					break;
			}
		}
	}
	
	 private static void exibirProdutos() {
	        System.out.println("Escolha um produto:");
	        System.out.println("1- Camisa R$ 50");
	        System.out.println("2- Calça  R$ 80");
	        System.out.println("3- Tênis  R$ 130");
	    }
	 
	 private static void adicionarProdutoAoCarrinho(Carrinho carrinho, int produtoEscolhido) {
	        switch (produtoEscolhido) {
	            case 1:
	                carrinho.adicionarProduto(new Produto("Camisa", 50.0));
	                break;
	            case 2:
	                carrinho.adicionarProduto(new Produto("Calça", 80.0));
	                break;
	            case 3:
	                carrinho.adicionarProduto(new Produto("Tênis", 130.0));
	                break;
	            default:
	                System.out.println("Produto não reconhecido.");
	                break;
	        }
	 	}
	}
