package ecomercio.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Produto> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
    	this.itens.add(produto);
    	System.out.println(produto.getNome() + "adicionado ao carrinho.");
       
    }

    public void verCarrinho() {
    	if(itens.isEmpty()) {
    		System.out.println("Carrinho vazio.");
    	}else {
    		System.out.println("Itens no carrinho");
    		for (Produto produto : itens) {
    			System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
    		}
    	}
    }
    
    public void finalizarCompra() {
    	double total = calcularTotal();
    	System.out.println("Compra finalizada. Total: R$ " + total);
    	itens.clear();
    }
    
    private double calcularTotal() {
    	double total = 0.0;
    	for(Produto produto : itens) {
    		total += produto.getPreco();
    	}
    	return total;
    }
}
