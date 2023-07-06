package Classes;

public class ProdutoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produtos p1 = new Produtos();
		p1.nome = "Notebook";
		p1.preco = 4356.99;
		p1.desconto = 0.25;
		
		Produtos p2 = new Produtos();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.3;
		
		
		double precoFinal = p1.precoComDesconto (p1.desconto);
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println(p1.nome+", "+p1.preco+", " +precoFinal);
		System.out.println(p2.nome+", "+p2.preco+", " +precoFinal2);
		

	}

}
