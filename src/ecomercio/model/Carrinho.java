package ecomercio.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Produto> itens;
    private double total;

    public Carrinho() {
        this.itens = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarItem(Produto produto, int quantidade) {
       
    }

    public void removerItem(Produto produto) {
        
    }

    public List<Produto> getItens() {
        return itens;
    }

    public double getTotal() {
        return total;
    }
}
