package Classes;

public class Produtos {
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - descontoDoGerente);
	}
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

}
